package com.languages.italianenglishlanguageapp.service;

import com.languages.italianenglishlanguageapp.entity.Wordpair;
import com.languages.italianenglishlanguageapp.repository.WordPairRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WordPairService {

    private final WordPairRepository repository;


    public Wordpair saveWordPair(Wordpair wordpair) {
        return repository.save(wordpair);
    }


}
