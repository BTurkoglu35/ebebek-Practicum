package eBebek;


import java.util.Scanner;


public class Runner extends Depo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Calisanin isim ve soyisimini  giriniz");
        String name = scan.nextLine();
        System.out.println("Calisanin maasini  giriniz");
        double salary = scan.nextDouble();
        System.out.println("Haftalik calisma saati giriniz");
        int workHours = scan.nextInt();
        System.out.println("Calismaya basladigi yili giriniz");
        int hireYear = scan.nextInt();
        Depo calisanBilgileri = new Depo(name,salary,workHours,hireYear);
        calisanBilgileri.toString(calisanBilgileri);




    }





}


