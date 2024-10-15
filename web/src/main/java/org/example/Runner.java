package example;

import com.javaacademy.UserService;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Это веб версия приложения");
        UserService userService = new UserService();
        userService.signUp("name", "pass");
        userService.signIn("name", "pass");
        System.out.println("Новый функционал, которого нет в mobile");
    }
}
