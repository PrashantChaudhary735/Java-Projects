public class MethodOverloading {

//        static void change(int a) {
//        a = 98;
//        }
//        static void changeArray(int [] arr)
//        {
//            arr[0] = 43;
//        }

    static void foo()
    {
        System.out.println("Goood Morning, bro!");
    }
    static void foo(int a)
    {
        System.out.println("Good Morning, " + a + " bro!");
    }



    static void main(String[] args) {

//      Changing the integer:
//        int x = 34;
//        change(x);
//        System.out.println(x);
//        Changing an array:
//        int[] marks = {52, 54, 78, 89, 83};
//        System.out.println(marks[0]);
//        changeArray(marks);
//        System.out.println(marks[0]);

//        Method Overloading
        foo();
        int a = 300;
        foo(a);


    }
}
