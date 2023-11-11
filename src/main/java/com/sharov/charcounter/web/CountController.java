package com.sharov.charcounter.web;

import com.sharov.charcounter.service.CounterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class CountController {

    private final CounterService counterService;

    /**
     * @param needCount - string for count words
     * @return sorted json with character and count
     */
    @PostMapping("/count")
    @ResponseBody
    public String count(@RequestBody String needCount) {
        var countedWords = counterService.countWords(needCount);
        return counterService.sort(countedWords).toString();
    }
}
