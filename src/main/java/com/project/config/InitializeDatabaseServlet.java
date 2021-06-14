package com.project.config;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


/**
 * Servlet implementation class InitializeDatabaseServlet
 */
@WebServlet(name = "InitializeDatabaseServlet", urlPatterns = "/", loadOnStartup = 1)
public class InitializeDatabaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitializeDatabaseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		 HibernateConfiguration configuration = new HibernateConfiguration();
        try {
            configuration.initDatabase();
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

}
