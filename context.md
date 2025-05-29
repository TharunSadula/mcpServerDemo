# MCP Server Tools Context

## Overview
This document provides context for working with the Model Context Protocol (MCP) server tools and services.

## MCP Service Usage

### Making MCP Requests
The MCP service provides functionality to process MCP requests with the following parameters:
- `request`: The main request content
- `description`: A description of the request

### Example Usage
```java
// Example of using the MCP service
mcpService.processMcpRequest("exampleRequest", "This is a description of the request");
```

## Available Tools
1. `processMcpRequest`
   - Description: Process MCP requests with a name and description
   - Parameters:
     - request (String): The request content
     - description (String): Description of the request
   - Returns: A processed response string


1. `analysisTests`
   - Description: use this tool if the processMcpRequest has data returned with error and further analysis
   - Parameters:
     - request (String): The request content
     - description (String): Description of the request
     - analysis needed tested
   - Returns: A processed response string

## Best Practices
1. Always provide clear descriptions for requests
2. Handle responses appropriately in your application
3. Use proper error handling when making requests

## Development Notes
- The MCP service is implemented as a Spring Boot service
- Uses Spring AI tool annotations for request processing
- Located in the `com.example.mcpServerDemo.services` package

## Future Enhancements
- Add request validation
- Implement response caching
- Add more specific request types
- Enhance error handling and logging
