package com.wooseok.minigroupware.domain;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Team {

    private Long teamId;

    @NotBlank(message = "팀명은 필수입니다.")
    private String teamName;

    private String teamDesc;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
