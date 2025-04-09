
import java.util.Scanner;
//import java.math.;
class DivideNo{
    public static void main(String[] args){
        for(String a:args){
            System.out.println(a);
        }
        Scanner sc=new Scanner(System.in);
        float a=sc.nextInt();
        float b=sc.nextInt();
        divideNos(a,b);

    }
    public static void divideNos(float a,float b){
        try{
            float result=a/b;
            System.out.println(String.format("%.2f",result));

        } catch (ArithmeticException e) {
            System.err.println("Number cannot be divided by 0");

        }
    }
}