package tk.chuanjing.chapter03.domain;

public class Result {

	private boolean flag; // 描述是否可用
	private String message; // 描述信息

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
