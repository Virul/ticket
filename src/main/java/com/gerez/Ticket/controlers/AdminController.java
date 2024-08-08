package com.gerez.Ticket.controlers;

import com.gerez.Ticket.models.User;
import com.gerez.Ticket.services.RoleService;
import com.gerez.Ticket.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    RoleService roleService;

    @GetMapping("/admin/add_user")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("roles", roleService.findAll());
        return "admin/add_user";
    }

    @PostMapping("/admin/add_user")
    public String registerUser(@ModelAttribute("user") @Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            result.getAllErrors().forEach(error -> {
                System.out.println("Error: " + error.getObjectName() + " - " + error.getDefaultMessage());
            });
            return "admin/add_user";
        }

        userService.save(user);

        model.addAttribute("message", "Se agrego correctamente el usuario");
        return "redirect:/home";
    }
}
