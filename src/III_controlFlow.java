public class III_controlFlow {
    public static void main(String[] args) throws Exception {
        switchStatement(5);
        System.out.println(getQuarter("fEbRuArY"));

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
}
