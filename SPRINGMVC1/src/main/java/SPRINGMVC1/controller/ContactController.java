package SPRINGMVC1.controller;
import SPRINGMVC1.Service.UserService;
import SPRINGMVC1.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonData(Model m) {
		m.addAttribute("KEYID","2");
	}
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}

	@RequestMapping(path = "/processform" ,method=RequestMethod.POST)
	public String handleform(@ModelAttribute User user, Model m) {
		if(user.getUsername().isBlank()) {
			return "redirect:/contact";
		}
		int createuser = this.userService.createUser(user);
		m.addAttribute("msg","User logged in with "+createuser);
		return "success";
	}
	
	
	
//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleform(@RequestParam("email") String useremail, @RequestParam("username") String username,
//			@RequestParam("pass") String userpass, Model model) {
//		
//		User user= new User();
//		user.setEmail(useremail);
//		user.setUsername(username);
//		user.setPass(userpass);
//		System.out.println("email "+useremail);
//		System.out.println("username "+username);
//		System.out.println("pass "+userpass );
////		model.addAttribute("email",useremail);
////		model.addAttribute("password",userpass);
////		model.addAttribute("username",username);
//		model.addAttribute(user);
//		return "success";
//	}
}
