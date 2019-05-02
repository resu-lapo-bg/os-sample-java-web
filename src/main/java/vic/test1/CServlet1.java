package vic.test1;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class CServlet1 extends javax.servlet.http.HttpServlet{
	
	protected void 	doGet(HttpServletRequest req,	HttpServletResponse resp) throws java.io.IOException{
		resp.getWriter().println("Hello From  OpenShift servlet");
		return;

	}
}