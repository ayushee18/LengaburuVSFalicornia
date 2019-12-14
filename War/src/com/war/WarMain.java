package com.war;

import com.war.armyOrder.CallArmy;
import com.war.armyentity.ArmyEntity;
import com.war.armystrengthprocessor.ArmyStrengthProcessor;

import java.util.Scanner;

public class WarMain {

    public static void main(String[] args) {
        ArmyEntity lengaburu = new ArmyEntity(100,50,10,5);
       // ArmyEntity falicornia = new ArmyEntity(150,96,26,8);
        Scanner sc = new Scanner(System.in);
        ArmyEntity falicornia = new ArmyEntity();
        System.out.println("Enter number of horses in falicornia army");
        falicornia.setHorses(sc.nextDouble());
        System.out.println("Enter number of elephants in falicornia army");
        falicornia.setElephants(sc.nextDouble());
        System.out.println("Enter number of armoured tanks in falicornia army");
        falicornia.setArmouredTanks(sc.nextDouble());
        System.out.println("Enter number of sling guns in falicornia army");
        falicornia.setSlingGuns(sc.nextDouble());
        CallArmy callArmy = new CallArmy();
        callArmy.callArmy(lengaburu, falicornia);
    }
}
