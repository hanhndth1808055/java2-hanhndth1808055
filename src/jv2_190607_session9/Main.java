package jv2_190607_session9;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String args[]){
        Locale vi = new Locale("vi","VN");
        Locale.setDefault(vi);
        ResourceBundle res = ResourceBundle
                .getBundle("jv2_190607_session9.session9");
        System.out.println(res.getString("hello"));

        ResourceBundle res2 = ResourceBundle
                .getBundle("jv2_190607_session9.session9", Locale.US);
        System.out.println(res2.getString("hello"));

        int m = 59000;
        NumberFormat nf =  NumberFormat.getCurrencyInstance();
        System.out.println(m);
        System.out.println(nf.format(m));
        double rate = 23500;
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println(nf2.format(m));
        System.out.println(nf2.format(m/rate));

        double n = 12534.15;

        NumberFormat nf3 = NumberFormat.getNumberInstance();
        System.out.println(nf3.format(n));
        NumberFormat nf4 = NumberFormat.getNumberInstance(Locale.US);
        System.out.println(nf4.format(n));

        String n2 = nf4.format(n);
    }
}


