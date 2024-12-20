package vn.edu.iuh.fit.ontapcuoikysecurity1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import vn.edu.iuh.fit.ontapcuoikysecurity1.models.User;
import vn.edu.iuh.fit.ontapcuoikysecurity1.repositories.UserRepository;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private  UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private HomeController homeController;

    @PostMapping("/user-login")
    public ModelAndView login(@RequestParam("email") String email,
                              @RequestParam("password") String password) {
        ModelAndView view = new ModelAndView();

        if (userRepository.existsByEmail(email)) {
            User user = userRepository.findByEmail(email);

            // Kiểm tra mật khẩu
            if (passwordEncoder.matches(password, user.getPassword())) {
                view.addObject("user", user);
                return homeController.home(view); // Gọi lại phương thức home từ HomeController
            }
        }

        // Thêm thông báo lỗi nếu thông tin không hợp lệ
        view.addObject("messageLogin", "Invalid email or password! Please try again.");
        view.setViewName("client/login"); // Trả về trang login
        return view;
    }


}
