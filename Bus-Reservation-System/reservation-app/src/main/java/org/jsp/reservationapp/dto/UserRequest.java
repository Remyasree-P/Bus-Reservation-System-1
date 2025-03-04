package org.jsp.reservationapp.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

//public class UserRequest {
//	private long phone;
//	private String email;
//	private int age;
//	private String name;
//	private String gender;
//	private String password;
//
//}


public class UserRequest {
	@NotBlank(message = "Name is mandatory")
	private String name;
	private long phone;
	@Email(message = "Invalid Email Id format")
	private String email;
	@NotBlank(message = "Gender is mandatory")
	private String gender;
	private int age;
	@NotBlank(message = "Password is mandatory")
	@Size(min = 3, max = 15, message = "Password length must be between 8 to 15")
	private String password;
}