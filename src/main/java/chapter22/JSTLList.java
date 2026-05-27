package chapter22;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import beans.ProductBeans;
import dao.JSTLProductDAO;

/**
 * Servlet implementation class JSTLList
 */
@WebServlet("/chapter22/jstl-list")
public class JSTLList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JSTLList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		try {
			JSTLProductDAO dao=new JSTLProductDAO();
			List<ProductBeans> list=dao.search("");
			
			int total = 0;
			
			for(ProductBeans product : list){
				total += product.getPrice();
			}
			
			request.setAttribute("list", list);
			request.setAttribute("total", total);
			
			request.getRequestDispatcher("jstl.jsp").forward(request, response);
			
		} catch(Exception e) {
			e.printStackTrace(out);
		}
}

}
