package com.mochalov.MyThirdTestAppSpringBoot.service;

import java.util.Date;

import com.mochalov.MyThirdTestAppSpringBoot.model.Response;
import com.mochalov.MyThirdTestAppSpringBoot.util.DateTimeUtil;

public class ModifySystemTimeResponseService implements ModifyResponseService{
    @Override
    public Response modify(Response response) {
        response.setSystemTime(DateTimeUtil.getCustomFormat().format(new Date()));
        return response;
    }
}
