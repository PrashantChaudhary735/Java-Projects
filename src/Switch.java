public class Switch {
    static void main(String[] args) {
        int age = 60;
        switch (age)
        {
            case 18:
            {
                System.out.println("You are going to become an Adult");
                break;
            }
            case 21:
            {
                System.out.println("You are going to join a job");
                break;
            }
            case 60: {
                System.out.println("You are going to get retired!");
                break;
            }
            default:
            {
                System.out.println("Enjoy your life!");
                break;
            }

        }
    }
}
