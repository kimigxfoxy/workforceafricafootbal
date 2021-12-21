package com.workforceafrica.football.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Fixture implements Serializable {
    private @Id Long id;
    private Date datePlayed;
    private Boolean played;
    private int homeTeamScore;
    private int awayTeamScore;

    @ManyToOne()
    @JoinColumn(name = "team_home_id")
    private Team teamHome;

    @ManyToOne()
    @JoinColumn(name = "team_away_id")
    private Team teamAway;



}
