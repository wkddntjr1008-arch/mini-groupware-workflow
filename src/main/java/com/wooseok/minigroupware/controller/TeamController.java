package com.wooseok.minigroupware.controller;

import com.wooseok.minigroupware.domain.Team;
import com.wooseok.minigroupware.service.TeamService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;

    @GetMapping("/team/list")
    public String list(Model model) {
        model.addAttribute("teamList", teamService.findAll());
        return "team/list";
    }

    @GetMapping("/team/form")
    public String form(Model model) {
        model.addAttribute("team", new Team());
        return "team/form";
    }

    @PostMapping("/team/save")
    public String save(@Valid @ModelAttribute("team") Team team, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "team/form";
        }

        teamService.registerTeam(team);
        return "redirect:/team/list";
    }
}
