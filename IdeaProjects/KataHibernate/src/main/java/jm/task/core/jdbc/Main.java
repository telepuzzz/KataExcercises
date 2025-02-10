package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Криштиану", "Роналду", (byte) 40);
        System.out.println("User с именем Иван добавлен в базу данных");

        userService.saveUser("Леонеля", "Месси", (byte) 37);
        System.out.println("User с именем Петр добавлен в базу данных");

        userService.saveUser("Александр", "Овечкин", (byte) 39);
        System.out.println("User с именем Сидор добавлен в базу данных");

        userService.saveUser("Наруто", "Удзумаки", (byte) 33);
        System.out.println("User с именем Анна добавлен в базу данных");

        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
