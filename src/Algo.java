public class Algo {
    public static void main(String[] args){
        int result=factorial(5);
        System.out.println("fators of n is :"+result);

        int n=10;
        int result1=fibonnacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result1);
    }
    

    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

    // fibonacci sequence
    public static int fibonnacci(int n){
        if(n<=1){
            return n;
        }else{
            return fibonnacci(n -1) + fibonnacci(n -2);
        }
    }
    
}
