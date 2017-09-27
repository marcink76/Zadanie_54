import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        char magicLetter;
        Scanner inputMagicStopLetter = new Scanner(System.in);
        do {

        InputData.getPunkt();

        System.out.println("Czy chcesz wprowadzić następny punkt [y/n]??");
        magicLetter = inputMagicStopLetter.next().charAt(0);

        }while (magicLetter != 'n' && magicLetter != 'N');

    }
}
