package com.kadatechnologie.kadatech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	
	@GetMapping("/index")
	public String home() { return "index"; }
	
	@GetMapping("/blog")
	public String blog() { return "blog"; }
	
	@GetMapping("/cart")
	public String cart() { return "cart"; }
	
	@GetMapping("/contact-us")
	public String contact() { return "contact-us"; }
	
	@GetMapping("/login")
	public String login() { return "login"; }
	
	@GetMapping("/product-details")
	public String product() { return "product-details"; }
	
	@GetMapping("/shop")
	public String shop() { return "shop"; }
	
	@GetMapping("/404")
	public String error() { return "404"; }
	
	@GetMapping("/checkout")
	public String checkout() { return "checkout"; }

}
