package ru.mochalov.MySecondTestAppSpringBoot.service;

import jakarta.validation.ValidationException;
import ru.mochalov.MySecondTestAppSpringBoot.exception.ValidationFailedException;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Service
public interface ValidationService {
    void isValid(BindingResult result) throws ValidationFailedException;
}
