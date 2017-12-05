package tk.chuanjing.chapter01.action;

import tk.chuanjing.chapter01.domain.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author ChuanJing
 * @date 2017年7月8日 下午4:03:06
 * @version 1.0
 */
public class LoginAction2 implements Action, ModelDriven<User> {

	private User user = new User();
	
	@Override
	public User getModel() {
		return user;
	}

	public String login() {
		if ("tom".equals(user.getUsername()) && "123".equals(user.getPassword())) {
			return "success";
		} else {
			return "failer";
		}
	}

	@Override
	public String execute() throws Exception {
		return null;
	}
}
