// Algorithm Workbench Chapter 2
import java.util.Scanner;

class Chapter2Workbench {
    public static void main(String[] args) {

        /*
         * 1. Show how the double variables temp, weight, and age can be declared in one
         * statement.
         */

        double temp, weight, age;

        /*
         * 2. Show how the int variables months, days, and years may be declared in one
         * statement, with months initialized to 2 and years initialized to 3.
         */

        int days, months = 2, years = 3;

        /*
         * 3. Write assignment statements that perform the following operations with the
         * variables a, b, and c. a. Adds 2 to a and stores the result in b b.
         * Multiplies b times 4 and stores the result in a c. Divides a by 3.14 and
         * stores the result in b d. Subtracts 8 from b and stores the result in a e.
         * Stores the character ‘K’ in c f. Stores the Unicode code for ‘B’ in c
         */

        double num1 = 0, num2;
        char num3;
        num2 = num1 + 2;
        num1 = num2 * 4;
        num2 = num1 / 3.14;
        num1 = num2 - 8;
        num3 = 'K';
        num2 = Character.getNumericValue('B');

        /*
         * 4. Assume the variables result, w, x, y, and z are all integers, and that w =
         * 5, x = 4, y = 8, and z = 2. What value will be stored in result in each of
         * the following statements? a. result = x + y; b. result = z * 2; c. result = y
         * / x; d. result = y − z; e. result = w % 2;
         */

        int w = 5, x = 4, y = 8, z = 2;
        System.out.println(x + y);
        System.out.println(z * 2);
        System.out.println(y / x);
        System.out.println(y - z);
        System.out.println(w % 2);

        /*
         * 5. How would each of the following numbers be represented in E notation? a.
         * 3.287 × 10^6 b. −9.7865 × 10^12 c. 7.65491 × 10^−3
         */

        System.out.println(3.287 * 10e6);
        System.out.println(-9.7865 * 10e12);
        System.out.println(7.65491 * 10e-3);

        /*
         * 6. Modify the following program so it prints two blank lines between each
         * line of text. public class { public static void main(String[] args) {
         * System.out.print("Hearing in the distance");
         * System.out.print("Two mandolins like creatures in the");
         * System.out.print("dark"); System.out.print("Creating the agony of ecstasy.");
         * System.out.println(" - George Barker"); } }
         */
        System.out.println();
        System.out.print("Hearing in the distance\n\n");
        System.out.print("Two mandolins like creatures in the\n\n");
        System.out.print("dark\n\n");
        System.out.print("Creating the agony of ecstasy.\n\n");
        System.out.println(" - George Barker");

        /*
         * 7. What will the following code output? int apples = 0, bananas = 2, pears =
         * 10; apples += 10; bananas *= 10; pears /= 10; System.out.println( apples +
         * " " + bananas + " " + pears);
         *
         * apples = 10 bananas = 20 pears = 1
         */

        /*
         * 8. What will the following code output? double d = 12.9; int i = (int)d;
         * System.out.println(i); i = 12
         */

        /*
         * 11. Convert the following pseudocode to Java code. Be sure to declare the
         * appropriate variables. Store 20 in the speed variable. Store 10 in the time
         * variable. Multiply speed by time and store the result in the distance
         * variable. Display the contents of the distance variable.
         */

        double speed = 20.0, time = 10.0, distance;
        distance = speed * time;
        System.out.println();
        System.out.println("Distance: " + distance + "\n");

        /*
         * 12. Convert the following pseudocode to Java code. Be sure to declare the
         * appropriate variables. Store 172.5 in the force variable. Store 27.5 in the
         * area variable. Divide area by force and store the result in the pressure
         * variable. Display the contents of the pressure variable.
         */

        double pressure, force = 172.5, area = 27.5;
        pressure = area / force;
        System.out.println("Pressure: " + pressure + "\n");

        /*
         * 13. Write the code to set up all the necessary objects for reading keyboard
         * input. Then write code that asks the user to enter his or her desired annual
         * income. Store the input in a double variable.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("What is your annual income: ");
        double annualIncome = input.nextDouble();
        System.out.println(annualIncome);

        /*
         * 15. A program has a float variable named total and a double variable named
         * number. Write a statement that assigns number to total without causing an
         * error when compiled.
         */

        float total = 0f;
        double number = 0;
        total = (float) number;
        System.out.println(total);

    }
}