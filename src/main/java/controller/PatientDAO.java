package controller;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PatientDTO;

public class PatientDAO 
{
    public boolean Insert(PatientDTO patient)
    {
        String sql = "INSERT INTO Patient"
            + "(id, name, socialName, birthDate, nationality, naturalness, race, sex, cpf, mother, father, guardian, phone1, phone2, email, "
            + "emergencyPhone, emergencyName, emergencyRelation, adress) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql)) 
        {
            ps.setInt(1, patient.getId());
            ps.setString(2, patient.getName());
            ps.setString(3, patient.getName());
            ps.setDate(4, java.sql.Date.valueOf(patient.getBirthDate()));
            ps.setString(5, patient.getNationality());
            ps.setString(6, patient.getNaturalness());
            ps.setString(7, patient.getRace());
            ps.setString(8, patient.getSex());
            ps.setString(9, patient.getCpf());
            ps.setString(10, patient.getMother());
            ps.setString(11, patient.getFather());
            ps.setString(12, patient.getGuardian());
            ps.setString(13, patient.getPhone1());
            ps.setString(14, patient.getPhone2());
            ps.setString(15, patient.getEmail());
            ps.setString(16, patient.getEmergencyPhone());
            ps.setString(17, patient.getEmergencyName());
            ps.setString(18, patient.getEmergencyRelation());
            ps.setString(19, patient.getAdress());

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) 
            {
                return true;
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Error (PatientDAO Insert): " + e.getMessage());
        }
        
        return false;
    }
    
    public ArrayList<PatientDTO> List(String column, String value)
    {
        ArrayList<PatientDTO> list = new ArrayList<>();
        
        String sql = "SELECT * FROM Patient WHERE " + column + " LIKE ?";
        
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql);) 
        {
            ps.setString(1, "%" + value + "%");
            
            try (ResultSet rs = ps.executeQuery())
            {
                while (rs.next()) 
                {
                    PatientDTO patient = new PatientDTO();
                    patient.setId(rs.getInt("id"));
                    patient.setName(rs.getString("name"));
                    patient.setSocialName(rs.getString("socialName"));
                    patient.setBirthDate(rs.getDate("birthDate").toLocalDate());
                    patient.setNationality(rs.getString("nationality"));
                    patient.setNaturalness(rs.getString("naturalness"));
                    patient.setRace(rs.getString("race"));
                    patient.setSex(rs.getString("sex"));
                    patient.setCpf(rs.getString("cpf"));
                    patient.setMother(rs.getString("mother"));
                    patient.setFather(rs.getString("father"));
                    patient.setGuardian(rs.getString("guardian"));
                    patient.setPhone1(rs.getString("phone1"));
                    patient.setPhone2(rs.getString("phone2"));
                    patient.setEmail(rs.getString("email"));
                    patient.setEmergencyPhone(rs.getString("emergencyPhone"));
                    patient.setEmergencyName(rs.getString("emergencyName"));
                    patient.setEmergencyRelation(rs.getString("emergencyRelation"));
                    patient.setAdress(rs.getString("adress"));

                    list.add(patient);
                }    
            }
           
            return list;
        } 
        catch (SQLException e) 
        {
            System.out.println("Error (PatientDAO List): " + e.getMessage());
        }
        return null;
    }     
    
    public PatientDTO Select(int id) throws SQLException
    {
        PatientDTO patient = new PatientDTO();
        String sql = "SELECT * FROM Patient WHERE id = ?";
        
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql))
        {
            ps.setInt(1, id);
            
            try (ResultSet rs = ps.executeQuery()) 
            {
                if (rs.next()) 
                {
                    patient.setId(rs.getInt("id"));
                    patient.setName(rs.getString("name"));
                    patient.setSocialName(rs.getString("socialName"));
                    patient.setBirthDate(rs.getDate("birthDate").toLocalDate());
                    patient.setNationality(rs.getString("nationality"));
                    patient.setNaturalness(rs.getString("naturalness"));
                    patient.setRace(rs.getString("race"));
                    patient.setSex(rs.getString("sex"));
                    patient.setCpf(rs.getString("cpf"));
                    patient.setMother(rs.getString("mother"));
                    patient.setFather(rs.getString("father"));
                    patient.setGuardian(rs.getString("guardian"));
                    patient.setPhone1(rs.getString("phone1"));
                    patient.setPhone2(rs.getString("phone2"));
                    patient.setEmail(rs.getString("email"));
                    patient.setEmergencyPhone(rs.getString("emergencyPhone"));
                    patient.setEmergencyName(rs.getString("emergencyName"));
                    patient.setEmergencyRelation(rs.getString("emergencyRelation"));
                    patient.setAdress(rs.getString("adress"));
                }   
                return patient;
            } 
            catch (SQLException e) 
            {
                System.out.println("Error (AttachmentDAO Select): " + e.getMessage());
            }
        }      
        return null;
    } 

    public boolean Delete(int id) 
    {
        String sql = "DELETE FROM Patient WHERE id = ?";
        
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql)) 
        {
            ps.setInt(1, id);

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } 
        catch (SQLException e) 
        {
            System.out.println("Error (PatientDAO Delete): " + e.getMessage());
            return false;
        }
    }
}

