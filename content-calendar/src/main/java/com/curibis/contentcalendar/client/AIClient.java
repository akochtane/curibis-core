package com.curibis.contentcalendar.client;

import com.curibis.contentcalendar.repository.ContentCollectionRepository;
import com.curibis.contentcalendar.service.AIService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/prompt")
public class AIClient {

    private final AIService aiService;
    public AIClient(AIService aiService) {
        this.aiService = aiService;
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("")
    public String create(@RequestBody String prompt) throws Exception {

        //AIService AIService = new AIService();

        return aiService.simpleQuestion(prompt);
    }
}