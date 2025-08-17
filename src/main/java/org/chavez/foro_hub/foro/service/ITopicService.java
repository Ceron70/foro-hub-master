package org.chavez.foro_hub.foro.service;

import org.chavez.foro_hub.foro.dto.RequestTopic;
import org.chavez.foro_hub.foro.dto.ResponseTopic;
import org.chavez.foro_hub.foro.models.Topic;
import org.chavez.foro_hub.global.dto.ResponsePage;
import org.springframework.data.domain.Pageable;

public interface ITopicService {
    ResponseTopic createNewTopic(RequestTopic requestTopic);

    ResponsePage<ResponseTopic> getAllTopicsFiltered(String courseName, Integer year, Pageable pageable);

    ResponseTopic getTopicById(Long idTopic);

    ResponseTopic updateTopicById(Long idTopic, RequestTopic requestTopic);

    void deleteTopicById(Long idTopic);

    Topic findEntityTopicById(Long idTopic);
}
