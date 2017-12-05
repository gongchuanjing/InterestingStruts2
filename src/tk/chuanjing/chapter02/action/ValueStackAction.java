package tk.chuanjing.chapter02.action;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import tk.chuanjing.chapter01.domain.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

/**
 * @author ChuanJing
 * @date 2017年7月10日 上午3:35:10
 * @version 1.0
 */
public class ValueStackAction extends ActionSupport implements ModelDriven<User> {

	private static final long serialVersionUID = 1L;
	
	private User user = new User();
	
	@Override
	public User getModel() {
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		return user;
	}

	@Override
	public String execute() throws Exception {
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		// 对模进行重新赋值
		user = new User();
		user.setUsername("fox");
		user.setPassword("456");
		
		// 1.从requet域中获取valueStack
//		HttpServletRequest request = ServletActionContext.getRequest();
//		ValueStack valueStack = (ValueStack) request.getAttribute(ServletActionContext.STRUTS_VALUESTACK_KEY);
		
		/*
		// 2.通过ActionContext来获取
		ActionContext context = ActionContext.getContext();
		ValueStack valueStack = context.getValueStack();
		
		// 3.向valueStack存储数据
		valueStack.push("itcast");// 向root中存储
		valueStack.set("name", "itheima");// 底层会创建一个HashMap，保存数据，在将hashMap存储到root中。
		*/
		
		// 自己测出来：ActionContext中存放Action相关信息，比如request，其实就是存在Map集合中
//		Map<String, Object> contextMap = context.getContextMap();
//		HttpServletRequest request = (HttpServletRequest) contextMap.get(ServletActionContext.HTTP_REQUEST);
//		System.out.println("user：" + request.getParameter("user"));
		return "success";
	}
	
	@Test
	public void test(){
		User u = new User();
		u.setPassword("123");
		u.setUsername("tom");
//		System.out.println(u);
		
		List<User> li = new ArrayList<User>();
		li.add(u);
		
		u = new User();
		u.setUsername("fox");
		u.setPassword("456");
//		System.out.println(u);
		
		System.out.println(li.toString());
	}
}
