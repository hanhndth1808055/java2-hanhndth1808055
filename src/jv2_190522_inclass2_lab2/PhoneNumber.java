package jv2_190522_inclass2_lab2;

public class PhoneNumber <K extends String, V extends String>{
    public K name;
    public V phone;

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public V getPhone() {
        return phone;
    }

    public void setPhone(V phone) {
        this.phone = phone;
    }

    public PhoneNumber(K name, V phone) {
        this.name = name;
        this.phone = phone;
    }

    public PhoneNumber() {
    }

    public  <E> void show(E e){

    }
}
