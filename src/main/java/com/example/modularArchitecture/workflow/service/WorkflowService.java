package com.example.modularArchitecture.workflow.service;

import com.example.modularArchitecture.workflow.dto.WorkflowResponseDto;
import com.example.modularArchitecture.workflow.entity.WorkflowEntity;
import com.example.modularArchitecture.workflow.error.BadRequestException;
import com.example.modularArchitecture.workflow.repository.WorkflowRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkflowService {

    private final WorkflowRepository workflowRepository;
    public WorkflowResponseDto getWorkflow(Long id) {
        WorkflowEntity workflow = workflowRepository.findById(id)
                .orElseThrow(()-> new BadRequestException("Workflow not found"));

        return WorkflowResponseDto.builder()
                .workflow(workflow.getWorkflow())
                .steps(workflow.getSteps())
                .build();
    }
}
