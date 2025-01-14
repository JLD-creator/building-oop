package components;

import model.Building;

import java.util.Scanner;

public class BuildingAppMenu {
    private final Scanner scanner;
    private final BuildingReader buildingReader;

    public BuildingAppMenu(Scanner scanner, BuildingReader buildingReader) {
        this.scanner = scanner;
        this.buildingReader = buildingReader;
    }

    public void run() {
        Building building = buildingReader.read();
        int option;
        do {
            System.out.println("1. Mostrar información del edificio");
            System.out.println("2. Mostrar apartamentos de una planta");
            System.out.println("3. Mostrar datos segun planta y puerta");
            System.out.println("4. Mostrar propietarios de apartamentos segun puerta y planta");
            System.out.println("5. Salir");
            System.out.println("Elige una opción");
            option = scanner.nextInt();
            if (option == 1) {
                building.showInfo();
            } else if (option == 2) {
                System.out.println("Introduce una planta");
                int floor = scanner.nextInt();
                scanner.nextLine();
                building.showFloorAparments(floor);

            } else if (option == 3) {
                System.out.println("Introduce una planta");
                int plant = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduce una puerta");
                String door = scanner.nextLine();
                building.findOwners(plant, door);
            } else if (option == 4) {
                System.out.println("Introduce una planta");
                int plant = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduce una puerta");
                String door = scanner.nextLine();
                building.findAparment(door, plant);
            } else if (option == 5) {
                System.out.println("Saliendo ...");
            }
        } while (option != 5);
    }
}
