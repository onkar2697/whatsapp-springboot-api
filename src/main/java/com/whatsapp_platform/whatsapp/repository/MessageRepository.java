package com.whatsapp_platform.whatsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.whatsapp_platform.whatsapp.model.Message;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends  JpaRepository<Message,Long> {
}
