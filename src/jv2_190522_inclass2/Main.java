package jv2_190522_inclass2;

public class Main {
    public static void main(String args[]) {
        tinh_tong(3, 5);
        tinh_tong(3.4, 3.5);
        MyGeneric<String, Integer> mg1 = new MyGeneric<>();
//        show(1); error: 1 is not Human type or Asian type
        show(new Human());
        show(new Asian());
    }

    public static <E extends Human> void show(E e) {
        e.showInfo();
    }

    public static <N extends Number> void tinh_tong(N a, N b) {
        System.out.println(a.doubleValue() + b.doubleValue());
    }

//    public static <X, Y> void tinh_tong(X a, X b, Y c) {
//        if (a instanceof Integer) {
//            int x = (Integer) a;
//            int y = (Integer) b;
//            System.out.println(x + y);
//        } else if (a instanceof Double || a instanceof Float) {
//            double x = (Double) a;
//            double y = (Double) b;
//            System.out.println(x + y);
//        } else {
//            System.out.println("Khong the tinh tong");
//        }
//    }
//
//    public static void tinh_tong(int a, int b) {
//        System.out.println(a + b);
//    }
//
//    public static void tinh_tong(double a, double b) {
//        System.out.println(a + b);
//    }
}
