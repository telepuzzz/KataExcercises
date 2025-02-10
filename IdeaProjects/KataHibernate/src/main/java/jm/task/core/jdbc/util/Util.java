//package jm.task.core.jdbc.util;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class Util {
//
//    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
//    private static final String USER = "root";
//    private static final String PASSWORD = "telepuz_4828";
//
//    public static Connection getConnection() {
//        Connection connection = null;
//        try {
//            return DriverManager.getConnection(URL, USER, PASSWORD);
//        } catch (SQLException e) {
//            throw new RuntimeException("Ошибка подключения к базе данных", e);
//        }
//    }
//}
