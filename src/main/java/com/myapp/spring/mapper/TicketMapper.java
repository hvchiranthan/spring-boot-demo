package com.myapp.spring.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.myapp.spring.dto.TicketDto;
import com.myapp.spring.model.Ticket;

@Mapper(componentModel = "spring")
public interface TicketMapper extends GenericMapper<TicketDto, Ticket> {
	TicketMapper INSTANCE = Mappers.getMapper(TicketMapper.class);

}
