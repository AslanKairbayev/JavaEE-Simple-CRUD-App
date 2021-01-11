import java.io.IOException;
import java.util.ArrayList;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import mysqlapp.business.Product;
import mysqlapp.business.ProductDB;
 
 
@WebServlet("/index")
public class IndexServlet extends HttpServlet {
     
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        ArrayList<Product> products = ProductDB.select();
        request.setAttribute("products", products);
          
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}