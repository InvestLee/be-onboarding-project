package org.survey.api.domain.survey.controller.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SurveyReplyRequest {

    @NotNull
    private Long id;

    @NotNull
    private Long itemId;

    private String content;
}