package com.mochalov.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;

import com.mochalov.MyThirdTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
