import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Chapter3Workbench {
    public static void main(String[] args) {
        /*
        1. Write an if statement that assigns 100 to x when y is equal to 0.
         */
        int x, y = 0;
        if (y == 0) {
            x = 100;
        } else {
            x = 0;
        }

        System.out.println("Y: " + y);
        System.out.println("X: " + x);

        /*
        2. Write an if-else statement that assigns 0 to x when y is equal to 10. Otherwise, it should assign 1 to x.
         */
        y = 1;
        if (y == 0) {
            x = 0;
        } else {
            x = 1;
        }
        System.out.println("X: " + x);

        /*
        3. Using the following chart, write an if-else-if statement that assigns .10, .15, or .20
        to commission, depending on the value in sales.
        Sales                   Commission Rate
        ---------------------------------------
        Up to $10,000:              10%
        $10,000 to $15,000:         15%
        Over $15,000:               20%
         */

        double sales = 0, commission = 0;
        if (sales > 15000) {
            commission = .2;
        } else if (sales >= 10_000 || sales <= 15_000) {
            commission = .15;
        } else {
            commission = .1;
        }

        System.out.printf("Commission: %.2f", commission);
        System.out.println("%");

        /*
        4. Write an if statement that sets the variable hours to 10 when the boolean flag variable
        minimum is equal to true.
         */

        int hour = 0;
        boolean minimum = true;
        if (minimum) {
            hour = 10;
        }
        System.out.println("Hour: " + hour);

        /*
        5. Write nested if statements that perform the following tests: If amount1 is greater than
        10 and amount2 is less than 100, display the greater of the two.
         */

        double amount1 = 52, amount2 = 33;
        if (amount1 > 10 && amount2 < 100) {
            System.out.println(Math.max(amount1, amount2));
        }

        /*
        6. Write an if statement that prints the message “The number is valid” if the variable
        grade is within the range 0 through 100.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter grade: ");
        double grade = scanner.nextInt();
        if (grade > 0 && grade < 100) {
            System.out.println("Grade is valid");
        } else {
            System.out.println("Grade is invalid");
        }
        scanner.nextLine();
        /*
        9. Write an if-else statement that displays the String objects title1 and title2 in
        alphabetical order.
         */

        System.out.println((int) 'A');
        System.out.println((int) 'a');
        System.out.println("Small".compareTo("small"));

        String title1, title2;
        System.out.println("Title 1: ");
        title1 = scanner.nextLine();

        System.out.println("Title 2: ");
        title2 = scanner.nextLine();

        ArrayList<String> listOfWords = new ArrayList<String>();
        listOfWords.add(title1);
        listOfWords.add(title2);
        Collections.sort(listOfWords);
        System.out.println(listOfWords);

        for (String word : listOfWords) {
            System.out.println(word);
        }

    }
}