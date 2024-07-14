package mitra.suvankar.openshare.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class MainPageController {

    @GetMapping("/main")
    public String getMainPage(Model model) {
        model.addAttribute("message", "hello world!");
        return "index.html";
    }
}
