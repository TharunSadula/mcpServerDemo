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
        description = "use this tool if the processMcpRequest has data returned with error further analysis needed "
    )
    public String analysisTests(@ToolParam(description="request from processMcpRequest") String  request1
    ,@ToolParam(description = "description from processMcpRequest")String description1,
     @ToolParam(description = "get input from user")String analysis) {
        // Placeholder for processing logic
        return "analysis started MCP request: " + request1 + " with description: " + description1 + " and analysis: " + analysis;
    }


     @Tool(
        name = "getLocation",
        description = "prints the latitude and longitude of the location"
    )
    public String getLocation(@ToolParam(description="latitude") String latitude,
                              @ToolParam(description="longitude") String longitude) {
        // Placeholder for processing logic
        return "Location: Latitude = " + latitude + ", Longitude = " + longitude;
    }

    @Tool(
        name = "getFamousplaces",
        description = "get famous places based on latitude and longitude from getLocation"
    )
    public String getFamousplaces(@ToolParam(description = "famous places") String famousPlaces) {
        // Placeholder for processing logic
        return "Famous places: " + famousPlaces;
    }
    

    // Additional methods can be added as needed
    
}
