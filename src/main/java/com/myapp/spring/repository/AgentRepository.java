package com.myapp.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myapp.spring.model.Agent;

@Repository("agentRepository1")
public interface AgentRepository extends JpaRepository<Agent, Long> {

}
