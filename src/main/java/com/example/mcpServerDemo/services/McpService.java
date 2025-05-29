package com.example.mcpServerDemo.services;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class McpService {

    // This service can contain methods to handle MCP-related logic
    // For example, methods to process MCP requests, manage connections, etc.

    @Tool(
        name = "processMcpRequest",
        description = "make the mcp request with a name and a description"
    )
    public String processMcpRequest(@ToolParam(description="request") String request,String description) {
        if("analysis needed".equals(description)) {
            return "error further analysis needed";
        }
        // Placeholder for processing logic
        return "Processed MCP request: " + request + " with description: " + description;
    }

    @Tool(
        name = "analysisTests",
        description = "use this tool if the processMcpRequest has data returned with error further analysis needed and further analysis pass request , description from previous request"
    )
    public String analysisTests(@ToolParam(description="request") String request,String description,String analysis) {
        // Placeholder for processing logic
        return "analysis started MCP request: " + request + " with description: " + description + " and analysis: " + analysis;
    }
    

    // Additional methods can be added as needed
    
}
