package tk.chuanjing.chapter01.action;
/**
 * @author ChuanJing
 * @date 2017年7月8日 下午4:03:06
 * @version 1.0
 */
public class LoginAction {

	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String login() {
		if ("tom".equals(username) && "123".equals(password)) {
			return "success";
		} else {
			return "failer";
		}
	}
}
