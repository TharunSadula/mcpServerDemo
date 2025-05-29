package com.example.mcpServerDemo.services;

import org.springframework.stereotype.Service;

import org.springframework.ai.tool.annotation.Tool;

import org.springframework.ai.tool.annotation.ToolParam;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TaskService {

    // This service can contain methods to handle task-related logic
    // For example, methods to process tasks, manage task states, etc.

    @Tool(
        name = "processTask",
        description = "Return the action associated for the given task name"
    )
    public String processTask(
        @ToolParam(description = "Name of the task") String taskName){
        // read a task file Json it contains map of taskname and actions lets return action
        try {
            String filePath = "src/main/resources/tasks.json";
            byte[] jsonData = Files.readAllBytes(Paths.get(filePath));
            ObjectMapper objectMapper = new ObjectMapper();
            Map<String, String> taskMap = objectMapper.readValue(jsonData, objectMapper.getTypeFactory().constructMapType(Map.class, String.class, String.class));
            String action = taskMap.get(taskName);
            if (action != null) {
                return action;
            } else {
                return "action not found for" + taskName;
            }
        } catch (Exception e) {
            return "Error processing task: " + e.getMessage();
        }
    }
    @Tool(
        name = "processAction",
        description = "Process the action with a specified level"
    )
    public String processAction(
        @ToolParam(description = "Action to be processed") String action, String level) {
        // Placeholder for processing logic
        return "Processed action: " + action + " at level: " + level;
    }
    // Additional methods can be added as needed

}
