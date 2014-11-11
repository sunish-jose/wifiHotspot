package com.wifi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;

@Entity
@Table(name="users")
public class User implements Serializable{
	
	private static final long serialVersionUID = 5210351005738429366L;

	@Id
	@Column(name="userId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	
	@Size(min=3, max=20, message="Full name must be between 3 and 100 characters long.")
	@Column(name="fullName")
	private String fullName;
	
	@Pattern(regexp="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}",  message="Invalid email address.")
	@Column(name="email")
	private String email;
	
	@Size(min=6, max=20, message="The password must be at least 6 characters long.")
	@Column(name="password")
	private String password;
	
	@Column(name="creationDate")
	@Type(type="date")
	private Date creationDate;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
}
