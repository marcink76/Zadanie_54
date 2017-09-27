import java.util.Scanner;

public class InputData {
    private static Scanner coordinateRead = new Scanner(System.in);

    public static void getPunkt(){

            Punkt punkt = new Punkt();
            System.out.println("Podaj współrzędną X punktu:");
            punkt.setxCoordinate(coordinateRead.nextInt());
            System.out.println("Podaj współrzędną Y punktu:");
            punkt.setyCoordinate(coordinateRead.nextInt());
            System.out.println("Punkt o współrzędnej X:" + punkt.getxCoordinate() + " oraz współrzędnej Y:" + punkt.getyCoordinate
                    ());
            CoordinateSystem.coordinateCheck(punkt);


    }
}
