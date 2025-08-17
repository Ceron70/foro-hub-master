package org.chavez.foro_hub.security.service;

import org.chavez.foro_hub.security.dto.RequestAuthentication;
import org.chavez.foro_hub.security.dto.ResponseAuthentication;

public interface IAuthenticationService {
    ResponseAuthentication login(RequestAuthentication requestAuthentication);
}
