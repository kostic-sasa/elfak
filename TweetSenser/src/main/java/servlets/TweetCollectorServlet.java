package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlets.model.Model;
import servlets.model.TweetData;
import twitter.TweetCollector;

@WebServlet("/SenserServlet")
public class TweetCollectorServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private TweetCollector tweetCollector;
	
    public TweetCollectorServlet() {
        super();
        tweetCollector = new TweetCollector();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String terms = request.getParameter("terms");
		String dateFrom = request.getParameter("dateFrom");
		String dateTo = request.getParameter("dateTo");
		
		List<String> tweetTexts = tweetCollector.search(terms, dateFrom, dateTo);
		
		Model model = Model.getInstance();
		model.setTweetData(new TweetData(tweetTexts));
		response.sendRedirect("index.jsp");
	}

}
