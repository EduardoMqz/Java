import java.util.Scanner;

public class III_controlFlow {
    public static void main(String[] args) throws Exception {
        switchStatement(5);
        System.out.println(getQuarter("fEbRuArY"));
        traditionalSwitchChallenge('A');
        printDayOfWeek(6);
        forStatement(10);
        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        forLoopChallenge(26);
        sum3And5(457);
        whileAndDoWhile();
        System.out.println(readingUserInputConsole(2025));
        System.out.println(readingUserInputScanner(2025));
        readingUserInputChallenge();
        minMaxChallenge();

    }

    public static void switchStatement(int value) {
        if (value == 1) {
            System.out.printf("(if) Value was %s%n", value);
        } else if (value == 2) {
            System.out.printf("(if) Value was %s%n", value);
        } else {
            System.out.println("(if) Was not 1 or 2");
        }
        switch (value) {
            case 1:
            case 2:
                System.out.printf("(regular switch) Value was %s%n", value);
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("(regular switch) Was a 3, 4 or 5");
                System.out.printf("(regular switch) actually it was %s%n", value);
                break;
            default:
                System.out.println("(regular switch) Was not 1 or 2");
                break;
        }
        switch (value) {
            case 1, 2 -> System.out.printf("(enchanced switch) Value was %s%n", value);
            case 3, 4, 5 -> {
                System.out.println("(enchanced switch) Was a 3, 4 or 5");
                System.out.printf("(enchanced switch) actually it was %s%n", value);
            }
            default -> System.out.println("(enchanced switch) Was not 1 or 2");
        }
    }

    public static String getQuarter(String month) {
        switch (month.toUpperCase()) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4th";
        }
        return switch (month.toUpperCase()) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "bad";
        };
    }

    public static void traditionalSwitchChallenge(char natoChar) {
        switch (natoChar) {
            case 'A':
                System.out.printf("%c is Able%n", natoChar);
                break;
            case 'B':
                System.out.printf("%c is Baker", natoChar);
                break;
            case 'C':
                System.out.printf("%c is Charlie", natoChar);
                break;
            case 'D':
                System.out.printf("%c is Dog", natoChar);
                break;
            case 'E':
                System.out.printf("%c is Easy", natoChar);
                break;
            default:
                System.out.printf("Letter %c not found in the switch%n", natoChar);
                break;
        }
    }

    public static void printDayOfWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.printf("%s stands for %s%n", day, dayOfWeek);
    }

    public static void forStatement(int countTo) {
        for (int i = 1; i <= countTo; i++) {
            System.out.printf("Your counter is: %s%n", i);
        }
        System.out.println("10,000 at 2% interest = $" + calculateInterest(10000, 2.0));
        for (double rate = 3; rate <= countTo; rate++) {
            System.out.printf("10,000 at %.2f%% interest = $" + calculateInterest(10000, rate) + "%n", rate);
        }
        for (double rate = 7.5; rate <= 10; rate = rate += 0.25) {
            double interestAmount = calculateInterest(100, rate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.printf("100 at %.2f%% interest = $" + interestAmount + "%n", rate);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static void forLoopChallenge(int number) {
        int primeCounter = 0;
        for (; number <= 1000; number++) { // for (;primeCounter < 3 && number <= 1000; number++)
            if (isPrime(number)) {
                System.out.printf("%s is a prime number%n", number);
                primeCounter++;
                if (primeCounter == 3) {
                    System.out.println("Found 3 - Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void sum3And5(int initialValue) {
        int sum = 0;
        int count = 0;
        for (int i = initialValue; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sum += i;
                System.out.printf("%s can be divided by 3 and 5%n", i);
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.printf("Total: %s%n", sum);
    }

    public static void whileAndDoWhile() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Inside for loop i = " + i);
        }
        int j = 1;

        while (j <= 5) {
            System.out.println("Inside while i =" + j);
            j++;
        }
        j = 1;
        do {
            System.out.println("Inside do while i =" + j);
            j++;
        } while (j <= 5);
        j = 0;
        while (j < 50) {
            j += 5;
            if (j % 25 == 0) {
                continue;
            }
            System.out.println(j + "__");
        }
    }

    public static String readingUserInputConsole(int currentYear) {
        String name = System.console().readLine("What's your name?");
        System.out.printf("Thanks %s for answering my question%n", name);
        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So you are " + age + " years old";
    }

    public static String readingUserInputScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.printf("Thanks %s for answering my question%n", name);
        System.out.println("What year were you born?");
        boolean validOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >=" + (currentYear - 125) + " and <= " + (currentYear));
            try {
                // String dateOfBirth = scanner.nextLine();
                // age = checkData(currentYear, dateOfBirth);
                age = checkData(currentYear, scanner.nextLine());
                validOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters not allowed!! try again");
            }
        } while (!validOB);
        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }
        return (currentYear - dob);
    }

    public static void readingUserInputChallenge() {
        int countValidNumber = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Enter number #%s: %n", countValidNumber);
            try {
                int number = Integer.parseInt(scanner.nextLine());
                countValidNumber++;
                sum += number;
            } catch (NumberFormatException badUserInput) {
                System.out.println("Characters not allowed!! try again");
            }
        } while (countValidNumber < 5);
        System.out.printf("The sum of the numbers = %s%n", sum);
    }

    public static void minMaxChallenge() {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        do {
            System.out.println("What's your number?");
            try {
                int number = Integer.parseInt(scanner.nextLine());
                min = (min == 0) || (number < min) ? number : min;
                max = (min == 0) || (number > max) ? number : max;
            } catch (Exception e) {
                break;
            }
        } while (true);

        if ((min != 0) && (max != 0)) {
            System.out.printf("min = %s , and max = %s%n", min, max);
        } else {
            System.out.println("No valid data entered");
        }
    }

}
