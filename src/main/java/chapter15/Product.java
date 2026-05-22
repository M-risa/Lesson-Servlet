package chapter15;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import beans.ProductBeans;
import dao.ProductDAO;

/**
 * Servlet implementation class Product
 */
@WebServlet(urlPatterns = {"/chapter15/product"})
public class Product extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(
			HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		String sortParam = request.getParameter("sort");
		
		String order = "ASC";
		
		
		if("desc".equalsIgnoreCase(sortParam)) {
			order = "DESC";
		}
		
		ProductDAO dao=new ProductDAO(); //DAOの呼び出し
		List<ProductBeans> list = dao.findAll(order);
		request.setAttribute("product", list);
		
		
		request.getRequestDispatcher("/chapter15/product.jsp").forward(request, response);
		
	}

}
