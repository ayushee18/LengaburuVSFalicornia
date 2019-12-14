package com.war.armystrengthprocessor;

import com.war.armyentity.ArmyEntity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class ArmyStrengthProcessor {

    HashMap<String, Double> armyDeploy = new HashMap<>();
    String result = "";

    public ArmyEntity LikeToLikeRuleImplementation(ArmyEntity lengaburu, ArmyEntity falicornia) {
        if(falicornia.getHorses()/2 <= lengaburu.getHorses()) {
            double value = Math.round(falicornia.getHorses()/2);
            armyDeploy.put("horses", value);
            lengaburu.setHorses(lengaburu.getHorses() - value);
        } else {
            armyDeploy.put("horses", lengaburu.getHorses());
            lengaburu.setHorses(0);
        }

        if(falicornia.getElephants()/2 <= lengaburu.getElephants()) {
            double value = Math.round(falicornia.getElephants()/2);
            armyDeploy.put("elephants",value);
            lengaburu.setElephants(lengaburu.getElephants() - value);
        } else {
            armyDeploy.put("elephants", lengaburu.getElephants());
            lengaburu.setElephants(0);
        }

        if(falicornia.getArmouredTanks()/2 <= lengaburu.getArmouredTanks()) {
            double value = Math.round(falicornia.getArmouredTanks()/2);
            armyDeploy.put("armouredTanks",value );
            lengaburu.setArmouredTanks(lengaburu.getArmouredTanks() - value);
        } else {
            armyDeploy.put("armouredTanks", lengaburu.getArmouredTanks());
            lengaburu.setArmouredTanks(0);
        }

        if(falicornia.getSlingGuns()/2 <= lengaburu.getSlingGuns()) {
            double value = Math.round(falicornia.getSlingGuns()/2);
            armyDeploy.put("slingGuns", value);
            lengaburu.setSlingGuns(lengaburu.getSlingGuns() - value);
        } else {
            armyDeploy.put("slingGuns", lengaburu.getSlingGuns());
            lengaburu.setSlingGuns(0);
        }

        return lengaburu;
    }


    public void SubsititutionAndAdjacentRuleImplemetation(ArmyEntity lengaburu, ArmyEntity falicornia) {
    if (Math.round(falicornia.getHorses() ) > 2*armyDeploy.get("horses")) {
            double difference = Math.round(falicornia.getHorses()) - 2*armyDeploy.get("horses");
            double tempValue = armyDeploy.get("elephants");
            if (lengaburu.getElephants() >= difference / 4) {
                armyDeploy.put("elephants", tempValue + Math.round(difference/4));
                lengaburu.setElephants(lengaburu.getElephants() - Math.round(difference/4));
            } else {
                armyDeploy.put("elephants", tempValue + lengaburu.getElephants());
                lengaburu.setElephants(0);
                result = "loses";
            }
        }
        if (Math.round(falicornia.getElephants() / 2 ) > armyDeploy.get("elephants")) {
            double difference = Math.round(falicornia.getElephants() / 2 ) - armyDeploy.get("elephants");
            if (difference <= lengaburu.getHorses()) {
                double tempValue = armyDeploy.get("horses");
                armyDeploy.put("horses", tempValue + difference*2);
                lengaburu.setHorses(lengaburu.getHorses() - difference*2);
            } else {
                difference = difference - lengaburu.getHorses();
                double temp = armyDeploy.get("horses");
                armyDeploy.put("horses", temp + lengaburu.getHorses());
                lengaburu.setHorses(0);
                double tempValue = armyDeploy.get("armouredTanks");
                if (lengaburu.getArmouredTanks() >= difference / 4) {
                    armyDeploy.put("armouredTanks", tempValue + difference);
                    lengaburu.setArmouredTanks(lengaburu.getArmouredTanks() - difference);
                } else {
                    armyDeploy.put("armouredTanks", tempValue + lengaburu.getArmouredTanks());
                    lengaburu.setArmouredTanks(0);
                    result = "loses";
                }
            }
        }

        if (Math.round(falicornia.getArmouredTanks() / 2 ) > armyDeploy.get("armouredTanks")) {
            double difference = Math.round(falicornia.getArmouredTanks() / 2 ) - armyDeploy.get("armouredTanks");
            if (difference <= lengaburu.getElephants()) {
                double tempValue = armyDeploy.get("elephants");
                armyDeploy.put("elephants", tempValue + difference*2);
                lengaburu.setElephants(lengaburu.getElephants() - difference*2);
            } else {
                difference = difference - lengaburu.getElephants();
                double temp = armyDeploy.get("elephants");
                armyDeploy.put("elephants", temp + lengaburu.getElephants());
                lengaburu.setElephants(0);
                double tempValue = armyDeploy.get("slingGuns");
                if (lengaburu.getSlingGuns() >= difference / 4) {
                    armyDeploy.put("slingGuns", tempValue + difference);
                    lengaburu.setArmouredTanks(lengaburu.getSlingGuns() - difference);
                } else {
                    armyDeploy.put("slingGuns", tempValue + lengaburu.getSlingGuns());
                    lengaburu.setSlingGuns(0);
                    result = "loses";
                }
            }
        }

        if (Math.round(falicornia.getSlingGuns() / 2 ) > armyDeploy.get("slingGuns")) {
            double difference = falicornia.getSlingGuns() / 2 - armyDeploy.get("slingGuns");
            if (difference <= lengaburu.getArmouredTanks()) {
                double tempValue = armyDeploy.get("armouredTanks");
                armyDeploy.put("armouredTanks", tempValue + difference*2);
                lengaburu.setArmouredTanks(lengaburu.getArmouredTanks() - difference*2);
            } else {
                double tempValue = armyDeploy.get("armouredTanks");
                armyDeploy.put("armouredTanks", tempValue + lengaburu.getArmouredTanks());
                lengaburu.setArmouredTanks(0);
                result = "loses";
            }
        }

        if(result.equalsIgnoreCase(null) || result.isEmpty() || result.equalsIgnoreCase(""))
            result = "wins";

        System.out.println(armyDeploy + " " + result);
    }
}
