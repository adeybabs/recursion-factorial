public class recursiveFactorial {
    static int factorial(int n){
        if (n == 0)
            return 1;
            else
                return (n*factorial(n-1));
    }
    public static void main(String[] args) {
        int i, fact = 1;
        int number = 7; //Number we are to perform factorial on
        fact = factorial(number);
        System.out.println("factorial of " + number + " is " + fact);


    }
}
