package com.vodafone.service;

import com.vodafone.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Service
public class CustomerService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addCustomer(Customer customer) {
        String sql = "INSERT INTO customer(first_name,last_name,user_name,email,password,phone) VALUES(?,?,?,?,?,?)";
        return jdbcTemplate.update(sql, customer.getFirstName(), customer.getLastName(), customer.getUserName(),
                customer.getEmail(), customer.getPassword(), customer.getPhone());
    }
public  Customer getCustomer(){
//    return jdbcTemplate.query("SELECT * FROM customer"){
//
//            public Customer (ResultSet rs, int arg1) throws SQLException {
//                Customer c = new Customer();
//                c.setFirstName(rs.getString("first_name"));
//                c.setLastName(rs.getString("last_name"));
//                c.setUserName(rs.getString("user_name"));
//                c.setEmail(rs.getString("email"));
//                c.setPassword(rs.getString("passwoed"));
//                c.setPhone(rs.getString("phone"));
//
//                return c;
//            }
//
//        });

}
//    public List<Customer> getAllCustomers() {
//        return jdbcTemplate.query("SELECT * FROM customer", new RowMapper<Customer>() {
//
//            public Customer mapRow(ResultSet rs, int arg1) throws SQLException {
//                Customer c = new Customer();
//                c.setAge(rs.getInt("age"));
//                c.setFirstName(rs.getString("first_name"));
//                c.setLastName(rs.getString("last_name"));
//                c.setPlace(rs.getString("place"));
//                return c;
//            }
//
//        });
    //}
}
