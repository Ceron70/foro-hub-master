package org.chavez.foro_hub.security.service;

import org.chavez.foro_hub.global.dto.ResponsePage;
import org.chavez.foro_hub.security.dto.RequestModule;
import org.chavez.foro_hub.security.dto.ResponseModule;
import org.springframework.data.domain.Pageable;

public interface IModuleService {
    ResponsePage<ResponseModule> getAllModules(Pageable pageable);

    ResponseModule findModuleById(Long idModule);

    ResponseModule saveNewModule(RequestModule requestModule);

    ResponseModule updateModule(Long idModule,RequestModule requestModule);

    void deleteModule(Long idModule);
}
