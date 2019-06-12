package jv2_190610_assignment7;
import java2_190605_assignment6.User;
import java2_190605_assignment6.UserDAO;
public class Main {

    public static void main(String args[]) {
        Phonebook p = new Phonebook(1,2, "0987987111", "active" );
        PhonebookDAO pDAO = PhonebookDAO.getInstance();
        System.out.println("Create new phone record");
        pDAO.create(p);
        System.out.println("Find phone record with user_id = 2");
        pDAO.find(2);
        System.out.println("Find phone records with username = qah3");
        pDAO.getList("qah3");
        System.out.println("Show all users with their phone numbers");
        pDAO.show();
        System.out.println("Delete phone record with id = 6");
        pDAO.delete(6);
        System.out.println("Update phone record with id = 5");
        pDAO.update(5);

    }
}
