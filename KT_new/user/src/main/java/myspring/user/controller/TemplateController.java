package myspring.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TemplateController {
	
	@GetMapping("/main")
	public String main(Model model) {
		model.addAttribute("name", "JSP");

		return "/main";
		// "/main.html"
	}
}