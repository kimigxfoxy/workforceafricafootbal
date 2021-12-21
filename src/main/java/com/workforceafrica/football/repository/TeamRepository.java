package com.workforceafrica.football.repository;

import com.workforceafrica.football.model.Player;
import com.workforceafrica.football.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {


}
