package com.kayllanne.rbacdemo.controller;

import com.kayllanne.rbacdemo.domain.Role;
import com.kayllanne.rbacdemo.security.RequiresRole;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/public")
    public String publicRoute() {
        return "Rota pública 😌";
    }

    @GetMapping("/user")
    @RequiresRole(Role.USER)
    public String userRoute() {
        return "Só USER passa 👤";
    }

    @GetMapping("/admin")
    @RequiresRole(Role.ADMIN)
    public String adminRoute() {
        return "Só ADMIN passa 👑";
    }
}
