package tk.chuanjing.chapter03.Annotation.action;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import tk.chuanjing.chapter03.Annotation.domain.User;
import tk.chuanjing.chapter03.Annotation.service.IUserService;
import tk.chuanjing.chapter03.Annotation.service.UserServiceImpl;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author ChuanJing
 * @date 2017年7月14日 上午12:45:29
 * @version 1.0
 */
@Namespace("/")
@ParentPackage("struts-default")
public class UserAction extends ActionSupport implements ModelDriven<User> {
	
	private static final long serialVersionUID = 1L;
	
	private User user = new User();

	@Override
	public User getModel() {
		return user;
	}
	
	@Action(value="user_login",
			results={@Result(name="success",location="/jspChapter03/Product.jsp"),
					 @Result(name="error",location="/jspChapter03/Login4.jsp")})
	public String login() {
		IUserService us = new UserServiceImpl();
		User existUser = us.login(user.getUsername(), user.getPassword());
		
		if(existUser != null) {
			// 将用户存储到session中
			ServletActionContext.getRequest().getSession().setAttribute("existUser", existUser);
			return "success";
		} else {
			this.addActionError("用户名或密码错误");
			return "error";
		}
		
	}
}
