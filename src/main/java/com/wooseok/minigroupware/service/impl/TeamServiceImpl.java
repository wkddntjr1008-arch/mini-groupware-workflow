package com.wooseok.minigroupware.service.impl;

import com.wooseok.minigroupware.domain.Team;
import com.wooseok.minigroupware.mapper.TeamMapper;
import com.wooseok.minigroupware.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final TeamMapper teamMapper;

    @Override
    public List<Team> findAll() {
        return teamMapper.findAll();
    }

    @Override
    public Team findById(Long teamId) {
        return teamMapper.findById(teamId);
    }

    @Override
    public void registerTeam(Team team) {
        teamMapper.insertTeam(team);
    }
}
