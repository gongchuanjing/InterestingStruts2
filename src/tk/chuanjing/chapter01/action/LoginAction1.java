package tk.chuanjing.chapter01.action;

import tk.chuanjing.chapter01.domain.User;

/**
 * @author ChuanJing
 * @date 2017年7月8日 下午4:03:06
 * @version 1.0
 */
public class LoginAction1 {

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String login() {
		if ("tom".equals(user.getUsername()) && "123".equals(user.getPassword())) {
			return "success";
		} else {
			return "failer";
		}
	}
}
