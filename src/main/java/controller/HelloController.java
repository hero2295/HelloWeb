package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String Calculate(@RequestParam int chislo1, @RequestParam int chislo2, ModelMap model) {
        int res = chislo1 * chislo2;
        model.addAttribute("message1", res);
        return "hello";
    }
    @RequestMapping(value="/index")
    public String initData(Model model){
        return "hello";
    }
}

