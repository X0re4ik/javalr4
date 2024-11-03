package ru.mochalov.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;

import ru.mochalov.MySecondTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
