package jv2_190610_assignment7;

import java.util.ArrayList;

public interface PhonebookInterface {
    boolean create(Phonebook p);

    ArrayList<Phonebook> getList(String name);

    boolean update(int id);

    boolean delete(int id);

    boolean find(int id);

    void show();
}
