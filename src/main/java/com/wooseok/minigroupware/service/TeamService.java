package com.wooseok.minigroupware.service;

import com.wooseok.minigroupware.domain.Team;

import java.util.List;

public interface TeamService {

    List<Team> findAll();

    Team findById(Long teamId);

    void registerTeam(Team team);
}
