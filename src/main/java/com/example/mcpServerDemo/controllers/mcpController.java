package com.example.mcpServerDemo.controllers;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.example.mcpServerDemo.services.McpService;
import com.example.mcpServerDemo.services.TaskService;

@Component
public class mcpController {
    
    @Bean
	public ToolCallbackProvider mcpdemoServices(McpService mcpService,TaskService taskService) {
		return MethodToolCallbackProvider.builder().toolObjects(mcpService,taskService).build();
	}
}
