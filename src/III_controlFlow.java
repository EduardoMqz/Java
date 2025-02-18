public class III_controlFlow {
    public static void main(String[] args) throws Exception {
        switchStatement(5);
        System.out.println(getQuarter("fEbRuArY"));
        traditionalSwitchChallenge('A');
        printDayOfWeek(6);

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
            case 2 ->"Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.printf("%s stands for %s", day, dayOfWeek);

    }
}
