public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Tim");
        System.out.println("Hello World");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Is it not an alien");
            System.out.println("And i am scared of aliens");
        }
        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score");
        }
        int drugiTopScore = 60;
        if ((topScore > drugiTopScore) && (topScore < 100)) {
            System.out.println("Wiekszy od second top i mniejszy od 100");
        }

        if ((topScore > 90) || (drugiTopScore <= 90)) {
            System.out.println("Jeden albo drugi warunek jest spelniony");
        }
        String test = "BMW";
        boolean test2 = test == "BMW" ? false : true;
        if (test2) {
            System.out.println("testtest");
        }
        }
}
