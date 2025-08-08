package javaIO;

import javaIO.persistence.FilePersistence;
import javaIO.persistence.IOFilePersistence;

import java.io.IOException;

public class Main {
    public static void main(String [] args) throws IOException {
        FilePersistence persistence = new IOFilePersistence("user.csv");

        System.out.println("=============================");
        System.out.println(persistence.write("Luan: luan@gmail.com; 08/04/2006"));
        System.out.println("=============================");
        System.out.println(persistence.write("Joazinho: joaozin@gmail.com; 04/01/2000"));
        System.out.println("=============================");
        System.out.println(persistence.write("Sadsad: sadsad@gmail.com; 05/12/2009"));

        System.out.println("=============================");
        System.out.println(persistence.findAll());
        System.out.println("=============================");

        System.out.println(persistence.remove("2009"));

        System.out.println("=============================");
        System.out.println(persistence.findAll());
        System.out.println("=============================");

        System.out.println("=============================");
        System.out.println(persistence.findBy("Luan"));
        System.out.println("=============================");
        System.out.println(persistence.findBy("Joazinho"));


    }
}
