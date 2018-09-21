package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nlp.NLP;
import servlets.model.Model;

@WebServlet("/NlpServlet")
public class NlpServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
      
	
    public NlpServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tweetТext = request.getParameter("tweet_text");
//		String tweetТext1 = request.getParameter("selected_tweet");
		// TODO add auto init.
		
//		twitterТext="This is really good burger!"; // TODO for testing

		NLP nlp = NLP.getInstance();
		String sentimentType = nlp.findSentiment(tweetТext);
		
		// TODO set model nlp results
		Model model = Model.getInstance();
		model.setTweetText(tweetТext);
		model.setSentimentType(sentimentType);
		
		response.sendRedirect("index.jsp");
	}

}
