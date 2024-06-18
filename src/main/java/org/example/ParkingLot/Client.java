package org.example.ParkingLot;

import org.example.ParkingLot.controllers.TicketController;
import org.example.ParkingLot.dtos.IssueTicketRequestDto;
import org.example.ParkingLot.dtos.IssueTicketResponseDto;
import org.example.ParkingLot.models.Gate;
import org.example.ParkingLot.models.Ticket;
import org.example.ParkingLot.models.VehicleType;
import org.example.ParkingLot.repositories.GateRepository;
import org.example.ParkingLot.repositories.ParkingLotRepository;
import org.example.ParkingLot.repositories.TicketRepository;
import org.example.ParkingLot.repositories.VehicleRepository;
import org.example.ParkingLot.services.TicketService;

public class Client {
    public static void main(String[] args) {
        //Create a Ticket.
        IssueTicketRequestDto requestDto = new IssueTicketRequestDto();
        requestDto.setGateId(123L);
        requestDto.setVehicleType(VehicleType.SUV);
        requestDto.setVehicleNumber("KA12X6789");
        requestDto.setVehicleOwnerName("Krithi");

        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                parkingLotRepository,
                ticketRepository
        );

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketResponseDto responseDto = ticketController.issueTicket(requestDto);
        Ticket ticket = responseDto.getTicket();
    }
}
