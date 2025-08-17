package org.chavez.foro_hub.foro.service;

import org.chavez.foro_hub.foro.dto.RequestAnswer;
import org.chavez.foro_hub.foro.dto.ResponseAnswer;
import org.chavez.foro_hub.global.dto.ResponsePage;
import org.springframework.data.domain.Pageable;

public interface IAnswerService {
    ResponseAnswer createNewAnswer(RequestAnswer requestAnswer);

    ResponsePage<ResponseAnswer> findAllAnswerByIdTopic(Long idTopic, Pageable pageable);
}
