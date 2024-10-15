package com.javaacademy;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, String> users = new HashMap<>();
    
    /**
     * Регистрация
     */
    public void signUp(String login, String password) {
        if (!users.containsKey(login)) {
            users.put(login, password);
            System.out.println("Пользователь зарегистрирован");
            return;
        }
        throw new RuntimeException("Пользователь уже есть в системе!");
    }

    /**
     * Вход пользователя
     */
    public void signIn(String login, String password) {
        if (!users.containsKey(login)) {
            throw new RuntimeException("Нет такого пользователя!");
        }
        if (!users.get(login).equals(password)) {
            throw new RuntimeException("Неверный пароль!");
        }
        System.out.println("Вход успешный");
    }
    
    
}
