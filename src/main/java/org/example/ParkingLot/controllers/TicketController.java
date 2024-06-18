package org.example.ParkingLot.controllers;

import org.example.ParkingLot.dtos.IssueTicketRequestDto;
import org.example.ParkingLot.dtos.IssueTicketResponseDto;
import org.example.ParkingLot.dtos.ResponseStatus;
import org.example.ParkingLot.exceptions.GateNotFoundException;
import org.example.ParkingLot.models.Ticket;
import org.example.ParkingLot.services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto requestDto) {
        IssueTicketResponseDto responseDto = new IssueTicketResponseDto();
        try {
           Ticket ticket = ticketService.issueTicket(
                   requestDto.getGateId(),
                   requestDto.getVehicleNumber(),
                   requestDto.getVehicleOwnerName(),
                   requestDto.getVehicleType()
           );

           responseDto.setTicket(ticket);
           responseDto.setResponseStatus(ResponseStatus.SUCCESS);

        } catch (GateNotFoundException gateNotFoundException) {
           gateNotFoundException.getMessage();
           responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }
}
