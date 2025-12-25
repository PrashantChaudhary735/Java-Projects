public class VariableArguments {
//    static int sum(int a, int b)
//    {
//        return a + b;
//    }
//
//    static int sum(int a, int b, int c)
//    {
//        return a + b + c;
//    }

//    Taking all the parameters as an array
        static int sum(int ...arr)
        {
            int result = 0;
            for(int a: arr)
            {
                result  += a;
            }
            return result;
        }
    static void main(String[] args) {
        System.out.println("Welcome to the Varargs Tutorial");
//        int a= 4;
//        int b= 5;
        System.out.println("The sum of 4 and 5 is: " + sum(4,5, 3));
    }
}
