package filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class PostFilter extends ZuulFilter{

	@Override
	public Object run() {
		 System.out.println("inside the response filter");
		    return null;}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		 return 1;
	}

	@Override
	public String filterType() {
		 return "post";
	}

}
