public class II_expressions_statements {

    public static void main(String[] args) throws Exception {
        keywordsAndExpressions();
        statementsWhiteSpace();
        ifThenElseControl();
        ifThenElseChallenge(800);
        methodCalculateScore(true, 8, 200, 800);
        System.out.printf("Your final score was %s%n", methodCalculateScore(true, 8, 200, 800));
        methodChallenge("Tim", 5, 1111);

    }

    public static void keywordsAndExpressions(){
        double kilometer = (100 * 1.609344);//2 expressions
        int highScore = 50;// 1 expression
        if ( highScore > 25){// 1 expression
            highScore = 1000 + highScore;//2 expressions
        }
        int health = 1000;//
        if ((health < 25) && (highScore > 1000)) {// 6 expression in this 3 lines
            highScore = highScore -1000;//
        }
    }

    public static void statementsWhiteSpace(){
        int                  myVariable             = 
        50;
        myVariable
         ++;
        myVariable     --
        ;
        System.
        out.
        println                             ("this is a test");
        int anotherVariable = 50; myVariable--;
        if (myVariable == 0) {
            System.out.println("Its now zero");
        }
    }

    public static void ifThenElseControl(){
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;
        if (score == 5000) {
            System.out.println("Your score was 5000");
        }
        if (score <= 5000) {
            System.out.println("your score was less than 5000");
        }else{
            System.out.println("go here");
        }
        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000){
            System.out.println("Your score was less n 1000");
        }else{
            System.out.println("go here");
        }
    }

    public static void ifThenElseChallenge(int score){
        boolean gameOver = true;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.printf("Your final score was %s%n", finalScore);
        }
    }

    public static int methodCalculateScore(boolean gameOver, int levelCompleted, int bonus, int score){
        if (gameOver) {
            score += (levelCompleted * bonus);   
        }
        return score;
    }

    public static void methodChallenge(String name, int position, int score){
        System.out.printf("%s managed to get into position %d on the high score list%n", name, position);
        if (score >= 1000) {
            System.out.println("1");
        }else if (score >= 500 && score < 1000) {
            System.out.println("2");
        }else if (score >= 100 && score < 500) {
            System.out.println("3");
        }else{
            System.out.println("4");
        }
    }
}

