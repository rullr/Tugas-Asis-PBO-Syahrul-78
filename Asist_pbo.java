package asist_pbo;

import java.util.Scanner;

public class Asist_pbo {

    public static void main(String[] args) {
        System.out.println("Mencari akar dari Persamaan Kuadrat");
        System.out.println("Syarat: \n 1. ax2+bx+c=0 \n 2. Dimana a,b,c Bil."
                + "Real \n 3. a!=0");
        
        Scanner input = new Scanner(System.in);
        int a,b,c;
        do{
        System.out.print("Masukkan koefisien a = ");
        a = input.nextInt();
        if (a==0)
                System.out.println("Input again broo");
        }
        while (a==0);
        System.out.print("Masukkan koefisien b = ");
        b = input.nextInt();
        System.out.print("Masukkan nilai c = ");
        c = input.nextInt();
        
        System.out.println("Persamaannya adalah = "+a+"x2 + "+b+"x + "+c+" = 0");
        System.out.println("Dimana a,b, dan c : Bil. Real dan a!=0");                
        
        persamaanKuadrat pers = new persamaanKuadrat(a, b, c);
        pers.getMethod();
        
    }
    
}

class persamaanKuadrat{
        private int a,b,c;
        
        persamaanKuadrat(int new_a,int new_b,int new_c){
            this.a=new_a;
            this.b=new_b;
            this.c=new_c;
        }
        
        public double getDiskriminan() {
            return (b*b) - 4*(a*c);
        }
        double getAkar1() {
            return (-b + Math.sqrt(getDiskriminan()))/(2*a);
        }
        double getAkar2() {
            return (-b - Math.sqrt(getDiskriminan()))/(2*a);
        }
        public void A (int a){
            this.a = a;
        }
        public void B (int b){
            this.b = b;
        }
        public void C (int c){
            this.c = c;
        }
        public void getMethod(){
            if (a==0)
                System.out.println("Tidak sesuai syarat karena a=0");
            else if (getDiskriminan()>0)
                System.out.println("Persamaan Kuadrat ini mempunyai akar1 = " 
                        +getAkar1()+" dan akar2 = "+getAkar2());
            else if (getDiskriminan()==0)
                System.out.println("Persamaan Kuadrat ini mempunyai akar kembar"
                        + " yaitu " +getAkar1());
            else
                System.out.println("Persamaan Kuadrat ini tidak mempunyai akar"
                        + " penyelesaian");
        }
}