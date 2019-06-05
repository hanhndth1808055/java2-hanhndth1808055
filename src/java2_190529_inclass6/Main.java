package java2_190529_inclass6;
//B1: import sql package

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String args[]) {
        try {
            //B2: Khai bao driver
            Class.forName("com.mysql.jdbc.Driver");
            //B3: Ket noi CDSL
            String url = "jdbc:mysql://localhost:3306/classlist";
            Connection con = DriverManager.getConnection(url, "root", "");

            // Buoc 4: Truy van CSDL
            String sql = "SELECT * FROM student";

//            String add_student = "INSERT INTO student (name,mssv,age)" +
//                    " VALUES('Nguyen van anh','vananh1234',20)";

//            String add_student = "INSERT INTO student (name, mssv, age)" +
//                    "VALUES ('Dinh Thi Thanh', 'thanh231', 19)";
//            String edit_student = "UPDATE student SET name='Nguyen Thi Bay'" +
//                    "WHERE id='4'";
            String delete_student = "DELETE from student WHERE id = '3'";
            Statement st = con.createStatement();
//them, sua, xoa
            int number = st.executeUpdate(delete_student);
            if (number > 0) {
                System.out.println("sua thanh cong");
            }
//show
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Mssv: " + rs.getString("mssv"));
                System.out.println("Age: " + rs.getInt("age"));

                System.out.println("----------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}