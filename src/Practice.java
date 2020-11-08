public class Practice {
    public static void main(String[] args) {

        System.out.println("hello".equalsIgnoreCase("hello"));
        System.out.println("hello".compareTo("hello"));
//        JOptionPane.showMessageDialog(null, "Hello" + " " + "World");
        // Boolean Operator
        int answer;
        answer = 3 <= 3 ? 33 : 0;
        // Conditional operators
        System.out.println(answer);


        int test = 5;

        switch (test) {
            case 1:
                System.out.println("I am 1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("Default");
        }

        double num = 100010.0 / 6.3;
        System.out.printf("%,.2f", num);

    }
}
