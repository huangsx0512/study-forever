package com.study.forever.dao.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

//AppArea
@Table(name="app_area")
public class AppArea implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//主键编号
	@Id
	@Column(name="area_id")
	private String areaId;
	//片区名称
	@Column(name="area_name")
	private String areaName;
	//添加用户
	@Column(name="add_user")
	private Integer addUser;
	//添加时间
	@Column(name="add_time")
	private java.util.Date addTime;
	//更新用户
	@Column(name="update_user")
	private Integer updateUser;
	//更新时间
	@Column(name="update_time")
	private java.util.Date updateTime;

	public String getAreaId() {
		return areaId;
	}
	public String getAreaName() {
		return areaName;
	}
	public Integer getAddUser() {
		return addUser;
	}
	public java.util.Date getAddTime() {
		return addTime;
	}
	public Integer getUpdateUser() {
		return updateUser;
	}
	public java.util.Date getUpdateTime() {
		return updateTime;
	}
	public void setAreaId(String areaId) {
		this.areaId=areaId;
	}
	public void setAreaName(String areaName) {
		this.areaName=areaName;
	}
	public void setAddUser(Integer addUser) {
		this.addUser=addUser;
	}
	public void setAddTime(java.util.Date addTime) {
		this.addTime=addTime;
	}
	public void setUpdateUser(Integer updateUser) {
		this.updateUser=updateUser;
	}
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime=updateTime;
	}
}
