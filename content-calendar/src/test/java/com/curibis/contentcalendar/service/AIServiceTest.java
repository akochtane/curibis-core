package com.curibis.contentcalendar.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

class AIServiceTest {

    @Test
    void simpleQuestion_shouldReturnExpectedOutput() throws Exception {
        // Given
        String question = "What is the capital of France?";
        String expectedOutput = "Paris";

        AIService aiService = new AIService();
        // When
        String actualOutput = aiService.simpleQuestion(question);

        // Then
        assertTrue(actualOutput.contains(expectedOutput));
    }

    @Test
    void simpleQuestion_shouldReturnExpectedOutputMock() throws Exception {
        // Given
        String question = "What is the capital of France?";
        String expectedOutput = "Paris";

        // When
        AIService aiServiceMock = mock(AIService.class);
        Mockito.when(aiServiceMock.simpleQuestion(question)).thenReturn("Paris");
        String actualOutput = aiServiceMock.simpleQuestion(question);

        // Then
        assertTrue(actualOutput.contains(expectedOutput));
    }
}
