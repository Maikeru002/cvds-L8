package com.logicbig.example;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuessService {
    private final GuessRepository guessRepository;

    @Autowired
    public GuessService(GuessRepository guessRepository) {
        this.guessRepository = guessRepository;
    }

    public Guess addGuess(Guess guess) {
        return guessRepository.save(guess);
    }

    public Guess getGuess(String stringProperty) {
        return guessRepository.findById(stringProperty);
    }

    public List<Guess> getAllGuess() {
        return guessRepository.findAll();
    }

    public Guess updatGuess(Guess guess) {
        if (guessRepository.existsById(guess.getProperty())) {
            return guessRepository.save(guess);
        }
        return null;
    }

    public void deleteGuess(String guess) {
        guessRepository.deleteById(guess);
    }

}