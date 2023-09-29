package SPRINGMVC1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	@RequestMapping(path = "/home", method=RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("name","Tejas");
		model.addAttribute("id", 12);
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Tejas Dharmik");
		modelAndView.addObject("id",122);
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
