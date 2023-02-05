package com.masai.app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/api")
public class MyController 
{
	@GetMapping("/admin/dashboard")
	public String dashboardAdmin() {
		return "This is the admin's dashboard";
	}
	
	@GetMapping("/user/dashboard")
	public String dashboardUser() {
		return "This is the user's dashboard";
	}
	
	@GetMapping("/admin/new")
	public String admin() 
	{
		return "A new admin is made";
	}
	
	@GetMapping("/user/{userid}")
	public int adminDashboard(@PathVariable int userid) {
		return userid;
	}
}