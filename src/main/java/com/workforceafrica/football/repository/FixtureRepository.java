package com.workforceafrica.football.repository;

import com.workforceafrica.football.model.Fixture;
import com.workforceafrica.football.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FixtureRepository extends JpaRepository<Fixture, Long> {

    @Query(
            value = "SELECT F.* FROM FIXTURE F WHERE F.played = 1 and (F.team_home_id=:teamId OR F.team_away_id=:teamId)",
            nativeQuery = true)
    List<Fixture> getFixturePlayed(@Param("teamId") Long teamId);

    @Query(
            value = "SELECT F.* FROM FIXTURE F WHERE F.played = 0",
            nativeQuery = true)
    List<Fixture> getFutureFixtures();

}
