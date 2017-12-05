package tk.chuanjing.chapter03.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.codehaus.jackson.map.ObjectMapper;

import tk.chuanjing.chapter03.domain.Result;

/**
 * @author ChuanJing
 * @date 2017年7月13日 上午3:38:50
 * @version 1.0
 */
public class UserAction {

	public void checkUsername() {
		HttpServletResponse response = ServletActionContext.getResponse();
		// 解决响应乱码
		response.setContentType("text/html;charset=UTF-8");
		
		String username = ServletActionContext.getRequest().getParameter("username");
		
		Result result = new Result();
		if("tom".equals(username)) {
			// 不可使用
			result.setFlag(false);
			result.setMessage("用户名已经被占用！");
		} else {
			// 可以使用
			result.setFlag(true);
			result.setMessage("用户名可用！");
		}
		
		// 3.将result转换成json响应到浏览器端
		ObjectMapper mapper = new ObjectMapper();
		try {
			String json = mapper.writeValueAsString(result);
			response.getWriter().println(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
