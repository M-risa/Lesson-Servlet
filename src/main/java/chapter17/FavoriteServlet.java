package chapter17;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import beans.Favorite;

/**
 * Servlet implementation class FavoriteServlet
 */
@WebServlet("/chapter17/favorite-servlet")
public class FavoriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FavoriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @SuppressWarnings("unchecked")
	protected void doPost(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		HttpSession session = request.getSession();
		
		List<Favorite> favList = (List<Favorite>)session.getAttribute("favoriteList");
		if(favList == null) {
			favList = new ArrayList<Favorite>();
		}
		
		Favorite fav = new Favorite();
		fav.setName(name);
		fav.setUrl(url);
		favList.add(fav);
		
		session.setAttribute("favoriteList", favList);
		
		request.getRequestDispatcher("favorites.jsp").forward(request, response);
	}

}
