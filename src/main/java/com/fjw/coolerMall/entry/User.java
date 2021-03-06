package com.fjw.coolerMall.entry;
import java.io.Serializable;

/**
 * user表
 * @author jiawei
 * 2018年7月29日下午6:26:22
 */

public class User implements Serializable {
	private static final long serialVersionUID = -2065084729621764539L;
	private Integer id;
	private String userName;  //登录名
	private String passWord;  //密码
	private String nickName;  //密码
	private Long phoneNumber; //已验证手机号码
	private String email;
	private String salt;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	
}
	
