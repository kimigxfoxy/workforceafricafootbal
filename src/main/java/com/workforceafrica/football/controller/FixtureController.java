package com.workforceafrica.football.controller;

import com.workforceafrica.football.model.Fixture;
import com.workforceafrica.football.model.Player;
import com.workforceafrica.football.repository.FixtureRepository;
import com.workforceafrica.football.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FixtureController {


    @Autowired
    FixtureRepository fixtureRepository;

    @GetMapping("/team/{id}/fixturesplayed")
    List<Fixture> fixturePlayedHistory(@PathVariable Long id) {
       return fixtureRepository.getFixturePlayed(id);
    }

    @GetMapping("/futurefixtures")
    List<Fixture> fixtureFuture() {
       return fixtureRepository.getFutureFixtures();
    }

}
