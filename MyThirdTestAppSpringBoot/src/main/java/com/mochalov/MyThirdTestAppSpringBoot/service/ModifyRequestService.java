package com.mochalov.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;

import com.mochalov.MyThirdTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
