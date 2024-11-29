package controller;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ProfessionalDTO;

public class ProfessionalDAO 
{
    public boolean Insert(ProfessionalDTO professional)
    {
        String sql = "INSERT INTO Professional "
            + "(name, user, password, type, phone, email, birthDate, registerType, registerNumber, specialty, status, permissions) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql)) 
        {
            ps.setString(1, professional.getName());
            ps.setString(2, professional.getUser());
            ps.setString(3, professional.getPassword());
            ps.setString(4, professional.getType());
            ps.setString(5, professional.getPhone());
            ps.setString(6, professional.getEmail());
            ps.setDate(7, java.sql.Date.valueOf(professional.getBirthDate()));
            ps.setString(8, professional.getRegisterType());
            ps.setString(9, professional.getRegisterNumber());
            ps.setString(10, professional.getSpecialty());
            ps.setString(11, professional.getStatus());
            ps.setString(12, professional.getPermissions());

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) 
            {
                return true;
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Error (ProfessionalDAO Insert): " + e.getMessage());
        }
        
        return false;
    }
    
    public ArrayList<ProfessionalDTO> List(String column, String value)
    {
        ArrayList<ProfessionalDTO> list = new ArrayList<>();
        
        String sql = "SELECT * FROM Professional WHERE " + column + " LIKE ?";
        
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql);) 
        {
            ps.setString(1, "%" + value + "%");
            
            try (ResultSet rs = ps.executeQuery())
            {
                while (rs.next()) 
                {
                    ProfessionalDTO professional = new ProfessionalDTO();
                    professional.setId(rs.getInt("id"));
                    professional.setName(rs.getString("name"));
                    professional.setUser(rs.getString("user"));
                    professional.setPassword(rs.getString("password"));
                    professional.setType(rs.getString("type"));
                    professional.setPhone(rs.getString("phone"));
                    professional.setEmail(rs.getString("email"));
                    professional.setBirthDate(rs.getDate("birthDate").toLocalDate());
                    professional.setRegisterType(rs.getString("registerType"));
                    professional.setRegisterNumber(rs.getString("registerNumber"));
                    professional.setSpecialty(rs.getString("specialty"));
                    professional.setStatus(rs.getString("status"));
                    professional.setPermissions(rs.getString("permissions"));

                    list.add(professional);
                }    
            }
           
            return list;
        } 
        catch (SQLException e) 
        {
            System.out.println("Error (ProfessionalDAO List): " + e.getMessage());
        }
        return null;
    }     
    
    public ProfessionalDTO Select(String user, String password) throws SQLException
    {
        ProfessionalDTO professional = null;
        String sql = "SELECT * FROM Professional WHERE user = ? AND password = ?";
        
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql))
        {
            ps.setString(1, user);
            ps.setString(2, password);
            
            try (ResultSet rs = ps.executeQuery()) 
            {
                if (rs.next()) 
                {
                    professional = new ProfessionalDTO();
                    professional.setId(rs.getInt("id"));
                    professional.setName(rs.getString("name"));
                    professional.setUser(rs.getString("user"));
                    professional.setPassword(rs.getString("password"));
                    professional.setType(rs.getString("type"));
                    professional.setPhone(rs.getString("phone"));
                    professional.setEmail(rs.getString("email"));
                    professional.setBirthDate(rs.getDate("birthDate").toLocalDate());
                    professional.setRegisterType(rs.getString("registerType"));
                    professional.setRegisterNumber(rs.getString("registerNumber"));
                    professional.setSpecialty(rs.getString("specialty"));
                    professional.setStatus(rs.getString("status"));
                    professional.setPermissions(rs.getString("permissions"));
                }   
                else 
                {
                    return null;
                }
                
                return professional;
            } 
            catch (SQLException e) 
            {
                System.out.println("Error (ProfessionalDAO Select): " + e.getMessage());
            }
        }      
        return null;
    } 

    public boolean Delete(int id) 
    {
        String sql = "DELETE FROM Professional WHERE id = ?";
        
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql)) 
        {
            ps.setInt(1, id);

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } 
        catch (SQLException e) 
        {
            System.out.println("Error (ProfessionalDAO Delete): " + e.getMessage());
            return false;
        }
    }
}

