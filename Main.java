import java.util.Scanner;
class Main{
    public static void main(String[] args){
        printPrime(10);
        int n=1;
        if(isPrime(n)){
            System.out.println(n+"isPrime");
        }
        else{
            System.out.println(n+" isNotPrime");
        }
    }
    public static void printPrime(int n){
        for(int i=2;i<=n;i++){
            boolean isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i+" ");
            }
        }
    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
            return true;
    }
}