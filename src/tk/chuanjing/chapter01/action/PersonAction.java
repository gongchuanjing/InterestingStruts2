package tk.chuanjing.chapter01.action;

import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	public String add(){
		System.out.println("personAction  add....");
		return null;
	}
	public String del(){
		System.out.println("personAction  del....");
		return null;
	}
	public String update(){
		System.out.println("personAction  update....");
		return null;
	}
	public String find(){
		System.out.println("personAction  find....");
		return null;
	}
}
