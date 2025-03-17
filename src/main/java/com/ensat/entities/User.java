package com.ensat.entities;



import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User
  {
	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
    private String phone;
	private LocalDate dob;
    private String otp;
    private Boolean isAuth = false;
    private Boolean attended = false;
    private LocalDateTime createdon;
	private String token;
	private Boolean Active=true;
	private String userImage; // Image URL or base64
	private String userImageMedium;
	private String userImageSmall;
    private String maritialStatus;
	private String gender;
	private String address1; 
	private String address2;
	private String pincode;
	private String city;
	private String state;
  


	public User() {
	}

	public User(String email, String phone) {
		this.email = email;
		this.phone = phone;
	}

	public String getMaritialStatus() {
		return maritialStatus;
	}

	public void setMaritialStatus(String maritialStatus) {
		this.maritialStatus = maritialStatus;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Boolean getActive() {
		return Active;
	}

	public void setActive(Boolean active) {
		Active = active;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public boolean isAuth() {
		return isAuth;
	}

	public void setAuth(Boolean auth) {
		isAuth = auth;
	}

	public Boolean isAttended() {
		return attended;
	}

	public void setAttended(Boolean attended) {
		this.attended = attended;
	}

	public LocalDateTime getCreatedon() {
		return createdon;
	}

	public void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}

	
	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Boolean getAttended() {
		return attended;
	}

	public String getUserImage() {
		  return userImage;
	  }

	public void setUserImage(String userImage) {
		  this.userImage = userImage;
	  }

	public String getUserImageMedium() {
		  return userImageMedium;
	  }

	public void setUserImageMedium(String userImageMedium) {
		  this.userImageMedium = userImageMedium;
	  }

	public String getUserImageSmall() {
		  return userImageSmall;
	  }

	public void setUserImageSmall(String userImageSmall) {
		  this.userImageSmall = userImageSmall;
	  }

	public Boolean getIsAuth() {
		return isAuth;
	}

	public void setIsAuth(Boolean isAuth) {
		this.isAuth = isAuth;
	}

	
  }
