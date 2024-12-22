package com.taivu.ecommerce.controller;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taivu.ecommerce.controller.request.UserCreateRequest;
import com.taivu.ecommerce.controller.response.UserResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/users")
@Tag(name = "UserController")
public class UserController {

	@Operation(summary = "Get user list")
	@GetMapping
	public Map<String,Object> getList() {
		UserResponse user1 = new UserResponse();

		user1.setId(1L);
		user1.setEmail("dummy@gmail.com");
		user1.setPhone("0000000000");
		user1.setDateOfBirth(new Date());
		user1.setUserName("dummy");
		user1.setFirstName("dummy");
		user1.setLastName("dummy");

		List<UserResponse> userList = List.of(user1);

		Map<String, Object> result = new LinkedHashMap<>();


		result.put("status", HttpStatus.OK.value());
		result.put("data", userList);
		result.put("message", "User list");
		return result;
	}

	@Operation(summary = "Get user detail")
	@GetMapping("/{id}")
	public Map<String,Object> getUser(@PathVariable Long id) {
		UserResponse user1 = new UserResponse();
		user1.setId(id);
		user1.setEmail("dummy@gmail.com");
		user1.setPhone("0000000000");
		user1.setDateOfBirth(new Date());
		user1.setUserName("dummy");
		user1.setFirstName("dummy");
		user1.setLastName("dummy");

		Map<String, Object> result = new LinkedHashMap<>();

		result.put("status", HttpStatus.OK.value());
		result.put("data", user1);
		result.put("message", "User detail");
		return result;
	
	}

	@Operation(summary = "Create new user")
	@PostMapping
	public Map<String,Object> createUser(UserCreateRequest userCreateRequest) {
		UserResponse user1 = new UserResponse();
		user1.setId(userCreateRequest.getId());
		user1.setEmail("dummy@gmail.com");
		user1.setPhone("0000000000");
		user1.setDateOfBirth(new Date());
		user1.setUserName("dummy");
		user1.setFirstName("dummy");
		user1.setLastName("dummy");
		Map<String, Object> result = new LinkedHashMap<>();

		result.put("status", HttpStatus.CREATED.value());
		result.put("data", user1.getId());
		result.put("message", "User detail");
		return result;
	
	}
	
	@Operation(summary = "Update user info")
	@PutMapping
	public  Map<String,Object>  updateUser(UserCreateRequest userCreateRequest) {
		UserResponse user1 = new UserResponse();
		user1.setId(userCreateRequest.getId());
		user1.setEmail("dummy@gmail.com");
		user1.setPhone("0000000000");
		user1.setDateOfBirth(new Date());
		user1.setFirstName("dummy");
		user1.setLastName("dummy");
		Map<String, Object> result = new LinkedHashMap<>();

		result.put("status", HttpStatus.ACCEPTED.value());
		result.put("data", "");
		result.put("message", "User detail");
		return result;
	}
	@Operation(summary = "Inactive user")
	@DeleteMapping("/{id}")
	public  Map<String,Object>  deleteUser(@PathVariable Long id ) {
		Map<String, Object> result = new LinkedHashMap<>();

		result.put("status", HttpStatus.RESET_CONTENT.value());
		result.put("data", "");
		result.put("message", "User detail");
		return result;
	}
}
