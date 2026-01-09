package com.madhab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhab.model.Chat;
import com.madhab.model.Project;

public interface ChatRepository extends JpaRepository<Chat, Long> {
    

	Chat findByProject(Project projectById);
	
//	List<Chat> findByProjectNameContainingIgnoreCase(String projectName);
}

