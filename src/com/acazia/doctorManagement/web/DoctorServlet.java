package com.acazia.doctorManagement.web;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acazia.doctorManagement.dao.DoctorDAO;
import com.acazia.doctorManagement.model.Doctor;
import com.acazia.doctorManagement.model.Education;
import com.acazia.doctorManagement.model.Hospital;
import com.acazia.doctorManagement.model.Major;
import com.acazia.doctorManagement.model.Nationality;
import com.acazia.doctorManagement.model.Title;

@WebServlet("/")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DoctorDAO doctorDAO;
	
	public void init() {
		doctorDAO = new DoctorDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		try {
			switch (action) {
			case "/new":
//				showNewForm(request, response);
				break;
			case "/insert":
//				insertUser(request, response);
				break;
			case "/delete":
//				deleteUser(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
//				updateUser(request, response);
				break;
			default:
				listUser(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Doctor> listUser = doctorDAO.selectAllDoctor();
		List<Nationality> listNationality = doctorDAO.selectAllNationality();
		List<Hospital> listHospital = doctorDAO.selectAllHospital();
		List<Title> listTitle = doctorDAO.selectAllTitle();
		List<Major> listMajor = doctorDAO.selectAllMajor();
		List<Education> listEducation = doctorDAO.selectAllEducation();
		request.setAttribute("listEducation", listEducation);
		request.setAttribute("listDoctor", listUser);
		request.setAttribute("listNationality", listNationality);
		request.setAttribute("listHospital", listHospital);
		request.setAttribute("listTitle", listTitle);
		request.setAttribute("listMajor", listMajor);

		RequestDispatcher dispatcher = request.getRequestDispatcher("doctor-list.jsp");
		dispatcher.forward(request, response);
	}

//	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
//		dispatcher.forward(request, response);
//	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Doctor existingUser = doctorDAO.selectDoctor(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("doctor-detail.jsp");
		request.setAttribute("user", existingUser);
		dispatcher.forward(request, response);
	}
}