package com.durgasoft.formbeans;

import org.apache.struts.action.ActionForm;

public class LoginActionForm extends ActionForm {

	String uname ;
	String upwd ;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	} 
	
	
	
}
