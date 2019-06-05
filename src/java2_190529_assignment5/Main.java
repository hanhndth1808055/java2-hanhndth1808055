package java2_190529_assignment5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/assignment5";
            Connection con = DriverManager.getConnection(url, "root", "");
//            String sql = "SELECT * FROM user";
            Statement st = con.createStatement();

//            ResultSet rs = st.executeQuery(sql);
//            while (rs.next()) {
//                System.out.println("ID: " + rs.getInt("id"));
//                System.out.println("Username: " + rs.getString("username"));
//                System.out.println("Email: " + rs.getString("email"));
//                System.out.println("Password: " + rs.getString("password"));
//            }

            User u = new User();
            System.out.println("-----MENU-----");
            System.out.println("1. Sign in");
            System.out.println("2. Sign up");
            System.out.println("3. Show");
            System.out.println("4. Exit");
            System.out.println("---------------");
            while (true) {
                System.out.println("Please select your option: 1|2|3|4");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                if (choice == 1) {
                    u.signIn();
                    sc.nextLine();
                } else if (choice == 2) {
                    u.signUp();
                    sc.nextLine();
                } else if (choice == 3) {
                    u.show();
                    sc.nextLine();
                } else if (choice == 4) {
                    System.out.println("Exit successfully!");
                    sc.nextLine();
                    return;
                } else {
                    System.out.println("Invalid option! Please try again.");
                }
            }
        } catch (Exception e) {

        }
//        System.out.println("Please select an option: ");
//        Scanner sc = new Scanner(System.in);
//        String username = sc.nextLine();
//
//        System.out.println("Please insert password: ");
//        String password = sc.nextLine();


    }

}
