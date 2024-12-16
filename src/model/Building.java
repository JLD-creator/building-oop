package model;

import java.util.Arrays;
import java.util.Objects;

public class Building {
    private String direction;
    private String municipiality;
    private Aparment[] aparments;

    public Building(String direction, String municipiality, Aparment[] aparment) {
        this.direction = direction;
        this.municipiality = municipiality;
        this.aparments = aparment;
    }

    public void showInfo() {
        System.out.println("Direccion: " + direction + ", Municipio " + municipiality + ", Apartamentos " + aparments);
    }

    public Aparment findAparment(String door, int plant) {
        for (Aparment aparment : aparments) {
            if (aparment.getDoor().equals(door) && aparment.getPlant() == plant) {
                aparment.showInfo();
            }
        }
        return null;
    }

    public Aparment showFloorAparments( int floor){
        for (Aparment aparment: aparments){
            if (aparment.getPlant() == floor){
                System.out.println(aparment);
            }
        }
        return null;
    }
    public Propietary[] findOwners(int floor, String door){
        Aparment aparment = findAparment(door,floor);
        if (aparment != null){
            return aparment.getPropietary();
        }
        return null;
    }


    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getMunicipiality() {
        return municipiality;
    }

    public void setMunicipiality(String municipiality) {
        this.municipiality = municipiality;
    }

    public Aparment[] getAparment() {
        return aparments;
    }

    public void setAparment(Aparment[] aparment) {
        this.aparments = aparment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(direction, building.direction) && Objects.equals(municipiality, building.municipiality) && Objects.deepEquals(aparments, building.aparments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction, municipiality, Arrays.hashCode(aparments));
    }

    @Override
    public String toString() {
        return "Building{" +
                "direction='" + direction + '\'' +
                ", municipiality='" + municipiality + '\'' +
                ", aparments=" + Arrays.toString(aparments) +
                '}';
    }
}
