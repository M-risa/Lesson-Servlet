package chapter19;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetNotice
 */
@WebServlet("/chapter19/set-notice")
public class SetNotice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetNotice() {
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
        response.setContentType("text/html; charset=UTF-8");
        
        String notice = request.getParameter("noticeContent");
        
        if(notice != null) {
	        ServletContext context = getServletContext();
	        
	        java.util.List<String> noticeList = (java.util.List<String>) context.getAttribute("appNoticeList");
	        
	        if(noticeList == null) {
	        	noticeList = new java.util.ArrayList<String>();
	        }
	        noticeList.add(0, notice);
	        
	       context.setAttribute("appNoticeList", noticeList);
	       request.setAttribute("message", "お知らせが設定されました！");
      
        }
       request.getRequestDispatcher("/chapter19/setnotice.jsp").forward(request, response);
       
	}

}
