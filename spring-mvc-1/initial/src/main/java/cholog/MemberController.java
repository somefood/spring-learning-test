package cholog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

    @GetMapping("/hello")
    public String world(@RequestParam(name = "name", defaultValue = "world!") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @ResponseBody
    @GetMapping("/json")
    public Person json() {
        return new Person("brown", 20);
    }
}
