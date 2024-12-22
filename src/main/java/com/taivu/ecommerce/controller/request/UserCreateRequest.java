package com.taivu.ecommerce.controller.request;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;

@Getter
public class UserCreateRequest implements  Serializable{
	private Long id;
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private Date dateOfBirth;
	private String phone;
	private String password;
}
