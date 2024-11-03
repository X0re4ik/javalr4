package ru.mochalov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;

import ru.mochalov.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
