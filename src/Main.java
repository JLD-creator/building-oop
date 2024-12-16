import components.AparmentReader;
import components.BuildingApp;
import components.BuildingReader;
import components.PropietaryReader;
import model.Aparment;
import model.Building;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PropietaryReader propietaryReader = new PropietaryReader(scanner);
        AparmentReader aparmentReader = new AparmentReader(scanner, propietaryReader);
        BuildingReader buildingReader = new BuildingReader(scanner, aparmentReader);
        BuildingApp buildingApp = new BuildingApp(scanner, buildingReader);
        buildingApp.run();
    }
}