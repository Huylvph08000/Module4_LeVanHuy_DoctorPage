package com.acazia.doctorManagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.acazia.doctorManagement.model.Doctor;
import com.acazia.doctorManagement.model.Education;
import com.acazia.doctorManagement.model.Hospital;
import com.acazia.doctorManagement.model.Major;
import com.acazia.doctorManagement.model.Nationality;
import com.acazia.doctorManagement.model.Title;



public class DoctorDAO {
	private String jdbcURL = "jdbc:mysql://localhost:3306/doctor?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "admin1234";

	private static final String SELECT_USER_BY_ID = 
	"SELECT doctor_id,doctor_name,sex,nationality,adress,phonenumber,work,major_name,title,hospital_name FROM doctors WHERE doctor_id =?";
	private static final String SELECT_ALL_USERS = "select * from doctors";
	private static final String SELECT_COUNTRY ="SELECT DISTINCT nationality FROM doctors";
	private static final String SELECT_TITLE ="SELECT DISTINCT title FROM doctors";
	private static final String SELECT_HOSPITAL ="SELECT DISTINCT hospital_name FROM doctors";
	private static final String SELECT_MAJOR ="SELECT DISTINCT major_name FROM doctors";
	private static final String SELECT_EDUCATION ="SELECT DISTINCT work FROM doctors";
	private static final String SEARCH_USER = 
	"SELECT doctor_id,doctor_name,sex,nationality,adress,phonenumber,work,major_name,title,hospital_name "+
	"FROM doctors WHERE doctor_name like %?1% and nationality like %?2% and work like %?3% major_name like %?4% and title like %?5% and hospital_name like %?6%";
	public DoctorDAO() {
	}

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	public Doctor selectDoctor(int id) {
		Doctor user = null;
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				String doctor_name = rs.getString("doctor_name");
				String sex = rs.getString("sex");
				String nationality = rs.getString("nationality");
				String adress = rs.getString("adress");
				String phonenumber = rs.getString("phonenumber");
				String work = rs.getString("work");
				String major_name = rs.getString("major_name");
				String title = rs.getString("title");
				String hospital_name = rs.getString("hospital_name");
				user = new Doctor(id, doctor_name,  sex,  nationality,  adress,  phonenumber,
						 work,  major_name,  title,  hospital_name);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		System.out.println(user);
		return user;
	}
	public List<Doctor> searchDoctor() {
		List<Doctor> doctors = new ArrayList<>();
		try (Connection connection = getConnection();

				PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_USER);) {
				System.out.println(preparedStatement);
				ResultSet rs = preparedStatement.executeQuery();

				while (rs.next()) {
					int doctor_id = rs.getInt("doctor_id");
					String doctor_name = rs.getString("doctor_name");
					String sex = rs.getString("sex");
					String nationality = rs.getString("nationality");
					String adress = rs.getString("adress");
					String phonenumber = rs.getString("phonenumber");
					String work = rs.getString("work");
					String major_name = rs.getString("major_name");
					String title = rs.getString("title");
					String hospital_name = rs.getString("hospital_name");
					doctors.add(new Doctor(doctor_id, doctor_name,  sex,  nationality,  adress,  phonenumber,
							 work,  major_name,  title,  hospital_name));
				}
			} catch (SQLException e) {
				printSQLException(e);
			}
		return doctors;
	}
	
	public List<Doctor> selectAllDoctor() {
		List<Doctor> doctors = new ArrayList<>();
		try (Connection connection = getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				int doctor_id = rs.getInt("doctor_id");
				String doctor_name = rs.getString("doctor_name");
				String sex = rs.getString("sex");
				String nationality = rs.getString("nationality");
				String adress = rs.getString("adress");
				String phonenumber = rs.getString("phonenumber");
				String work = rs.getString("work");
				String major_name = rs.getString("major_name");
				String title = rs.getString("title");
				String hospital_name = rs.getString("hospital_name");
				doctors.add(new Doctor(doctor_id, doctor_name,  sex,  nationality,  adress,  phonenumber,
						 work,  major_name,  title,  hospital_name));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return doctors;
	}

	public List<Nationality> selectAllNationality() {
		List<Nationality> nationalities = new ArrayList<>();
		try (Connection connection = getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_COUNTRY);) {
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = 0;
				String nationality = rs.getString("nationality");
				nationalities.add(new Nationality(id, nationality));		
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return nationalities;
	}
	public List<Hospital> selectAllHospital() {
		List<Hospital> hospitals = new ArrayList<>();
		try (Connection connection = getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_HOSPITAL);) {
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = 0;
				String hospital = rs.getString("hospital_name");
				hospitals.add(new Hospital(id, hospital));		
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return hospitals;
	}
	public List<Major> selectAllMajor() {
		List<Major> majors = new ArrayList<>();
		try (Connection connection = getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_MAJOR);) {
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = 0;
				String major = rs.getString("major_name");
				majors.add(new Major(id, major));		
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return majors;
	}
	public List<Title> selectAllTitle() {
		List<Title> titles = new ArrayList<>();
		try (Connection connection = getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_TITLE);) {
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = 0;
				String title = rs.getString("title");
				titles.add(new Title(id, title));		
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return titles;
	}
	public List<Education> selectAllEducation() {
		List<Education> educations = new ArrayList<>();
		try (Connection connection = getConnection();

			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EDUCATION);) {
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id = 0;
				String education = rs.getString("work");
				educations.add(new Education(id, education));		
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return educations;
	}

	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}

}