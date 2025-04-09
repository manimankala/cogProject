import java.util.Scanner;
class Main{
    public static void main(String[] args){
        printPrime(10);
    }
    public static void printPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            int count=0;
            for(int j=1;j<=n;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }
    }
}