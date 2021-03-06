/**
 * All rights, including trade secret rights, reserved.
 */
package com.xyc.proj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "T_WORKER")
public class Worker {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "CODE")
	private String code;
	
	@Column(name = "ID_NO")
	private String idNo;
	
	@Column(name = "BIRTHDAY")
	private String birthday;
	
	@Column(name = "AREA_ID")
	private Long areaId; 
	
	@Transient
	private String areaName;
	
	@Column(name = "SUB_AREA")
	private String subArea; 
	
	@Column(name = "NATIVE_PLACE")
	private String nativePlace;
	
	@Column(name = "EDUCATION")
	private String education;
	
	@Transient
	private String educationText;
	
	@Column(name = "PHONE")
	private String phone; 
	
	@Column(name = "SERVICE_TYPE_ONE")
	private String serviceTypeOne; //服务类型，家政
	
	@Transient
	private String serviceTypeOneName; //服务类型，家政
	
	@Transient
	private String serviceTypeTwoName; //服务类型，家政
	
	@Column(name = "SERVICE_TYPE_TWO")
	private String serviceTypeTwo; //服务类型，家政
	
	@Column(name = "ROLE")
	private String role; //老师，阿姨
	
	@Transient
	private String roleName; 
	
	
	@Column(name = "TEACHER_ID")
	private Long teacherId; 
	
	@Column(name = "WORK_TIME")
	private String workTime; //白班，24H
	
	@Transient
	private String workTimeName; //白班，24H
	
	@Column(name = "STORE_ID")
	private Long storeId; 
	
	@Transient
	private String storeName;
	@Transient
	private String teacherName;
	
	public String getTeacherName() {
		return teacherName;
	}


	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}


	@Column(name = "CONSTELLATION")
	private String constellation;//星座
	
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "DESCR")
	private String descr;
	
	@Column(name = "SALARY")
	private Double salary;
	
	@Column(name = "STATE")
	private String state;
	
	
	@Column(name = "PASS_WORD")
	private String password;
	
	 
	public Worker() {
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getIdNo() {
		return idNo;
	}


	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public String getNativepPlace() {
		return nativePlace;
	}


	public void setNativepPlace(String nativepPlace) {
		this.nativePlace = nativepPlace;
	}


	public String getConstellation() {
		return constellation;
	}


	public void setConstellation(String constellation) {
		this.constellation = constellation;
	}


	public String getEducation() {
		return education;
	}


	public void setEducation(String education) {
		this.education = education;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


 


	public String getDescr() {
		return descr;
	}


	public void setDescr(String descr) {
		this.descr = descr;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	public String getNativePlace() {
		return nativePlace;
	}


	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}


	public String getServiceTypeOne() {
		return serviceTypeOne;
	}


	public void setServiceTypeOne(String serviceTypeOne) {
		this.serviceTypeOne = serviceTypeOne;
	}


	public String getServiceTypeTwo() {
		return serviceTypeTwo;
	}


	public void setServiceTypeTwo(String serviceTypeTwo) {
		this.serviceTypeTwo = serviceTypeTwo;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public Long getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Long getStoreId() {
		return storeId;
	}


	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}


	public Long getAreaId() {
		return areaId;
	}


	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}


 


	public String getSubArea() {
		return subArea;
	}


	public void setSubArea(String subArea) {
		this.subArea = subArea;
	}


	public String getEducationText() {
		return educationText;
	}


	public void setEducationText(String educationText) {
		this.educationText = educationText;
	}


	public String getWorkTime() {
		return workTime;
	}


	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}


	public String getAreaName() {
		return areaName;
	}


	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}


	public String getServiceTypeOneName() {
		return serviceTypeOneName;
	}


	public void setServiceTypeOneName(String serviceTypeOneName) {
		this.serviceTypeOneName = serviceTypeOneName;
	}


	public String getServiceTypeTwoName() {
		return serviceTypeTwoName;
	}


	public void setServiceTypeTwoName(String serviceTypeTwoName) {
		this.serviceTypeTwoName = serviceTypeTwoName;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public String getWorkTimeName() {
		return workTimeName;
	}


	public void setWorkTimeName(String workTimeName) {
		this.workTimeName = workTimeName;
	}


	public String getStoreName() {
		return storeName;
	}


	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	 
}
