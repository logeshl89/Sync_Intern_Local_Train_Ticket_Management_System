package com.example.sync_intern_local_train_ticket_management_system.Controller;


import com.example.sync_intern_local_train_ticket_management_system.Entity.UserLogin;
import com.example.sync_intern_local_train_ticket_management_system.Entity.UserRegistration;
import com.example.sync_intern_local_train_ticket_management_system.Service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }
     static long UserBalance;
    @GetMapping("/")
    String GetDefault() {
        return "Login";
    }

    @GetMapping("/login")
    String GetLogin() {
        return "Login";
    }

    @PostMapping("/api/login")
    String PostLogin(Model model, @ModelAttribute UserLogin userLogin) {
        System.out.println(userLogin);
        UserRegistration login = loginService.login(userLogin);
        if (login != null) {
            model.addAttribute("username", login.getFirstName() + login.getLastName());
            return "TrainTicketBook";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "Login";
        }
    }

    @GetMapping("/Register")
    String GetRegister() {
        return "Registration";
    }

    @PostMapping("/api/Register")
    String PostRegistration(Model model, @ModelAttribute UserRegistration userRegistration) {
        System.out.println(userRegistration);
        loginService.Register(userRegistration);
        model.addAttribute("error", "You have successfully registered");
        return "Login";
    }
}
