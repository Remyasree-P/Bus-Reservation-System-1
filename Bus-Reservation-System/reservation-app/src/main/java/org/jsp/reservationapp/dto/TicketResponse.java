package org.jsp.reservationapp.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TicketResponse {
	private int id;
	private LocalDateTime dateOfBooking;
	private double cost;
	private String status;
	private String busName;
	private String source;
	private String destination;
	private String busNumber;
	private LocalDate dateOfDeparture;
	private int numberOfSeatsBooked;
	private String username;
	private long phone;
	private int age;
	private String gender;
}
