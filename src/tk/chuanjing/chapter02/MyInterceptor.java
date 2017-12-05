package tk.chuanjing.chapter02;

import org.apache.struts2.ServletActionContext;

import tk.chuanjing.chapter01.domain.User;
import tk.chuanjing.chapter02.action.ProductAction;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;


/**
 * @author ChuanJing
 * @date 2017年7月11日 下午12:51:01
 * @version 1.0
 */
/*
public class MyInterceptor implements Interceptor{

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		if(user != null) {
			return invocation.invoke();
		} else {
			//得到访问的action
			ProductAction pa = (ProductAction) invocation.getAction();
			pa.addActionError("没有登录，权限不足！请登录！");
			return "login";
		}
	}

}
*/

public class MyInterceptor extends MethodFilterInterceptor{

	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		if(user != null) {
			return invocation.invoke();
		} else {
			//得到访问的action
			ProductAction pa = (ProductAction) invocation.getAction();
			pa.addActionError("没有登录，权限不足！请登录！");
			return "login";
		}
	}
	
}
