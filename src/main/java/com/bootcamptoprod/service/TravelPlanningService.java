package com.bootcamptoprod.service;

import com.bootcamptoprod.dto.TravelItinerary;
import com.bootcamptoprod.dto.TravelRequest;
import com.bootcamptoprod.workflow.TravelOrchestratorWorkflow;
import org.springframework.stereotype.Service;

@Service
public class TravelPlanningService {

    private final TravelOrchestratorWorkflow orchestratorWorkflow;

    public TravelPlanningService(TravelOrchestratorWorkflow orchestratorWorkflow) {
        this.orchestratorWorkflow = orchestratorWorkflow;
    }

    public TravelItinerary planTrip(TravelRequest request) {
        // Delegate to the workflow for AI processing
        return orchestratorWorkflow.createTravelPlan(request);
    }
}