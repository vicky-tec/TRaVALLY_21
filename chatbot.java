import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ChatBotServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String message = request.getParameter("message").toLowerCase();
        String reply;

        switch (message) {
            case "hello":
                reply = "Hi there!";
                break;
            case "how are you?":
                reply = "I'm just a bot, but I'm doing fine!";
                break;
            case "bye":
                reply = "Goodbye!";
                break;
            default:
                reply = "Sorry, I don't understand.";
        }

        response.setContentType("text/plain");
        response.getWriter().write(reply);
    }
}
