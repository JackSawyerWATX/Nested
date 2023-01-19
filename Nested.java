import java.util.Scanner;

class Nested {
    public static void main(String[] args) {
        int mark, pass;
        char grade;

        pass = 70;

        Scanner input = new Scanner (System.in);

        System.out.println("Grade recieved: ");

        mark = input.nextInt();

        if (mark >= pass) {

            if (mark > 90)
                grade = 'A';
            else if (mark > 80)
                grade = 'B';
            else if (mark > 75)
                grade = 'C';
            else
                grade = 'D';

            System.out.println("You passed and your grade is " + grade);
        }
        else {
            grade = 'F';
            System.out.println("You failed with a " + grade);
        }
    }
}

