package jv2_190610_assignment7;

import connector.Connector;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class PhonebookDAO implements PhonebookInterface {
    private static PhonebookDAO instance;

    private PhonebookDAO() {

    }

    public static PhonebookDAO getInstance() {
        if (instance == null) {
            instance = new PhonebookDAO();
        }
        return instance;
    }

    @Override
    public boolean create(Phonebook p) {
        String sql1 = "SELECT * from user WHERE id =" + p.id;
        Connector cn = Connector.getInstance();
        try {
            ResultSet rs1 = cn.getQuery(sql1);
            while (rs1.next()) {
                System.out.println("have user");
                String sql = "INSERT INTO phonebook (user_id, telephone, status)" +
                        "VALUE('" + p.user_id + "','" + p.telephone + "','" + p.status + "')";
                try {
                    if (cn.updateQuery(sql) > 0) {
                        return true;
                    }
                } catch (Exception e) {

                }
            }
        } catch (Exception e) {

        }
        return false;
    }

    @Override
    public void show() {
        Connector cn = Connector.getInstance();
        String sql = "SELECT user.id as user_id, user.username, phonebook.id as phone_id, phonebook.telephone, phonebook.status from user LEFT JOIN phonebook ON user.id = phonebook.user_id";
        System.out.println("-------------------------------PHONEBOOK----------------------------------------");
        System.out.println("|User#|         Username        |Tel# |     Telephone      |       Status       |");
        try {
            ResultSet rs = cn.getQuery(sql);
            while (rs.next()) {
                System.out.printf("|%-5d|%-25s|%-5d|%-20s|%-20s|\n", rs.getInt("user_id"), rs.getString("username"), rs.getInt("phone_id"), rs.getString("telephone"), rs.getString("status"));
            }
        } catch (Exception e) {

        }
        return;
    }

    @Override
    public ArrayList<Phonebook> getList(String name) {
        Connector cn = Connector.getInstance();
        String sql = "SELECT user.id as user_id, user.username, phonebook.id as phone_id, phonebook.telephone, phonebook.status from user LEFT JOIN phonebook ON user.id = phonebook.user_id WHERE user.username = '" + name + "' and phonebook.telephone != NULL";
        ArrayList<Phonebook> array = new ArrayList<>();
        try {
            ResultSet rs = cn.getQuery(sql);
            while (rs.next()) {
                Phonebook p = new Phonebook(rs.getInt("id"), rs.getInt("user_id"), rs.getString("telephone"), rs.getString("status"));
                array.add(p);
            }
            if (array != null) {
                for (Phonebook i : array) {
                    System.out.println(i.id + " - " + i.user_id + " - " + i.telephone + " - " + i.status);
                }
                return array;
            }
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public boolean update(int id) {
        Connector cn = Connector.getInstance();
        String sql1 = "SELECT * FROM phonebook WHERE id = " + id;
        try {
            ResultSet rs1 = cn.getQuery(sql1);
            while(rs1.next()){
                Scanner sc = new Scanner(System.in);
                System.out.println("Please insert telephone number: ");
                String telephone = sc.nextLine();
                System.out.println("Please insert status: ");
                String status = sc.nextLine();
                String sql = "UPDATE phonebook SET telephone = '" + telephone + "', status = '" + status + "' WHERE id = " + id;
                if (cn.updateQuery(sql) > 0) {
                    System.out.println("Update successfully!");
                    return true;
                }

            }
        } catch (Exception e) {

        }
        System.out.println("Update unsuccessfully!");
        return false;
    }

    @Override
    public boolean delete(int id) {
        Connector cn = Connector.getInstance();
        String sql = "DELETE FROM phonebook WHERE id = " + id;
        try {
            if (cn.updateQuery(sql) > 0) {
                System.out.println("Delete successfully!");
                return true;
            }
        } catch (Exception e) {

        }
        System.out.println("Delete unsuccessfully!");
        return false;

    }

    @Override
    public boolean find(int id) {
        Connector cn = Connector.getInstance();
        String sql = "SELECT user.id as user_id, user.username, phonebook.id as phone_id, phonebook.telephone, phonebook.status from user LEFT JOIN phonebook ON user.id = phonebook.user_id WHERE user.id = " + id + " AND phonebook.telephone != 'null'";
        System.out.println("Phonebook of this user as below: ");
        System.out.println("-------------------------------PHONEBOOK----------------------------------------");
        System.out.println("|User#|         Username        |Tel# |     Telephone      |       Status       |");
        try {
            ResultSet rs = cn.getQuery(sql);
            while (rs.next()) {
                System.out.printf("|%-5d|%-25s|%-5d|%-20s|%-20s|\n", rs.getInt("user_id"), rs.getString("username"), rs.getInt("phone_id"), rs.getString("telephone"), rs.getString("status"));
                return true;
            }
        } catch (Exception e) {

        }
        return false;
    }
}
