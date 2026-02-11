

package com.klu.Controller;

import com.klu.service.MessageService;
import com.klu.model.MessageModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/")
    public String home(Model model) {

        MessageModel msg = new MessageModel(messageService.getMessage());

        model.addAttribute("message", msg);

        return "home";
    }
}

