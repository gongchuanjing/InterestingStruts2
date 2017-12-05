package tk.chuanjing.chapter03.Annotation.utils;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import tk.chuanjing.chapter03.Annotation.domain.Result;
import tk.chuanjing.chapter03.Annotation.domain.User;

import com.alibaba.fastjson.JSONArray;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;


/**
 * @author ChuanJing
 * @date 2017年7月14日 上午2:37:56
 * @version 1.0
 */
public class LoginInterceptor extends MethodFilterInterceptor {

	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		
		// 得到session中的user
		User existUser = (User) ServletActionContext.getRequest().getSession().getAttribute("existUser");
		
		if(existUser!=null) {
			return invocation.invoke();
		} else {
			Result result = new Result();
			result.setType(0);
			result.setMessage("没有登陆，权限不足，请登录！");
			
			// 将ps转换成json
			String jsonString = JSONArray.toJSONString(result);
			
			// 通过response将json写回到浏览器
			response.getWriter().write(jsonString);
			return null;
		}
	}

}
