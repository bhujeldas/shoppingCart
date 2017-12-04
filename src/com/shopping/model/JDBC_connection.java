package com.shopping.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_connection {
    /**
     * This class creates a connection object with the MySQL database.
     * Update the database details here to connect with the local database.
     */
    String URL = "jdbc:mysql://localhost/shopping_cart";
    String USERNAME = "root";
    String password = "admin";

    Connection connection = null;

    public Connection setConnection() throws ClassNotFoundException {

        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL,USERNAME,password);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return connection;
    }
}
