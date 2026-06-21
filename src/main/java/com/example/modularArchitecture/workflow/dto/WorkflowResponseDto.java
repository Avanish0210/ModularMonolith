package com.example.modularArchitecture.workflow.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkflowResponseDto {
    private Long workflowId;
    private String workflow;
    private String[] steps;
}
