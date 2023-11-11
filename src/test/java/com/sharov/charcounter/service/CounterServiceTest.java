package com.sharov.charcounter.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CounterServiceTest {

    private static String TEST_STRING = "abbccc";

    @InjectMocks
    private CounterService counterService;

    @Test
    void count() {
        var actualResult = counterService.countWords(TEST_STRING);
        var expectedResult = Map.of('a', 1, 'b', 2, 'c', 3);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sort() {
        var actualResult = counterService.countWords(TEST_STRING);
        var expectedResult = Map.of('a', 1, 'b', 2, 'c', 3);

        assertEquals(expectedResult, counterService.sort(actualResult));
    }

}