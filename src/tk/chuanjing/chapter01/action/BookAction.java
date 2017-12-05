package tk.chuanjing.chapter01.action;

import com.opensymphony.xwork2.ActionSupport;

public class BookAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	public String add(){
		System.out.println("bookAction  add....");
		return null;
	}
	public String del(){
		System.out.println("bookAction  del....");
		return null;
	}
	public String update(){
		System.out.println("bookAction  update....");
		return null;
	}
	public String find(){
		System.out.println("bookAction  find....");
		return null;
	}
}
