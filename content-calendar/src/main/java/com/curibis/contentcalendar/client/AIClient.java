package com.curibis.contentcalendar.client;

import com.curibis.contentcalendar.service.AIService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/prompt")
public class AIClient {

    public AIClient() {
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("")
    public String create(@RequestBody String prompt) throws Exception {

        return AIService.simpleQuestion(prompt);
    }
}