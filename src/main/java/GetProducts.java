

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import petShopProject.*;
import db.productCnx;

/**
 * Servlet implementation class GetProducts
 */
@WebServlet("/*")
public class GetProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 public ProductsBean pb;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetProducts() {
        super();
        
		
        
        // TODO Auto-generated constructor stub
    }
    public void init() {
    	/*productCnx A = new productCnx();
    	
        A.getProducts();
        ArrayList<Product> prods= A.GetArrayproducts();
        pb = new ProductsBean();
        pb.setAllProducts(prods);
    	*/
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		/*request.setAttribute("ProductsBean", pb);
		RequestDispatcher rd = request.getRequestDispatcher("category.jsp");
		rd.forward(request, response);*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
