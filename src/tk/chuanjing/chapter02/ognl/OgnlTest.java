package tk.chuanjing.chapter02.ognl;

import java.util.HashMap;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

import org.junit.Test;


/**
 * @author ChuanJing
 * @date 2017年7月10日 上午12:52:58
 * @version 1.0
 */
public class OgnlTest {

	// 表达式 OgnlContext 上下文 Root 根
	@Test
	public void test1() throws OgnlException {
		// String s="hello";
		// int length = s.length();
		
		// 1.获取上下文对象OgnlContext 它就是一个java.util.Map
		OgnlContext context = new OgnlContext();
		
		// 2.操作
		Object root = context.getRoot();
		Object value = Ognl.getValue("'hello'.length()", context, root);
		System.out.println(value);
	}
	
	@Test
	public void test2() throws OgnlException {
		// double random = Math.random();
		// double pi = Math.PI;
		
		OgnlContext context = new OgnlContext();
		
		Object value = Ognl.getValue("@java.lang.Math@random()", context, context.getRoot());
		Object value2 = Ognl.getValue("@java.lang.Math@PI", context, context.getRoot());
	
		System.out.println(value+"    "+value2);
	}
	
	@Test
	public void test3() throws Exception {
		OgnlContext context = new OgnlContext();
		
		// 2.向上下文中存储数据
		context.put("username", "tom");
		
		Object value = Ognl.getValue("#username", context, context.getRoot());
		System.out.println(value);
	}
	
	@Test
	public void test4() throws Exception {
		OgnlContext context = new OgnlContext();
		context.put("username", "tom");
		
		// 存储数据
		Map<String, String> map = new HashMap<String, String>();
		map.put("username", "fox");
		
		// 将map存储到context的根中
		context.setRoot(map);
		
		Object value = Ognl.getValue("#username", context, context.getRoot());
		Object value2 = Ognl.getValue("username", context, context.getRoot());

		System.out.println(value+"    "+value2);
	}
	
	// 操作集合
	@Test
	public void test5() throws OgnlException {
		OgnlContext context = new OgnlContext();
		//相录于创建了一个List集合
		Object value = Ognl.getValue("{'hello','good','well'}", context, context.getRoot());
		System.out.println(value.getClass());
		context.setRoot(value);
		System.out.println(Ognl.getValue("[0]", context, context.getRoot()));
	
		//相当于创建了一个Map集合
		Object value2 = Ognl.getValue("#{'username':'jack', 'age':23}", context, context.getRoot());
		System.out.println(value2.getClass());
	}
	
	//支持表达式赋值及串联
	@Test
	public void test6() throws OgnlException {
		OgnlContext context = new OgnlContext();
		
		Object value = Ognl.getValue("#{'username':'jack', 'age':23}", context, context.getRoot());
		context.setRoot(value);
		
		Object value2 = Ognl.getValue("username='张三', age=22", context, context.getRoot());
		System.out.println(value2);
	}
}
