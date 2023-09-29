package SPRINGMVC1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class ReController {
	@RequestMapping("/one")
	public String one() {
		return "redirect:/two";
	}
	
	@RequestMapping("/two")
	public RedirectView two() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("three");
		return redirectView;
	}
	@RequestMapping("/three")
	public String three(){
		return "success";
	}
}
