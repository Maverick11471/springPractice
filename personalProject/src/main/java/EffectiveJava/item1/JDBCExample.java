package EffectiveJava.item1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class JDBCExample {
    public static void main(String[] args) {
        try {

            // [4] 서비스 제공자 인터페이스
            Driver driver = new com.mysql.cj.jdbc.Driver();
            // [2] 서비스 등록 API
            DriverManager.registerDriver(driver);

            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String user = "root";
            String password = "password";

            // [1] 서비스 인터페이스, [3] 서비스 접근 API
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected!");

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
