package org.chavez.foro_hub.foro.service.impl;

import lombok.RequiredArgsConstructor;
import org.chavez.foro_hub.foro.dto.RequestAnswer;
import org.chavez.foro_hub.foro.dto.ResponseAnswer;
import org.chavez.foro_hub.foro.models.Answer;
import org.chavez.foro_hub.foro.models.Topic;
import org.chavez.foro_hub.foro.repository.IAnswerRepository;
import org.chavez.foro_hub.foro.utils.ForoMapperService;
import org.chavez.foro_hub.foro.service.IAnswerService;
import org.chavez.foro_hub.foro.service.ITopicService;
import org.chavez.foro_hub.global.dto.ResponsePage;
import org.chavez.foro_hub.security.models.User;
import org.chavez.foro_hub.security.service.IUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class AnswerServiceImpl implements IAnswerService {

    private final IAnswerRepository answerRepository;
    private final ITopicService topicService;
    private final IUserService userService;
    private final ForoMapperService  foroMapperService;

    @Transactional
    @Override
    public ResponseAnswer createNewAnswer(RequestAnswer requestAnswer) {
        String username = userService.extractUsernameOfSecurityContext();
        User user = userService.findUserByUsername(username);
        Topic topic = topicService.findEntityTopicById(requestAnswer.idTopic());
        Answer answer = foroMapperService.mapToAnswer(requestAnswer);
        answer.setCreatedAt(LocalDateTime.now());
        answer.setTopic(topic);
        answer.setUser(user);
        return foroMapperService.mapToAnswerResponse(answerRepository.save(answer));
    }

    @Override
    public ResponsePage<ResponseAnswer> findAllAnswerByIdTopic(Long idTopic, Pageable pageable) {
        Page<Answer> answers = answerRepository.findAllByTopic_IdTopic(idTopic,pageable);
        return ResponsePage.from(answers.map(foroMapperService::mapToAnswerResponse));
    }
}
