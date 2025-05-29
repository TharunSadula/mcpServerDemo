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
     - request (String): input from user
     - description (String): input from user
   - Returns: A processed response string


1. `analysisTests`
   - Description: use this tool if the processMcpRequest has data returned with error and further analysis
   - Parameters:
     - request1 (String): The request content
     - description1 (String): Description of the request
     - analysis(String): request it from user
   - Returns: return string

## getLocation

The `getLocation` functionality retrieves the latitude and longitude for a specified place. For example, requesting the location for "Bentonville, Arkansas" returns:

- Latitude: 36.3729
- Longitude: -94.2088

This can be used to obtain geographic coordinates for cities or locations as needed in the application.

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
