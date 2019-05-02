public class CServlet1 extends javax.servlet.http.HttpServlet{
	
	protected void 	doGet(HttpServletRequest req,	HttpServletResponse resp){
		resp.getWriter().println("Hello From  OpenShift servlet");
		return;

	}
}