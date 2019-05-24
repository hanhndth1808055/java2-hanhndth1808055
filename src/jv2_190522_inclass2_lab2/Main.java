package jv2_190522_inclass2_lab2;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        PhoneNumber<String, String> p = new PhoneNumber<>("name", "098876");
        show(new PhoneNumber("Nguyen", "0987"));
    }

    public static <E extends PhoneNumber> void show(E e){
        System.out.println(e.name + " - " + e.phone);
    }

    public static void show2(ArrayList<? super Integer> a){

    }
}
