package org.chavez.foro_hub.security.service;

import org.chavez.foro_hub.global.dto.ResponsePage;
import org.chavez.foro_hub.security.dto.RequestOperation;
import org.chavez.foro_hub.security.dto.ResponseOperation;
import org.chavez.foro_hub.security.models.Operation;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IOperationService {
    List<Operation> getPublicOperations();

    ResponsePage<ResponseOperation> findOperationsByModuleId(Long idModule, Pageable pageable);

    ResponsePage<ResponseOperation> getAllOperations(Pageable pageable);

    ResponseOperation findOperationById(Long idOperation);

    ResponseOperation saveNewOperation(RequestOperation requestOperation);

    ResponseOperation updateOperation(Long idOperation,RequestOperation requestOperation);

    void deleteOperation(Long idOperation);

    ResponsePage<ResponseOperation> findOperationsByRole(Long idRole, Pageable pageable);
}
