package com.example.modularArchitecture.workflow.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WorkflowRequestDto {
    private String workflowId;
}
