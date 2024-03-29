package com.curibis.contentcalendar.service;

import com.curibis.contentcalendar.config.Config;

import com.google.cloud.vertexai.VertexAI;
import com.google.cloud.vertexai.api.GenerateContentResponse;
import com.google.cloud.vertexai.generativeai.GenerativeModel;
import com.google.cloud.vertexai.generativeai.ResponseHandler;
import org.springframework.stereotype.Repository;

@Repository
public class AIService {

    public String simpleQuestion(String question) throws Exception {
        // Initialize client that will be used to send requests.
        // This client only needs to be created once, and can be reused for multiple requests.
        try (VertexAI vertexAI = new VertexAI(Config.projectId, Config.location)) {
            String output;
            GenerativeModel model = new GenerativeModel(Config.modelName, vertexAI);

            GenerateContentResponse response = model.generateContent(question);
            output = ResponseHandler.getText(response);
            return output;
        }
    }
}
