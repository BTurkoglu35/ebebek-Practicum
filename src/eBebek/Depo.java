package eBebek;

public class Depo {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Depo() {
    }

    public Depo(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary =salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public double tax() {

        if (this.salary > 1000) {
            return this.salary * 0.03;
        }else return 0.0;
    }

    public double bonus() {
        double aylikBonus=0.0;
        if(this.workHours>30){
            aylikBonus=4*((this.workHours -30)*30);
            return aylikBonus;

        }else return aylikBonus;
    }

    public double raiseSalary() {
        double totalSalary = this.salary -tax()+bonus();
        int calismaYili=2021-this.hireYear;
        if(calismaYili<10){
            return (totalSalary*0.05);
        } else if (calismaYili<20) {
            return (totalSalary * 0.10);
        } else return  (totalSalary * 0.15);

        }

    public void toString(Depo Depo) {
        System.out.println("Calisan adi ve soyadi  : "+this.name);
        System.out.println("Calisan maasi : "+this.salary);
        System.out.println("Calisanin haftalik calisma saati : "+this.workHours);
        System.out.println("Calisanin ise baslama yili : "+this.hireYear);
        System.out.println("Alinan vergi = "+tax());
        System.out.println("Bonus odemesi = "+bonus());
        System.out.println("Calisilan yil miktarina gore maas artisi = "+raiseSalary());
        System.out.println("Calisanin vergi ve bonuslarla birlikte maasi "+(this.salary -tax()+bonus()));
        System.out.println("Calisanin toplam maasi = "+(this.salary+raiseSalary()+bonus()-tax()));

    }





}