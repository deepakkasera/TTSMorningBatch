package org.example.ParkingLot.repositories;

import org.example.ParkingLot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Long, Ticket> ticketMap = new HashMap<>();
    private Long previousTicketId = 0L;

    public Ticket save(Ticket ticket) {
        if (ticket.getId() == null) {
            previousTicketId += 1;
            ticket.setId(previousTicketId);
            ticketMap.put(previousTicketId, ticket);
        }
        //update the existing object.

        return ticket;
    }
}
