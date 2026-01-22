package com.kayllanne.rbacdemo.security;

import com.kayllanne.rbacdemo.domain.Role;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresRole {
    Role value();
}
