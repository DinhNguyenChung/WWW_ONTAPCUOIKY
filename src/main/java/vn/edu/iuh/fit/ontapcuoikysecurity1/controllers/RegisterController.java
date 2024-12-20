package vn.edu.iuh.fit.ontapcuoikysecurity1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.ontapcuoikysecurity1.enums.Role;
import vn.edu.iuh.fit.ontapcuoikysecurity1.models.User;
import vn.edu.iuh.fit.ontapcuoikysecurity1.repositories.UserRepository;
import vn.edu.iuh.fit.ontapcuoikysecurity1.services.UserService;

import java.time.LocalDate;

@Controller
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/user-register")
    public String registerNewUser(@RequestParam("username") String username,
                                  @RequestParam("email") String email,
                                  @RequestParam("password") String password,
                                  @RequestParam("confirm-password") String confirmPassword,
                                  Model model) {
        //Kiem tra email da ton tai
        if(userRepository.existsByEmail(email)) {
            model.addAttribute("error","Email da ton tai !");
            return "client/registe-user";
        }

        // Validate password matching
        if (!password.equals(confirmPassword)) {
            model.addAttribute("error", "Passwords do not match");
            return "client/registe-user";
        }

        // Logic để lưu user vào database (ví dụ)
        // User newUser = new User(username, email, password);
        // userRepository.save(newUser);
    try{
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
//        user.setPassword(password);
        user.setPassword(passwordEncoder.encode(password));
        user.setRole(Role.CUSTOMER);
        user.setCreatedAt(LocalDate.now());
        user.setIsActive(true);
        userRepository.save(user);

        model.addAttribute("message", "Registration successful! Please login.");
        return "redirect:/login"; // Điều hướng về trang đăng nhập sau khi đăng ký thành công
    } catch (RuntimeException e) {
        throw new RuntimeException(e);
    }

    }
}
