package pack1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cal")
public class Calculate extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        // Correctly retrieve the numbers
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        
        String userchoice = req.getParameter("choice");
        int result = 0;
        boolean validChoice = true;

        switch (userchoice) {
            case "add":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
            case "multi":
                result = num1 * num2;
                break;
            case "div":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    validChoice = false;
                    out.println("Cannot divide by zero.");
                }
                break;
            case "greater":
                result = Math.max(num1, num2);
                break;
            case "smaller":
                result = Math.min(num1, num2);
                break;
            default:
                validChoice = false;
                out.println("Invalid operation selected.");
                break;
        }

        if (validChoice) {
            out.println("<h1>Result: " + result + "</h1>");
        }
        out.close();
    
    }
}