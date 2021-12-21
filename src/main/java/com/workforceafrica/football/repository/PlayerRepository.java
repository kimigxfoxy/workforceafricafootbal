package com.workforceafrica.football.repository;

import com.workforceafrica.football.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    @Query(
            value = "SELECT P.* FROM PLAYER P WHERE P.team_id = :teamId",
            nativeQuery = true)
    List<Player> getTeamPlayers(@Param("teamId") Long teamId);

    @Query(
            value = "SELECT P.* FROM PLAYER P WHERE P.team_id = :teamId AND P.is_injured=1",
            nativeQuery = true)
    List<Player> playersInTeamInjuryStatus(@Param("teamId") Long teamId);



}
