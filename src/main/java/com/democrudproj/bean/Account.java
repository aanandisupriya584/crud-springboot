package com.democrudproj.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Account_tbl")
public class Account {
	@Id
	@GeneratedValue
	private String id;
	private String accNo;
	private String name;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Account(String id, String accNo, String name) {
		super();
		this.id = id;
		this.accNo = accNo;
		this.name = name;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
