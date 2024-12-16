package components;

import model.Aparment;
import model.Building;

import java.util.Scanner;

public class BuildingApp {
    private final Scanner scanner;
    private final  BuildingReader buildingReader;

    public BuildingApp(Scanner scanner, BuildingReader buildingReader) {
        this.scanner = scanner;
        this.buildingReader = buildingReader;
    }
    public void run(){
        Building building = buildingReader.read();
        System.out.println("Introduce un piso");
        String door = scanner.nextLine();
        System.out.println("Introduce una planta");
        int plant = scanner.nextInt();
        scanner.nextLine();
        Aparment aparment = building.findAparment(door,plant);
        if (aparment != null){
            aparment.showInfo();
        } else {
            System.out.println("Piso no encontrado");
        }
        building.showFloorAparments(2);
    }
}
