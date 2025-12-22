public class Arrays {
    static void main(String[] args) {
//        Classroom of 500 students - You have to store marks of these 500 students.
//        int[] marks = new int[5];
//        marks[0] = 100;
//        marks[1] = 60;
//        marks[2] = 75;
//        System.out.println(marks[2]);
//        for(int i = 1; i<= marks.length; i++)
//        {
//            System.out.println(marks[i]);
//        }
        int[] marks = {98, 45, 79, 99, 80};
//        String[] students = {"Harry", "Rohan", "Shubham", "Lavish"};
        System.out.println(marks.length);

//        For-each loop
        for(int element: marks) {
            System.out.println(element);
        }


    }
}
