package com.taivu.ecommerce.controller.response;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse implements Serializable {
	private Long id;
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private Date dateOfBirth;
	private String phone;

}
