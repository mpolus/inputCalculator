import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            try {
                String line = input.nextLine();
                int num = Integer.parseInt(line);
                sum += num;
                count++;
            } catch (Exception e) {
                break;
            }
        }

        int average = 0;
        if (count == 0) {
            average = 0;
        } else {
            average = sum / count;
        }
        System.out.println("Sum: " + sum + " AVG: " + average);


    }
}
