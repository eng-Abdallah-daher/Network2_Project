
<%@page import="java.io.IOException"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.BufferedReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    boolean authenticate = false;
    
    // Get id and password
    String id = request.getParameter("id");
    String password = request.getParameter("password");
    
    // Read Users
    String filePath = application.getRealPath("/WEB-INF/users.txt");
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 3) {
                String storedId = parts[1].trim();
                String storedPassword = parts[2].trim();
                
                // Validate ID and password
                if (id.equals(storedId) && password.equals(storedPassword)) {
                    authenticate = true;
                }
            }
        }

        // Send Response
        response.getWriter().write((authenticate) ? "Permit" : "Deny");

    } catch (IOException e) {
        response.getWriter().write("Error!");
    }
%>
