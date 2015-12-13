/**
 * All rights, including trade secret rights, reserved.
 */
package com.xyc.proj.entity;

public class SysUser {
 
	private long id;
	
	private String userName="";
	
	private String password="";
	private String staffName="";
	
	private String phoneNo="";
	 
	private String deptName;
	  
	private String roleName;
	
	private String sts;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	 
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSts() {
		return sts;
	}
	public void setSts(String sts) {
		this.sts = sts;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	 
	
}
