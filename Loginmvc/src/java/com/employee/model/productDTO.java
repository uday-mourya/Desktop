/*qqi
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.employee.model;

import com.employee.service.GetConnection;
import com.user.model.CartDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class productDTO {

     public boolean insert(productDAO edao) {
        boolean b = false;
        Connection con = GetConnection.getConnection();
        if (con != null) {
            String sql = "insert into product1(productname,color,size,price)values(?,?,?,?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, edao.getName());
                ps.setString(2, edao.getColor());
                ps.setString(3, edao.getSize());
                ps.setString(4, edao.getPrice());
               
                if (ps.executeUpdate() > 0) {
                    b = true;
                    return b;
                }
            } catch (Exception e) {

            }
        }
        return false;
    }
     public boolean allFood(productDAO edao){
        boolean b=false;
        Connection con = GetConnection.getConnection();

        String sql = "SELECT * FROM product1;";
        try {
            ArrayList<ArrayList<String>> al = new ArrayList<>();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                b = true;
                ArrayList<String> record = new ArrayList<>();
                record.add(rs.getString("productname"));
                record.add(rs.getString("color"));
                record.add(rs.getString("size"));
                record.add(rs.getString("price"));
                al.add(record);
            } 
            edao.setAl(al);
        } catch (SQLException ex) {
            System.out.println("Exception : " + ex);
        } catch (Exception ex) {
            System.out.println("Exception = " + ex);
        }

        return b;
    }
public class ProductDTO {
    public List<productDAO> getAllProducts() {
    List<productDAO> productList = new ArrayList<>();
    try {
       Connection con = GetConnection.getConnection();
        ResultSet rs;
        PreparedStatement ps;

        String query = "SELECT * FROM product1";
        ps = con.prepareStatement(query);
        rs = ps.executeQuery();

        while (rs.next()) {
            productDAO product = new productDAO();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setColor(rs.getString("category"));
            product.setSize(rs.getString("category"));
            product.setPrice(rs.getString("price"));
//            product.setImage(rs.getString("image"));
            productList.add(product);
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return productList;
}
// public List<CartDAO> getCartProducts(ArrayList<CartDAO> cartList) throws SQLException {
//        List<CartDAO> book = new ArrayList<>();
//        ResultSet rs;
//        PreparedStatement pst;
//         Connection con = GetConnection.getConnection();
//        try {
//            if (cartList.size() > 0) {
//                for (CartDAO item : cartList) {
//                    String query = "select * from products where id=?";
//                    pst = con.prepareStatement(query);
//                    pst.setInt(1, item.getId());
//                    rs = pst.executeQuery();
//                    while (rs.next()) {
//                        CartDAO row = new CartDAO();
//                        row.setId(rs.getInt("id"));
//                        row.setName(rs.getString("name"));
//                        row.setColor(rs.getString("color"));
////                        row.setPrice(rs.getDouble("price")*item.getQuantity());
//                        row.setQuantity(item.getQuantity());
//                        book.add(row);
//                    }
//
//                }
//            }
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return book;
//    }   
//    public double getTotalCartPrice(ArrayList<CartDAO> cartList) throws SQLException {
//        double sum = 0;
//         Connection con = GetConnection.getConnection();
//         ResultSet rs;
//        PreparedStatement pst;
//        try {
//            if (cartList.size() > 0) {
//                for (CartDAO item : cartList) {
//                    String query = "select price from products where id=?";
//                    pst = con.prepareStatement(query);
//                    pst.setInt(1, item.getId());
//                    rs = pst.executeQuery();
//                    while (rs.next()) {
//                        sum+=rs.getDouble("price")*item.getQuantity();
//                    }
//
//                }
//            }
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return sum;
//    } 

   
}}
