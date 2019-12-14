package com.war.armyentity;

public class ArmyEntity {

    private double horses;
    private double elephants;
    private double armouredTanks;
    private double slingGuns;

    public ArmyEntity(){}

    public ArmyEntity(double horses, double elephants, double armouredTanks, double slingGuns) {
        this.horses = horses;
        this.elephants = elephants;
        this.armouredTanks = armouredTanks;
        this.slingGuns = slingGuns;
    }

    public double getHorses() {
        return horses;
    }

    public void setHorses(double horses) {
        this.horses = horses;
    }

    public double getElephants() {
        return elephants;
    }

    public void setElephants(double elephants) {
        this.elephants = elephants;
    }

    public double getArmouredTanks() {
        return armouredTanks;
    }

    public void setArmouredTanks(double armouredTanks) {
        this.armouredTanks = armouredTanks;
    }

    public double getSlingGuns() {
        return slingGuns;
    }

    public void setSlingGuns(double slingGuns) {
        this.slingGuns = slingGuns;
    }

    @Override
    public String toString() {
        return "ArmyEntity{" +
                "horses=" + horses +
                ", elephants=" + elephants +
                ", armouredTanks=" + armouredTanks +
                ", slingGuns=" + slingGuns +
                '}';
    }
}
