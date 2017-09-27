public class CoordinateSystem {

    public static void coordinateCheck(Punkt punkt){
        if (punkt.getxCoordinate() < 0 && punkt.getyCoordinate() > 0){
            System.out.println("Punkt znajduje się w drugiej cwiatrce układu współrzędnych");
        } else if (punkt.getxCoordinate() > 0 && punkt.getyCoordinate() > 0){
            System.out.println("Punkt znajduje się w pierwszej ćwiatrce układu współrzędnych");
        } else if (punkt.getxCoordinate() < 0 && punkt.getyCoordinate() < 0){
            System.out.println("Punkt znajduje się w trzeciej ćwiatrce układu współrzędnych");
        } else if (punkt.getxCoordinate() > 0 && punkt.getyCoordinate() < 0){
            System.out.println("Punkt znajduje się w czwartej ćwiatrce układu współrzędnych");
        }
    }
}
