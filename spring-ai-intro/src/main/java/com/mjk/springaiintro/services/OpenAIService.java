package com.mjk.springaiintro.services;

import com.mjk.springaiintro.model.*;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface OpenAIService {

    GetCapitalWithInfoResponse getCapitalWithInfo(GetCapitalRequest getCapitalRequest);
    GetCapitalResponse getCapital(GetCapitalRequest getCapitalRequest);
    String getAnswer(String question);

    Answer getAnswer(Question question);
}
