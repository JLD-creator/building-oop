package components;

import model.Aparment;
import model.Building;

import java.util.Scanner;

public class BuildingReader {
    private final Scanner scanner;
    private final AparmentReader aparmentReader;

    public BuildingReader(Scanner scanner, AparmentReader aparmentReader) {
        this.scanner = scanner;
        this.aparmentReader = aparmentReader;
    }

    public Building read() {
        System.out.println("Introduce la dirección del edificio");
        String direction = scanner.nextLine();
        System.out.println("Introduce el municipio en el que vives ");
        String municipiality = scanner.nextLine();
        System.out.println("¿Cuantos apartamentos hay?");
        int size = scanner.nextInt();
        scanner.nextLine();
        Aparment[] aparments = new Aparment[size];
        for (int i = 0; i < aparments.length; i++) {
            aparments[i] = aparmentReader.read();

        }
        return new Building(direction, municipiality, aparments);
    }
}
