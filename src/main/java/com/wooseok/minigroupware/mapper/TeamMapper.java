package com.wooseok.minigroupware.mapper;

import com.wooseok.minigroupware.domain.Team;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TeamMapper {

    int insertTeam(Team team);

    List<Team> findAll();

    Team findById(@Param("teamId") Long teamId);
}
