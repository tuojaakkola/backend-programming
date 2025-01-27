package fi.haagahelia.course.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fi.haagahelia.course.domain.Message;

@Controller
public class MessageController {

    @RequestMapping("/hello")
    public String sayHello(@RequestParam(name = "name", required = false) String name,
                           @RequestParam(name = "age", required = false) int age,
						    Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "hello"; 
        
    }
}