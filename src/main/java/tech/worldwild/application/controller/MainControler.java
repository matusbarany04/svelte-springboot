package tech.worldwild.application.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

@Controller
public class MainControler {
    @GetMapping("/dashboard")
    public String handleIndexDashboard(Model model) {
        return "index";
    }
    @GetMapping("/dashboard/{path:[^\\.]*}")
    public String handleAllPaths(Model model) {
        return "index";
    }

}