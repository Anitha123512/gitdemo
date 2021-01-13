package com.example.springboot;

import org.springframework.stereotype.Component;

        import java.sql.*;
        import java.util.ArrayList;
        import java.util.List;

@Component
public class Test {
    public static void main(String[] args) {

        Employee2 emp=new Employee2(10,"raja");
        List<Employee2> employeeList=new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test1", "root", "Anitha@12");
            Statement stmt = conn.createStatement();
//            int rs = stmt.executeUpdate("insert into employee (name,id) values('" + emp.getName() + "','" + emp.getId() + "')");
            ResultSet rs = stmt.executeQuery("select * from employee");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
//Display values
                Employee2 es=new Employee2(id,name);
                employeeList.add(es);
                System.out.print("ID: " + id);
                System.out.println(", Name: " + name);
            }
//STEP 6: Clean-up environment
            rs.close();

//            System.out.println(rs+"........updated");
            stmt.close();
            conn.close();
        } catch (SQLException se) {
//Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
//Handle errors for Class.forName
            e.printStackTrace();
            //}  finally {
////finally block used to close resources
//            try {
//                if (stmt != null)
//                    stmt.close();
//            } catch (SQLException se2) {
//            }// nothing can be done
//            try {
//                if (conn != null)
//                    conn.close();
//            } catch (SQLException se) {
//                se.printStackTrace();
//            }//end finally try
        }//end try
        System.out.println("Goodbye!");
        System.out.println(employeeList);
    }//end main

    public String getName() {
        return "pavan";
    }
}
