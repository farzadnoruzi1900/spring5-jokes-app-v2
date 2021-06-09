package farzad.springFrameWork.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class RandomJolesImpl implements RandomJoles {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public RandomJolesImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJokes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
