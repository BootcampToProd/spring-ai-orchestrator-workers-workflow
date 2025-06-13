# Spring AI - Orchestrator-Workers Workflow Pattern

This repository demonstrates the **Spring AI Orchestrator-Workers Workflow Pattern**, a dynamic task orchestration system that enables complex problem decomposition and parallel processing in AI applications. The pattern uses a "manager" LLM to analyze requests, break them into specialized subtasks, and coordinate multiple "worker" LLMs for optimal results.

📖 **Dive Deeper**: For a complete walkthrough, detailed explanations of the Orchestrator-Workers Workflow pattern, and step-by-step instructions for building the example application, read our comprehensive blog post.<br>
👉 [Spring AI Orchestrator-Workers Workflow: Dynamic Task Orchestration for LLM Applications](https://bootcamptoprod.com/spring-ai-orchestrator-workers-workflow-guide/)

---

## 📦 Environment Variables

Make sure to provide these Java environment variables when running the application:

- `GEMINI_API_KEY`: Your Google Gemini API key.

---

## About This Project

This project implements an **AI-Powered Travel Itinerary Planner** as a real-world example of the Spring AI Orchestrator-Workers Workflow. It showcases how to:

*   Set up a Spring Boot application with Spring AI and Google Gemini integration.
*   Implement the `TravelOrchestratorWorkflow` to dynamically analyze travel requests and decompose them into specialized planning tasks.
*   Execute multiple specialized Worker LLMs in parallel to handle different travel aspects (accommodations, activities, dining, transportation).
*   Implement a Synthesizer to combine all worker outputs into a cohesive, day-by-day travel itinerary.

---

**Learn More**: This is part of our Spring AI Agentic Workflow series. Check out our other workflow patterns:
- [Chain Workflow Pattern](https://bootcamptoprod.com/spring-ai-chain-workflow-guide/)
- [Parallelization Workflow Pattern](https://bootcamptoprod.com/spring-ai-parallelization-workflow-guide/)
- [Routing Workflow Pattern](https://bootcamptoprod.com/spring-ai-routing-workflow-guide/)