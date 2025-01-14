import components.*;
import model.Aparment;
import model.Building;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PropietaryReader propietaryReader = new PropietaryReader(scanner);
        AparmentReader aparmentReader = new AparmentReader(scanner, propietaryReader);
        BuildingReader buildingReader = new BuildingReader(scanner, aparmentReader);
        BuildingAppMenu buildingAppMenu = new BuildingAppMenu(scanner, buildingReader);
        buildingAppMenu.run();
    }
}