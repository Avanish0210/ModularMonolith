package com.example.modularArchitecture.workflow.controller;

import com.example.modularArchitecture.workflow.dto.WorkflowRequestDto;
import com.example.modularArchitecture.workflow.dto.WorkflowResponseDto;
import com.example.modularArchitecture.workflow.entity.WorkflowEntity;
import com.example.modularArchitecture.workflow.repository.WorkflowRepository;
import com.example.modularArchitecture.workflow.service.WorkflowService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class WorkflowController {


    private final WorkflowRepository workflowRepository;
    private final WorkflowService workflowService;

    @PostMapping("/addWorkflow")
    public WorkflowResponseDto addWorkflow(@RequestBody WorkflowEntity workflowEntity) {
        WorkflowEntity workflowEntity1 = workflowRepository.save(workflowEntity);

        return WorkflowResponseDto.builder()
                .workflowId(workflowEntity1.getId())
                .workflow(workflowEntity1.getWorkflow())
                .steps(workflowEntity1.getSteps())
                .build();

    }

    @GetMapping("/getWorkflow/{id}")
    public WorkflowResponseDto getWorkflow(@PathVariable Long id) {
        return workflowService.getWorkflow(id);
    }
}
