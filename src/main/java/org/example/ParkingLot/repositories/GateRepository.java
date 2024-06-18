package org.example.ParkingLot.repositories;

import org.example.ParkingLot.models.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {
    private Map<Long, Gate> gateMap = new HashMap<>();

    public Optional<Gate> findGateById(Long gateId) {
        if (gateMap.containsKey(gateId)) {
            return Optional.of(gateMap.get(gateId));
        }
        return Optional.empty();
    }
}
