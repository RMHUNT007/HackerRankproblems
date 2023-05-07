import java.util.Scanner;

public class fileformat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}

/*Sure, here's a simple example to illustrate the usage of the String.format() method with the %-15s and %03d format specifiers:

arduino
Copy code
public class FormatExample {
    public static void main(String[] args) {
        String name = "John";
        int age = 30;
        System.out.printf("Name: %-15s Age: %03d%n", name, age);
    }
}
This code will output:

makefile
Copy code
Name: John            Age: 030*/