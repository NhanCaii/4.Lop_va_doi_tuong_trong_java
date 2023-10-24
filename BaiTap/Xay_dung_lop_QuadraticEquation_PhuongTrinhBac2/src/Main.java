import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap gia tri a: ");
        double a= sc.nextDouble();
        System.out.print("Nhap gia tri b: ");
        double b= sc.nextDouble();
        System.out.print("Nhap gia tri c: ");
        double c= sc.nextDouble();

        QuadraticEquation quadEqua = new QuadraticEquation(a,b,c);
        System.out.println(quadEqua.gettter());
        double delta=quadEqua.getDiscriminant();
        if (delta>0){
            System.out.println("Phuong trinh 2 nghiem: "+ quadEqua.getRoot1()+" va "+ quadEqua.getRoot2());
        } else if (delta==0){
            System.out.println("Phuong trinh 1 nghiem: "+ quadEqua.getRoot1());
        } else {
            System.out.println("Vo ngiem");
        }
    }

    public static class QuadraticEquation{
        private double a,b,c;

        public QuadraticEquation(double a, double b, double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public String gettter(){
            return "Gia tri a:"+a+"\nGia tri b: "+b+"\nGia tri c: "+c;
        }

        public double getDiscriminant(){
            return b*b-4*a*c;
        }
        public double getRoot1(){
            return (-b + Math.pow(getDiscriminant(),0.5)) / 2 * a;
        }
        public double getRoot2(){
            return (-b - Math.pow(getDiscriminant(),0.5)) / 2 * a;
        }
    }
}