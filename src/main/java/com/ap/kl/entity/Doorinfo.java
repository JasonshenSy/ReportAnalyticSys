package com.ap.kl.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 门信息
 *
 */
@TableName(value = "DOORINFO")
public class Doorinfo implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 序号 */
	@TableId
	private Integer ID;

	/** 门ID */
	@TableField(value = "DOOR_ID")
	private String DOOR_ID;

	/** 区域ID */
	@TableField(value = "AREA_ID")
	private String AREA_ID;

	/** 门安装位置名称 */
	@TableField(value = "DOOR_NAME")
	private String DOOR_NAME;

	/** 门类型 */
	@TableField(value = "DOOR_TYPE")
	private Integer DOOR_TYPE;

	/** 备考1 */
	private String REF1;

	/** 备考2 */
	private String REF2;

	/** 备考3 */
	private String REF3;

	/** 备考4 */
	private String REF4;

	/** 登录时间 */
	@TableField(value = "INSERT_TIME")
	private Date INSERT_TIME;

	/** 登录人 */
	@TableField(value = "INSERT_USER")
	private String INSERT_USER;

	/** 更新时间 */
	@TableField(value = "UPDATE_TIME")
	private Date UPDATE_TIME;

	/** 更新人 */
	@TableField(value = "UPDATE_USER")
	private String UPDATE_USER;

	/** 删除标志 */
	@TableField(value = "DEL_FLG")
	private Integer DEL_FLG;

	public Integer getID() {
		return this.ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public String getDOOR_ID() {
		return this.DOOR_ID;
	}

	public void setDOOR_ID(String DOOR_ID) {
		this.DOOR_ID = DOOR_ID;
	}

	public String getAREA_ID() {
		return AREA_ID;
	}

	public void setAREA_ID(String aREA_ID) {
		AREA_ID = aREA_ID;
	}

	public String getDOOR_NAME() {
		return this.DOOR_NAME;
	}

	public void setDOOR_NAME(String DOOR_NAME) {
		this.DOOR_NAME = DOOR_NAME;
	}

	public Integer getDOOR_TYPE() {
		return this.DOOR_TYPE;
	}

	public void setDOOR_TYPE(Integer DOOR_TYPE) {
		this.DOOR_TYPE = DOOR_TYPE;
	}

	public String getREF1() {
		return this.REF1;
	}

	public void setREF1(String REF1) {
		this.REF1 = REF1;
	}

	public String getREF2() {
		return this.REF2;
	}

	public void setREF2(String REF2) {
		this.REF2 = REF2;
	}

	public String getREF3() {
		return this.REF3;
	}

	public void setREF3(String REF3) {
		this.REF3 = REF3;
	}

	public String getREF4() {
		return this.REF4;
	}

	public void setREF4(String REF4) {
		this.REF4 = REF4;
	}

	public Date getINSERT_TIME() {
		return this.INSERT_TIME;
	}

	public void setINSERT_TIME(Date INSERT_TIME) {
		this.INSERT_TIME = INSERT_TIME;
	}

	public String getINSERT_USER() {
		return this.INSERT_USER;
	}

	public void setINSERT_USER(String INSERT_USER) {
		this.INSERT_USER = INSERT_USER;
	}

	public Date getUPDATE_TIME() {
		return this.UPDATE_TIME;
	}

	public void setUPDATE_TIME(Date UPDATE_TIME) {
		this.UPDATE_TIME = UPDATE_TIME;
	}

	public String getUPDATE_USER() {
		return this.UPDATE_USER;
	}

	public void setUPDATE_USER(String UPDATE_USER) {
		this.UPDATE_USER = UPDATE_USER;
	}

	public Integer getDEL_FLG() {
		return this.DEL_FLG;
	}

	public void setDEL_FLG(Integer DEL_FLG) {
		this.DEL_FLG = DEL_FLG;
	}

}
