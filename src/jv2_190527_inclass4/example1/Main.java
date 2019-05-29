package jv2_190527_inclass4.example1;

public class Main {
//    public static Integer x = 2;
    public static void main(String args[]){
        Snt snt = new Snt(2);
        SubThread st1 = new SubThread(snt);
        SubThread st2 = new SubThread(snt);

        st1.start();
        st2.start();
    }
}
