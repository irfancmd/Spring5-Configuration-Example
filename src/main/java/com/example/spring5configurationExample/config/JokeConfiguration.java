package com.example.spring5jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@config
public class JokeConfiguration {

    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
