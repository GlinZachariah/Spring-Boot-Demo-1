package com.demo;

import java.util.Arrays;
import java.util.List;

public class UserDetails {
	private int userid;
	private String username;
	private int age;
	private String role;
	
	public static List<UserDetails> customList = Arrays.asList(
			new UserDetails(101,"Jim",25,"Student"),
			new UserDetails(102,"Thomas",21,"Mentor"),
			new UserDetails(103,"Tim",24,"Instructor")
			) ;
	
	
	public UserDetails(int userid, String username, int age, String role) {
		super();
		this.userid = userid;
		this.username = username;
		this.age = age;
		this.role = role;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
}
