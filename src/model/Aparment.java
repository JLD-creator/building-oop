package model;

import java.util.Arrays;
import java.util.Objects;

public class Aparment {
    private int plant;
    private String door;
    private Propietary[] propietary;

    public Aparment(int plant, String door, Propietary[] propietary) {
        this.plant = plant;
        this.door = door;
        this.propietary = propietary;
    }

    public int getPlant() {
        return plant;
    }

    public void setPlant(int plant) {
        this.plant = plant;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public Propietary[] getPropietary() {
        return propietary;
    }

    public void setPropietary(Propietary[] propietary) {
        this.propietary = propietary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aparment aparment = (Aparment) o;
        return plant == aparment.plant && Objects.equals(door, aparment.door) && Objects.deepEquals(propietary, aparment.propietary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plant, door, Arrays.hashCode(propietary));
    }

    @Override
    public String toString() {
        return "Aparment{" +
                "plant=" + plant +
                ", door='" + door + '\'' +
                ", propietary=" + Arrays.toString(propietary) +
                '}';
    }
}
