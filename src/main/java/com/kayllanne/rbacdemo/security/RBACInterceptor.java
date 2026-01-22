package com.kayllanne.rbacdemo.security;

import com.kayllanne.rbacdemo.domain.User;
import com.kayllanne.rbacdemo.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class RBACInterceptor implements HandlerInterceptor {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        if (!(handler instanceof HandlerMethod method)) {
            return true;
        }

        RequiresRole requiresRole = method.getMethodAnnotation(RequiresRole.class);

        if (requiresRole == null) {
            return true;
        }

        String userId = request.getHeader("X-USER-ID");

        if (userId == null) {
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            return false;
        }

        User user = userRepository.findById(Long.valueOf(userId)).orElse(null);

        if (user == null) {
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            return false;
        }

        if (user.getRole() != requiresRole.value()) {
            response.setStatus(HttpStatus.FORBIDDEN.value());
            return false;
        }

        return true;
    }
}
