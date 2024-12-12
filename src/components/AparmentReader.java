package components;

import model.Aparment;
import model.Propietary;

import java.util.Scanner;

public class AparmentReader {
    private final Scanner scanner;
    private final PropietaryReader propietaryReader;

    public AparmentReader(Scanner scanner, PropietaryReader propietaryReader) {
        this.scanner = scanner;
        this.propietaryReader = propietaryReader;
    }

    public Aparment read() {
        System.out.println("Introduce la planta en la que vives");
        int plant = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce la letra de la puerta");
        String door = scanner.nextLine();
        System.out.println("Cuantos propietarios hay");
        int size = scanner.nextInt();
        scanner.nextLine();
        Propietary[] propietarys = new Propietary[size];
        for (int i = 0; i < propietarys.length; i++) {
            propietarys[i] = propietaryReader.read();

        }
        return new Aparment(plant, door, propietarys);
    }
}
