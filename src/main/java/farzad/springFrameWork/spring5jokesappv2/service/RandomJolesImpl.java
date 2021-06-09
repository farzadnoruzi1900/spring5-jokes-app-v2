package farzad.springFrameWork.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class RandomJolesImpl implements RandomJoles {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    // as you can see here we use a concreate instantiation but we will learn learn how to handle use
//   of a external resource in our code to do the dependency injection instead of using new keyword .
    public RandomJolesImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJokes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
