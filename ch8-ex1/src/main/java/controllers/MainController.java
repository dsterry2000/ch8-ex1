package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@Controller
public class MainController {

        private static Logger logger = Logger.getLogger(MainController.class.getName());
        @RequestMapping("/home")
        public String home(@RequestParam String color, Model page){
            logger.info("Calling home.html from resources/templates");

            page.addAttribute("username", "Darrell");
            page.addAttribute("color", color);

            return "home.html";
        }

}
