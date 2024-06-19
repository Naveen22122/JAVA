  1) switch case Statement

        public class Main {
        public static void main(String[] args) {
        int time = 9;
        switch (time){
        case 12:
        System.out.println("Good Afternoon");
        case 8:
        System.out.println("Good night");
        case 9:
        System.out.println("Good Morning");
        break;
        default:
        System.out.println("black day");
        
        }
        }
        }

    output:
        Good Morning

    * if we print the case without any break then all cases will given in the output.
    * if we give the break statement for particular case the that case will be executed.
..............................................................................

