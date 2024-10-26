package com.myapp.spring.model;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="JPA_TICKETS")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String description;
	
	private LocalDateTime createdDate;
	
	private LocalDateTime closedDate;
	
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@ManyToOne
	@JoinColumn(name = "assignedAgent")
	private Agent assignedAgent;
	
	
	public Ticket() {
		// TODO Auto-generated constructor stub
	}


	public Ticket(String description, LocalDateTime createdDate, LocalDateTime closedDate, Status status) {
		this.description = description;
		this.createdDate = createdDate;
		this.closedDate = closedDate;
		this.status = status;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDateTime getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}


	public LocalDateTime getClosedDate() {
		return closedDate;
	}


	public void setClosedDate(LocalDateTime closedDate) {
		this.closedDate = closedDate;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}
	


	public Agent getAssignedAgent() {
		return assignedAgent;
	}


	public void setAssignedAgent(Agent assignedAgent) {
		this.assignedAgent = assignedAgent;
	}


	@Override
	public int hashCode() {
		return Objects.hash(closedDate, createdDate, description, id, status);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Ticket))
			return false;
		Ticket other = (Ticket) obj;
		return Objects.equals(closedDate, other.closedDate) && Objects.equals(createdDate, other.createdDate)
				&& Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& status == other.status;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ticket [id=");
		builder.append(id);
		builder.append(", description=");
		builder.append(description);
		builder.append(", createdDate=");
		builder.append(createdDate);
		builder.append(", closedDate=");
		builder.append(closedDate);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
	
}
