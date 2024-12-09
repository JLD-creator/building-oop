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
    public void findAparment(String door, int plant){
        for (Aparment aparment: aparments){
            if (aparment.getDoor().equals(door) && aparment.getPlant()==plant){
                System.out.println(aparment);
            }
        }
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
        return Objects.equals(direction, building.direction) && Objects.equals(municipiality, building.municipiality) && Objects.deepEquals(aparments, building.aparment);
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
                ", aparment=" + Arrays.toString(aparments) +
                '}';
    }
}
