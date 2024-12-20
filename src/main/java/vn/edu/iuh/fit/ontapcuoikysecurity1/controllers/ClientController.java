package vn.edu.iuh.fit.ontapcuoikysecurity1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/client")
public class ClientController {
    @GetMapping("/register-user")
    public String showRegisterPage() {
        return "client/registe-user"; // Không cần thêm phần mở rộng .html
    }
}
