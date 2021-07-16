package com.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class DruidConnectTest {
    public static void main(String[] args) throws SQLException {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
        String driver  = resourceBundle.getString("jdbc.driver");
        System.out.println(driver);
        // start
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        DruidDataSource dataSource = app.getBean(DruidDataSource.class);
        DruidPooledConnection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        String sql = "SELECT * FROM mywebuser";
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            int id  = resultSet.getInt("UserID");
            String sname = resultSet.getString("userName");
            String spwd = resultSet.getString("userPWD");
            System.out.println(id + "|" + sname + "|" + spwd);
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}




//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/db1");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");