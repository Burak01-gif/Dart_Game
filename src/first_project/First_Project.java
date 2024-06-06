
package first_project;

import java.util.Scanner;

public class First_Project {
  
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("DART GAME ");
        System.out.print("Enter the number of darts to be thrown : ");

        int darts = input.nextInt();
        int f=0,c=0,a=0,b=0,d=0,e=0,de=0, un=0;

        for (int i=1; i<=darts; i++) {
            double x1 = (double) -10.0 + (Math.random() * (20));
            double x = (double) (Math.floor(x1) * 0.1);

            double y1 = (double) -10.0 + (Math.random() * (20));
            double y = (double) (Math.floor(y1) * 0.1);

            System.out.println("Dart : " + i );
            System.out.println("Coordinates : " + x + " " + y );

            if (x >= 0.1 && y <= -0.1) {
                System.out.println("Region F");
                f++;
            } else if (x <= -0.1 && y >= 0.1) {
                System.out.println("Region C");
                c++;
            } else if ((x >= 0.1 && y >= 0.1) && (x+y<1.0)){
                System.out.println("Region A");
                a++;
            } else if ((x >= 0.1 && y >= 0.1) && (x+y>1.0)) {
                System.out.println("Region B");
                b++;
            } else if (x + y == 1) {
                System.out.println("Between A and B");
                un++;
            } else if ((x <= -0.1 && y <= -0.1) && (x<y)) {
                System.out.println("Region D");
                d++;
            } else if ((x <= -0.1 && y <= -0.1) && (y<x)) {
                System.out.println("Region E");
                e++;
            }else if (x==y){
                System.out.println("Between D and E");
                un++;
            }else
                System.out.println();
        }
        double sum = a+b+c+d+e+f+un;
        double sum1 = 100/sum;
        System.out.println(sum1);
        double a1,b1,c1,d1,e1,f1,un1;
        a1=a*sum1;
        b1=b*sum1;
        c1=c*sum1;
        d1=d*sum1;
        e1=e*sum1;
        f1=f*sum1;
        un1=un*sum1;

        System.out.println("Region statistics : ");
        System.out.println("A " + a + " Dart " + a1 + "%");
        System.out.println("B " + b + " Dart " + b1 + "%");
        System.out.println("C " + c + " Dart " + c1 + "%");
        System.out.println("D " + d + " Dart " + d1 + "%");
        System.out.println("E " + e + " Dart " + e1 + "%");
        System.out.println("F " + f + " Dart " + f1 + "%");
        System.out.println("Undecided : " + un + " Dart " + un1 + "%");
    }
    
}
