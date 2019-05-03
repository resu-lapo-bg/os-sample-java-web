package vic.test1;
import java.util.Optional;
import java.util.function.Function;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class CServlet1 extends javax.servlet.http.HttpServlet{
	
	protected void 	doGet(HttpServletRequest req,	HttpServletResponse resp) throws java.io.IOException{
		Function<String, String> f1 = (String str1)->String.format("Hello,%s", str1);
		
		Optional.of("OpenShift servlet").map(f1).ifPresent(resp.getWriter()::println);
		//resp.getWriter().println("Hello From  OpenShift servlet");	
		
		return;

	}
}