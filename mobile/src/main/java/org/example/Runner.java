package org.example;

import com.javaacademy.UserService;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Это мобильная версия приложения");
        System.out.println("Версия 1.0.0");
        UserService userService = new UserService();
        userService.signUp("name", "pass");
        userService.signIn("name", "pass");
        System.out.println("У нас есть мобильник:" + new Mobile());
    }
}
