package com.shopping.model;

import com.shopping.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Product_Repository {

    private JDBC_connection JC;
    public Product_Repository()
    {
        JC = new JDBC_connection();
    }

    public List<Product> getProducts(int page)
    {
        String query = "select * from product LIMIT ?,?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Product> product_list = null;

        try {
            connection = JC.setConnection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        int start = (page-1)*10;
        int end = (page-1)*10+10;

        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,start);
            preparedStatement.setInt(2,end);
            resultSet = preparedStatement.executeQuery();
            product_list = new ArrayList<>();
            while (resultSet.next())
            {
                Product product = new Product();
                product.setId(resultSet.getLong("id"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getFloat("prices"));
                product_list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(connection!=null)
            {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(preparedStatement!=null)
            {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(resultSet!=null)
            {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return product_list;
    }
}
