package tk.chuanjing.chapter02.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import tk.chuanjing.chapter01.domain.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * @author ChuanJing
 * @date 2017年7月8日 下午4:03:06
 * @version 1.0
 */
public class LoginAction3 extends ActionSupport implements ModelDriven<User>, ServletRequestAware, ServletResponseAware, ServletContextAware {

	private static final long serialVersionUID = 1L;
	
	private HttpServletRequest request;
	private HttpServletResponse response;
	private ServletContext context;
	
	private User user = new User();
	
	@Override
	public User getModel() {
		return user;
	}

	public String login() {
		HttpServletRequest request = ServletActionContext.getRequest();
//		HttpServletResponse response = ServletActionContext.getResponse();
//		HttpSession session = request.getSession();
		
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
		
		// 判断用户名与密码是否正确
		if ("tom".equals(user.getUsername()) && "123".equals(user.getPassword())) {
			request.getSession().setAttribute("user", user);
			return "success";
		} else {
			// 向valueStack中存储错误信息
			ValueStack valueStack = ActionContext.getContext().getValueStack();
//			valueStack.set("msg", "用户名或者密码错误！");
			this.addActionError("用户名或者密码错误……");
			// this.addFieldError(fieldName, errorMessage);
			// this.addActionMessage(aMessage);
			return "failer";
		}
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public void setServletContext(ServletContext context) {
		this.context = context;
	}

}
