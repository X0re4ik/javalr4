package com.mochalov.MyThirdTestAppSpringBoot.service;

import java.util.UUID;

import com.mochalov.MyThirdTestAppSpringBoot.model.Response;

public class ModifyOperationUidResponseService implements ModifyResponseService {
    @Override
    public Response modify(Response response) {
        UUID uuid = UUID.randomUUID();

        response.setOperationUid(uuid.toString());

        return response;
    }
}
