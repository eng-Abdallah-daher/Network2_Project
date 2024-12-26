
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Verify1"})
public class Verify1 extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        boolean authenticate = false;
        
        // Get name and password
        String name = request.getParameter("name");
        String password = request.getParameter("password");
                
        // Read Users
        String filePath = getServletContext().getRealPath("/WEB-INF/users.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String storedName = parts[0].trim();
                    String storedPassword = parts[2].trim();
                    
                    // Validate name and password
                    if (name.equals(storedName) && password.equals(storedPassword)) {
                        authenticate = true;
                    }
                }
            }
            
            // Send Response
            response.getWriter().write((authenticate) ? "Permit" : "Deny");
            
        } catch (IOException e) {
            response.getWriter().write("Error!");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "SNMP Manager Authentication";
    }

}
