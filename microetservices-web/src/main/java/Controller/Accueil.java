/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Merle
 */
@WebServlet(name = "Accueil", urlPatterns = {"/accueil"})
public class Accueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Accueil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		Noms tableNoms = new Noms();
//        request.setAttribute("utilisateurs", tableNoms.recupererUtilisateurs());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		ConnectionForm form = new ConnectionForm();
//		form.verifierIdentifiant(request);
//		request.setAttribute("form", form);
//		
//		Utilisateur utilisateur = new Utilisateur();
//        utilisateur.setNom(request.getParameter("nom"));
//        utilisateur.setPrenom(request.getParameter("prenom"));
//        
//        Noms tableNoms = new Noms();
//        tableNoms.ajouterUtilisateur(utilisateur);
//        
//        request.setAttribute("utilisateurs", tableNoms.recupererUtilisateurs());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward(request, response);
		
		
	}
}

