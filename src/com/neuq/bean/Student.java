package com.neuq.bean;

import java.io.Serializable;

/**
 * 学生类
 */
public class Student extends User implements Serializable{

	private static final long serialVersionUID = 1L;

	private String studentclass;
	private int id;
	private int ru=3;
	private String username;
	private String psd;
	private String realname;
	private String sex;
	private String telephone;
	private String email;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	@Override
	public int getRu() {
		return ru;
	}

	@Override
	public void setRu(int ru) {
		this.ru = ru;
	}

	@Override
	public String getUsername() {
		return username;
	}

	@Override
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPsd() {
		return psd;
	}

	public void setPsd(String psd) {
		this.psd = psd;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	@Override
	public String getSex() {
		return sex;
	}

	@Override
	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String getTelephone() {
		return telephone;
	}

	@Override
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}


	public Student(String username, String psd, String realname, String studentclass) {
		this.username = username;
		this.pwd = psd;
		this.name = realname;
		this.studentclass = studentclass;
		this.ru = 3;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", pwd=" + pwd + ", name=" + name + ", sex=" + sex
				+ ", studentclass=" + studentclass + ", telephone=" + telephone + ", email=" + email + ", ru=" + ru
				+ "]";
	}


	/**
	 * @param username 学生用户名
	 * @param pwd 学生密码
	 * @param name 学生姓名
	 * @param sex 学生性别
	 * @param studentclass 学生所在班级
	 * @param telephone 学生电话
	 * @param email 学生邮箱
	 * @param ru 管理员权限1，教师权限2，学生3
	 */
	public Student(String username, String pwd, String name, String sex, String studentclass, String telephone,
				   String email) {
		super();
		this.username = username;
		this.pwd = pwd;
		this.name = name;
		this.sex = sex;
		this.studentclass = studentclass;
		this.telephone = telephone;
		this.email = email;
		this.ru = 3;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}



	public String getStudentclass() {
		return studentclass;
	}
	public void setStudentclass(String studentclass) {
		this.studentclass = studentclass;
	}


}
