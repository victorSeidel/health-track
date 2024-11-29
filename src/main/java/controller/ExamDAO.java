package controller;

import controller.ConnectDAO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ExamDTO;

public class ExamDAO 
{
    public boolean Insert(ExamDTO exam)
    {
        String sql = "INSERT INTO Exam(serviceId, patientId, professionalId, description, reason) VALUES (?, ?, ?, ?, ?)";
    
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql)) 
        {
            ps.setInt(1, exam.getServiceId());
            ps.setInt(2, exam.getPatientId());
            ps.setInt(3, exam.getProfessionalId());
            ps.setString(4, exam.getDescription());
            ps.setString(5, exam.getReason());

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) 
            {
                return true;
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Error (ExamDAO Insert): " + e.getMessage());
        }
        
        return false;
    }
    
    public ArrayList<ExamDTO> List()
    {
        ArrayList<ExamDTO> list = new ArrayList<>();
        
        String sql = "SELECT e.id, e.description, e.reason, e.serviceId, e.patientId, pt.name AS patient, e.professionalId, p.name AS professional FROM Exam e"
                        + "JOIN Professional p ON e.professionalId = p.id JOIN Service s ON e.serviceId = s.id JOIN Patient pt ON e.patientId = pt.id";
        
        String sql2 = "SELECT id, description, reason, date FROM Exam";
        
        
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql2); ResultSet rs = ps.executeQuery()) 
        {
            while (rs.next()) 
            {
                ExamDTO exam = new ExamDTO();
                exam.setId(rs.getInt("id"));
                exam.setDescription(rs.getString("description"));
                exam.setReason(rs.getString("reason"));
                exam.setFormattedDate(rs.getTimestamp("date"));
                
                //exam.setServiceId(rs.getInt("serviceId"));
                //exam.setPatientId(rs.getInt("patientId"));
                //exam.setPatientName(rs.getString("patient"));
                //exam.setProfessionalId(rs.getInt("professionalId"));
                //exam.setProfessionalName(rs.getString("professional"));
                
                list.add(exam);
            }   
            return list;
        } 
        catch (SQLException e) 
        {
            System.out.println("Error (ExamDAO List): " + e.getMessage());
        }
        return null;
    }     

    public boolean Delete(int id) 
    {
        String sql = "DELETE FROM Exam WHERE id = ?";
        
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql)) 
        {
            ps.setInt(1, id);

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } 
        catch (SQLException e) 
        {
            System.out.println("Error (ExamDAO Delete): " + e.getMessage());
            return false;
        }
    }
}

