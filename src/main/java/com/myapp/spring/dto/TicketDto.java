package com.myapp.spring.dto;

import java.time.LocalDateTime;

import com.myapp.spring.model.Status;

public record TicketDto(
		 Long id,
		
		 String description,
		 
		Status status,
		
		LocalDateTime createdDate,
		
		 LocalDateTime closedDate,
		
		 String assignedAgent,
		 
		 String resoutionSummary
		
		) {

}
