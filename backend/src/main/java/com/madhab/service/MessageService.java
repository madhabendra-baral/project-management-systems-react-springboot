package com.madhab.service;

import java.util.List;

import com.madhab.exception.ChatException;
import com.madhab.exception.ProjectException;
import com.madhab.exception.UserException;
import com.madhab.model.Message;

public interface MessageService {

    Message sendMessage(Long senderId, Long chatId, String content) throws UserException, ChatException, ProjectException;

    List<Message> getMessagesByProjectId(Long projectId) throws ProjectException, ChatException;
}

