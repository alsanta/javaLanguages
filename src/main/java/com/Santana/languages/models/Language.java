package com.Santana.languages.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="languages")
public class Language {
//-------------------------------------------------------------------------MemberVariables(table Columns) Start------------------------------------------------------------------------------------//	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@NotNull
@Size(min = 1, max =25)
private String name;

@NotNull
@Size(min = 1, max =200)
private String creator;

@NotNull
private double version;

@Column(updatable=false)
@DateTimeFormat(pattern="yyyy-MM-dd")
private Date createdAt;

@DateTimeFormat(pattern="yyyy-MM-dd")
private Date updatedAt;
//-------------------------------------------------------------------------MemberVariables(table Columns) End--------------------------------------------------------------------------------------//
//	Empty Constructor
	public Language() {
	}
// 	Not empty constructor
	public Language(String name,String creator,double version) {
	super();
	this.name = name;
	this.creator = creator;
	this.version = version;
}
//-------------------------------------------------------------------------Getters & Setters Start--------------------------------------------------------------------------------------------------//
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
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
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

//-------------------------------------------------------------------------Getters & Setters End--------------------------------------------------------------------------------------------------------//

	
	

}
