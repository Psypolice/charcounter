package com.sharov.charcounter.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class CounterService {

    /**
     *
     * @param needCount - string for count words
     * @return map with Key - character and Value - count they character in string
     */
    public Map<Character, Integer> countWords(String needCount) {
        Map<Character, Integer> words = new HashMap<>();
        char[] massive = needCount.toCharArray();
        for (char c : massive) {
            if (!words.containsKey(c)) {
                words.put(c, 1);
            } else {
                var num = words.get(c);
                num++;
                words.put(c, num);
            }
        }
        return words;
    }

    /**
     *
     * @param toSort - map that need be sorted
     * @return reverse order sort map
     */
    public Map<Character, Integer> sort(Map<Character, Integer> toSort) {
        return toSort.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> b,
                        LinkedHashMap::new
                ));
    }
}
