package com.wemallDubbo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "student")
public class Student implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private int id;//
	@Column(name = "name")
    private String name;//
	@Column(name = "age")
    private int age;//
	@Column(name = "createTime")
    private Date createTime;//
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age
				+ ", createTime=" + createTime + "]";
	}
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
