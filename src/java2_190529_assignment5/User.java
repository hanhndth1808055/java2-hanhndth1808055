package java2_190529_assignment5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class User {
    public void signIn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/assignment5";
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement st = con.createStatement();
            System.out.println("Please insert username: ");
            Scanner sc = new Scanner(System.in);
            String username1 = sc.nextLine();

            System.out.println("Please insert password: ");
            String password1 = sc.nextLine();

            String find_user_password = "SELECT COUNT(*) FROM user WHERE username = \'" + username1 + "\' AND password = \'" + password1 + "\'";
            System.out.println(find_user_password);
            ResultSet rs2 = st.executeQuery(find_user_password);
            while (rs2.next()) {
                if (rs2.getInt(1) != 0) {
                    System.out.println("Valid username and password");
                } else {
                    System.out.println("Invalid username and password");
                }
            }

        } catch (Exception e) {

        }
    }

    public void signUp() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/assignment5";
            Connection con = DriverManager.getConnection(url, "root", "");
            Statement st = con.createStatement();

            System.out.println("Please insert account's details:");
            System.out.println("Please insert Username: ");
            Scanner sc = new Scanner(System.in);
            String username1 = sc.nextLine();
            System.out.println("Please insert Email: ");
            String email1 = sc.nextLine();
            System.out.println("Please insert password: ");
            String password1 = sc.nextLine();

            String check_username = "SELECT COUNT(*) FROM user where username = \'" + username1 + "\' OR email = \'" + email1 + "\'";
            ResultSet rs = st.executeQuery(check_username);
            while (rs.next()) {
                if (rs.getInt(1) > 0) {
                    System.out.println("Registered username or password.");
                } else {
                    System.out.println("Unregistered username and email. Registered successfully!");
                    String insert_user = "INSERT INTO user (username, email, password)"
                            + "VALUES (\'" + username1 + "\', \'" + email1 + "\', \'" + password1 + "\')";
                    st.executeUpdate(insert_user);
                }
            }
        } catch (Exception e) {

        }
    }
    public void show(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/assignment5";
            Connection con = DriverManager.getConnection(url, "root", "");
            String sql = "SELECT * FROM user";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Username: " + rs.getString("username"));
                System.out.println("Email: " + rs.getString("email"));
            }

        } catch (Exception e){

        }
    }
}
