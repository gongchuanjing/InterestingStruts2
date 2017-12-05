package tk.chuanjing.chapter03.Annotation.domain;

import java.util.List;

/**
 * @author ChuanJing
 * @date 2017年7月14日 上午1:40:52
 * @version 1.0
 */
public class Result<T> {

	private int type; // 信息状态 0错误 1正常
	private List<T> content; // 内容
	private String message; // 错误信息

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public List<T> getContent() {
		return content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
