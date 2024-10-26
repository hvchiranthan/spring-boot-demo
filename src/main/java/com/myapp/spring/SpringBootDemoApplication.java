package com.myapp.spring;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.myapp.spring.dto.TicketDto;
import com.myapp.spring.model.Agent;
import com.myapp.spring.model.Status;
import com.myapp.spring.model.Ticket;
import com.myapp.spring.repository.AgentRepository;
import com.myapp.spring.service.TicketService;

@SpringBootApplication()
//@EnableJpaRepositories("com.myapp.spring1.repository")
// (ComponentScan,EnableAutoConfiguration,SpringBootConfiguration)
public class SpringBootDemoApplication /*implements CommandLineRunner*/{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
		
		
	}
	
	
	
	//@Bean
	CommandLineRunner agentRepository(AgentRepository agentRepository) {
		return args ->{
			agentRepository.save(new Agent("Agent 1"));
			agentRepository.save(new Agent("Agent 2"));
			agentRepository.save(new Agent("Agent 3"));
			agentRepository.save(new Agent("Agent 4"));	
		};
		}
	
	@Bean
	CommandLineRunner ticketService(TicketService ticketService) {
		return args ->{
			
			TicketDto existingTicketDto1 = ticketService.assignAgentToTicket(1L, 1L);
			TicketDto existingTicketDto2 = ticketService.assignAgentToTicket(2L, 1L);
			System.out.println(existingTicketDto1+" "+existingTicketDto2);
//			Ticket newTicket = 
//					ticketService.createNewTicket(new Ticket("Mousenot working", 
//							LocalDateTime.now(), null, 
//							Status.NEW));
//					
//					System.out.println("Ticket Saved "+newTicket);
						
			
		};
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}

}
