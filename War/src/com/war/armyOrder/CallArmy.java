package com.war.armyOrder;

import com.war.armyentity.ArmyEntity;
import com.war.armystrengthprocessor.ArmyStrengthProcessor;

import java.util.LinkedList;

public class CallArmy {

    public void callArmy(ArmyEntity lengaburu, ArmyEntity falicornia){
        ArmyStrengthProcessor strengthProcessor = new ArmyStrengthProcessor();
        strengthProcessor.SubsititutionAndAdjacentRuleImplemetation(strengthProcessor.LikeToLikeRuleImplementation(lengaburu,falicornia),falicornia);
    };
}
