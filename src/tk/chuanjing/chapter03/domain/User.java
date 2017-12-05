package tk.chuanjing.chapter03.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;


public class User {

	private int id;
	private String name;
	private int age;
	@JSONField(format="yyyy-MM-dd")
	private Date birthday;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age
				+ ", birthday=" + birthday + "]";
	}
	
	

}
