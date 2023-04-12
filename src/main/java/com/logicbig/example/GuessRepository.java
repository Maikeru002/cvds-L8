package com.logicbig.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface GuessRepository extends JpaRepository<Guess, Long> {
    boolean existsById(String Property);

    Guess findById(String propiedad);

    void deleteById(String propiedad);
}

