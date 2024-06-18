package org.example.ParkingLot.factory;

import org.example.ParkingLot.models.SpotAssignmentStrategyType;
import org.example.ParkingLot.strategies.RandomSpotAssignmentStrategy;
import org.example.ParkingLot.strategies.SpotAssignmentStrategy;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getSpotAssignmentStrategyForType(
            SpotAssignmentStrategyType spotAssignmentStrategyType) {
//        if (spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.NEAREST)) {
//            return new NearestSpotAssignmentStrategy();
//        } else if (spotAssignmentStrategyType.equals(SpotAssignmentStrategyType.CHEAPEST)) {
//            return new CheapestSpotAssignmentStrategy();
//        }
        return new RandomSpotAssignmentStrategy();
    }
}
