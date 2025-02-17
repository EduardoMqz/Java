public class II_expressionsStatements {

    public static void main(String[] args) throws Exception {
        keywordsAndExpressions();
        statementsWhiteSpace();
        ifThenElseControl();
        ifThenElseChallenge(800);
        methodCalculateScore(true, 8, 200, 800);
        System.out.printf("Your final score was %s%n", methodCalculateScore(true, 8, 200, 800));
        methodChallenge("Tim", 5, 1111);
        checkNumber(5);
        System.out.println(toMilesPerHour(25.42));
        printMegaBytesAndKiloBytes(2500);
        System.out.println(shouldWakeUp(true, -1));
        System.out.println(leapYear(2000));
        System.out.println(areEqualByThreeDeciamalPlaces(-3.1756, 3.175));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasTeen(22, 44, 33));
        methodOverloading("Allen", 1523);
        methodOverloading( 1523);
        methodOverloading();
        System.out.println(convertToCentimeters(1));
        System.out.println(convertToCentimeters(6,0));
        getDurationString(13225,45);
        getDurationString(24578);

    }

    public static void keywordsAndExpressions() {
        double kilometer = (100 * 1.609344);// 2 expressions
        int highScore = 50;// 1 expression
        if (highScore > 25) {// 1 expression
            highScore = 1000 + highScore;// 2 expressions
        }
        int health = 1000;//
        if ((health < 25) && (highScore > 1000)) {// 6 expression in this 3 lines
            highScore = highScore - 1000;//
        }
    }

    public static void statementsWhiteSpace() {
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("this is a test");
        int anotherVariable = 50;
        myVariable--;
        if (myVariable == 0) {
            System.out.println("Its now zero");
        }
    }

    public static void ifThenElseControl() {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;
        if (score == 5000) {
            System.out.println("Your score was 5000");
        }
        if (score <= 5000) {
            System.out.println("your score was less than 5000");
        } else {
            System.out.println("go here");
        }
        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less n 1000");
        } else {
            System.out.println("go here");
        }
    }

    public static void ifThenElseChallenge(int score) {
        boolean gameOver = true;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.printf("Your final score was %s%n", finalScore);
        }
    }

    public static int methodCalculateScore(boolean gameOver, int levelCompleted, int bonus, int score) {
        if (gameOver) {
            score += (levelCompleted * bonus);
        }
        return score;
    }

    public static void methodChallenge(String name, int position, int score) {
        System.out.printf("%s managed to get into position %d on the high score list%n", name, position);
        int positionScore = 4;
        if (score >= 1000) {
            positionScore = 1;
        } else if (score >= 500) {
            positionScore = 2;
        } else if (score >= 100) {
            positionScore = 3;
        }
        System.out.println(positionScore);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static int toMilesPerHour(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            return -1;
        } else {
            return (int) Math.round(kilometerPerHour / 1.609);
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid value");
        } else {
            System.out.printf("%s KB = %s MB and %s KB%n", kiloBytes, kiloBytes / 1024, kiloBytes % 1024);
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (barking && (hourOfDay < 8 || hourOfDay > 23)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean leapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return false;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean areEqualByThreeDeciamalPlaces(double param1, double param2) {
        int num1 = (int) param1 * 1000;
        int num2 = (int) param2 * 1000;
        return num1 == num2;
    }

    public static boolean hasEqualSum(int num1, int num2, int total) {
        if (num1 + num2 == total) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        if (num1 >= 13 && num1 <= 19) {
            return true;
        } else if (num2 >= 13 && num2 <= 19) {
            return true;
        } else if (num3 >= 13 && num3 <= 19) {
            return true;
        }
        return false;
    }

    public static int methodOverloading(String playerName, int score){
        System.out.printf("player %s scored %d%n",playerName, score);
        return score * 1000;
    }

    public static int methodOverloading(int score){
        System.out.printf("Unnamed player scored %d%n", score);
        return score * 1000;
    }

    public static int methodOverloading(){
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double convertToCentimeters(int inches){
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feets, int inches){
        int newIches = feets * 12;
        newIches += inches;
        return convertToCentimeters(newIches);
        //return convertToCentimeters((feet * 12) + inches);
    }

    public static String getDurationString(int seconds){
        if (seconds < 0) {
            return "NaN";
        }
        int hour = seconds / 3600;
        int minute = (seconds % 3600) / 60;
        int second = ((seconds % 3600) % 60) / 60;
        System.out.printf("%sH %sm %ss%n",hour, minute,second);
        return "%Sh %sm %Ss";
    }

    public static String getDurationString(int minutes, int seconds){
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            System.out.println("NaN");
            return "NaN";
        }
        int newSeconds = (minutes * 60) + seconds;
        int hour = newSeconds / 3600;
        int minute = (newSeconds % 3600) / 60;
        System.out.printf("%sH %sm %ss%n",hour, minute,seconds);
        return hour+"h YYm ZZs";
    }

    
}