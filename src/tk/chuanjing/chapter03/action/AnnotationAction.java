package tk.chuanjing.chapter03.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

/**
 * @author ChuanJing
 * @date 2017年7月13日 上午5:26:50
 * @version 1.0
 */

@Namespace("/")// 相当于  <package  namespace="/">
@ParentPackage("struts-default")// <package extends="struts-default">
public class AnnotationAction {

	// <action name="hello" class=""  method="">
	// <result name="" type="">/success.jsp</result>
	@Action(value="hello",results={@Result(name="success",location="/jspChapter03/Upload.jsp")})
	public String sayHello() {
		
		System.out.println("hello world");
		
		return "success";
	}
}
