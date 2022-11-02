package net.javaguides.sms.entity;



import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "site")
public class Site {

@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name = "siteName", nullable = false)
private String siteName;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getSiteName() {
	return siteName;
}

public void setSiteName(String siteName) {
	this.siteName = siteName;
}

public Site(Long id, String siteName) {
	super();
	this.id = id;
	this.siteName = siteName;
}

public Site() {
	super();
	// TODO Auto-generated constructor stub
}


}