package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        User user1 = new User("Vasya", "Pupkin", (byte) 8);
        User user2 = new User("Vano", "Ivanko", (byte) 6);
        User user3 = new User("Petr", "Petrov", (byte) 12);
        User user4 = new User("Foma", "Fomin", (byte) 10);

        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        System.out.println("User named " + user1.getName() + " has been added to the database");

        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        System.out.println("User named " + user2.getName() + " has been added to the database");

        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        System.out.println("User named " + user3.getName() + " has been added to the database");

        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        System.out.println("User named " + user4.getName() + " has been added to the database");

        for (User user : userService.getAllUsers()) {
            System.out.println(user.toString());
        }

        //
        userService.cleanUsersTable();
        //userService.dropUsersTable();
    }
}