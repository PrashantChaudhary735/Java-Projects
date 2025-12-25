public class Recursion {
    static int factorial(int n) {
        if(n == 0 || n ==1)
        {
            return 1;
        }
        else {
            return n * factorial(n- 1);
        }


    }

    static void main(String[] args) {
        System.out.println("The factorial of value n is: "+ factorial(5));


    }
}
