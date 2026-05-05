package ru.netology.javaqa;

import ru.netology.services.RestService;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        service.calculate(10000, 3000, 20000);
    }
}