package jv2_190522_inclass2;

import java.io.*;

public class FileDemo {
    public static void main(String args[]) throws Exception {
        File f = new File("data.txt");
        String output = "";
        if (f.canRead()) {
            FileInputStream fis = new FileInputStream(f);
            DataInputStream dis = new DataInputStream(fis);
            String line;
            while ((line = dis.readLine()) != null) {
                output += line + "\n";
            }
            System.out.println(output);
            dis.close();
            fis.close();
        }
        if (f.canWrite()) {
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);

            String input = output + "hello T1809E";
            dos.writeBytes(input);
            dos.close();
            fos.close();
        }
    }
}
