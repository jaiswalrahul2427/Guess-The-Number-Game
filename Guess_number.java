import java.util.Random;
import java.util.Scanner;

public class Guess_number {
    class Game {
        public int number;
        public int inputNumber;
        public int noOfGuesses;
        public int GuessNum= 0;

        public int getnoOfGuesses() {
            return noOfGuesses;
        }

        public void setnoOfGuesses(int noOfGuesses) {
            this.noOfGuesses = noOfGuesses;
        }

        Game() {
            Random rand = new Random();
            this.number = rand.nextInt(100);
        }

        void takeuseInput() {
            System.out.println("Guess the number:");
            Scanner sc = new Scanner(System.in);
            inputNumber = sc.nextInt();
            // return  inputNumber;
        }

        boolean isCorrectNumber() {
            GuessNum++;
            if (inputNumber == number) {
                System.out.format("Yes you guess is right,it was:%d\nAnd you are achieve it in the:%d steps",number,GuessNum);
                return true;
            } else if (inputNumber < number) {
                System.out.println("Too Low....");
            } else if (inputNumber > number) {
                System.out.println("To High......");
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Guess_number gn = new Guess_number();
        Game g = gn.new Game();
        boolean b = false;
        while (!b) {
             g.takeuseInput();
            b = g.isCorrectNumber();
           // System.out.println(b);
            System.out.println("  ");
        }
    }
}
