package tk.chuanjing.chapter01.action;


/**
 * @author ChuanJing
 * @date 2017年7月8日 下午3:16:48
 * @version 1.0
 */
public class Struts2Demo1Action {

	public void show() {
		System.out.println("Struts2Demo1Action......");
	}
	
	/**
	 * 如果struts.xml中没有配置  执行的方法，默认执行这个方法
	 */
	public void execute() {
		System.out.println("Struts2Demo1Action......execute");
	}

}
