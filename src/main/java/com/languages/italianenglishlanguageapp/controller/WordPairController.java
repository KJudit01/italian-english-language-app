package com.languages.italianenglishlanguageapp.controller;

import com.languages.italianenglishlanguageapp.entity.Wordpair;
import com.languages.italianenglishlanguageapp.service.WordPairService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/wordpairs")
public class WordPairController {

    private final WordPairService service;


    @PostMapping
    public Wordpair addWordPair(@RequestBody Wordpair wordpair) {
        return service.saveWordPair(wordpair);
    }


}
