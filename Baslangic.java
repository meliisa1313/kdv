package Giris;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        double fiyat;
        double newFiyat;
        double kdv;
        Scanner input=new Scanner(System.in);
        System.out.println("urunun fiyati nedir");
        fiyat=input.nextDouble();
        if(fiyat<=1000){
        kdv=(fiyat*18)/100;
        System.out.println(kdv);
        newFiyat=fiyat+kdv;
        System.out.println(newFiyat);}
        else{
            kdv=(fiyat*8)/100;
            newFiyat=fiyat+kdv;
            System.out.println(newFiyat);
        }






    }
}
