package com.workforceafrica.football.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Team implements Serializable {
    private @Id Long id;
    private String name;
    private String Description;

    @JsonIgnore
    @OneToMany(mappedBy="team")
    private Set<Player> players;

    @JsonIgnore
    @OneToMany(mappedBy="teamHome")
    private Set<Fixture> fixtureHome;

    @JsonIgnore
    @OneToMany(mappedBy="teamAway")
    private Set<Fixture> fixtureAway;

    public Team(String name, String description) {
        this.name = name;
        Description = description;
    }
}
