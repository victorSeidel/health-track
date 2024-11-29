package controller;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.MedicalRecordDTO;
import model.PatientDTO;

public class MedicalRecordDAO 
{
    public boolean Insert(MedicalRecordDTO medicalRecord)
    {
        String sql = "INSERT INTO MedicalRecord "
            + "(allergies, bloodType, diseases, diseasesHistory, familyHistory, height, medications, "
            + "observations, patientId, status, surgeryHistory, weight) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql)) 
        {
            ps.setString(1, medicalRecord.getAllergies());
            ps.setString(2, medicalRecord.getBloodType());
            ps.setString(3, medicalRecord.getDiseases());
            ps.setString(4, medicalRecord.getDiseasesHistory());
            ps.setString(5, medicalRecord.getFamilyHistory());
            ps.setDouble(6, medicalRecord.getHeight());
            ps.setString(7, medicalRecord.getMedications());
            ps.setString(8, medicalRecord.getObservations());
            ps.setInt(9,medicalRecord.getPatientId());
            ps.setString(10, medicalRecord.getStatus());
            ps.setString(11, medicalRecord.getSurgeryHistory());
            ps.setDouble(12, medicalRecord.getWeight());

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) 
            {
                return true;
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Error (MedicalRecordDAO Insert): " + e.getMessage());
        }
        
        return false;
    }
    
    public ArrayList<MedicalRecordDTO> List(String column, String value)
    {
        ArrayList<MedicalRecordDTO> records = new ArrayList<>();
        String sql = "SELECT * FROM MedicalRecord";

        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) 
        {
            while (rs.next()) 
            {
                MedicalRecordDTO medicalRecord = new MedicalRecordDTO();
                medicalRecord.setId(rs.getInt("id"));
                medicalRecord.setAllergies(rs.getString("allergies"));
                medicalRecord.setBloodType(rs.getString("bloodType"));
                medicalRecord.setDiseases(rs.getString("diseases"));
                medicalRecord.setDiseasesHistory(rs.getString("diseasesHistory"));
                medicalRecord.setFamilyHistory(rs.getString("familyHistory"));
                medicalRecord.setHeight(rs.getDouble("height"));
                medicalRecord.setMedications(rs.getString("medications"));
                medicalRecord.setObservations(rs.getString("observations"));
                medicalRecord.setPatientId(rs.getInt("patientId"));
                medicalRecord.setStatus(rs.getString("status"));
                medicalRecord.setSurgeryHistory(rs.getString("surgeryHistory"));
                medicalRecord.setWeight(rs.getDouble("weight"));

                records.add(medicalRecord);
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Error (MedicalRecordDAO Insert): " + e.getMessage());
        }

        return records;    
    }     

    public MedicalRecordDTO Select(int id) throws SQLException
    {
        MedicalRecordDTO medicalRecord = new MedicalRecordDTO();
        String sql = "SELECT * FROM MedicalRecord WHERE patientId = ?";
        
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql))
        {
            ps.setInt(1, id);
            
            try (ResultSet rs = ps.executeQuery()) 
            {
                if (rs.next()) 
                {
                    medicalRecord.setId(rs.getInt("id"));
                    medicalRecord.setAllergies(rs.getString("allergies"));
                    medicalRecord.setBloodType(rs.getString("bloodType"));
                    medicalRecord.setDiseases(rs.getString("diseases"));
                    medicalRecord.setDiseasesHistory(rs.getString("diseasesHistory"));
                    medicalRecord.setFamilyHistory(rs.getString("familyHistory"));
                    medicalRecord.setHeight(rs.getDouble("height"));
                    medicalRecord.setMedications(rs.getString("medications"));
                    medicalRecord.setObservations(rs.getString("observations"));
                    medicalRecord.setPatientId(rs.getInt("patientId"));
                    medicalRecord.setStatus(rs.getString("status"));
                    medicalRecord.setSurgeryHistory(rs.getString("surgeryHistory"));
                    medicalRecord.setWeight(rs.getDouble("weight"));
                }   
                else 
                {
                    return null;
                }
                
                return medicalRecord;
            } 
            catch (SQLException e) 
            {
                System.out.println("Error (MedicalRecordDAO Select): " + e.getMessage());
            }
        }      
        
        return medicalRecord;
    } 
    
    public boolean Update(MedicalRecordDTO medicalRecord) 
    {
        String sql = "UPDATE MedicalRecord SET "
                + "allergies = ?, bloodType = ?, diseases = ?, diseasesHistory = ?, familyHistory = ?, height = ?, medications = ?, observations = ?, status = ?, "
                + "surgeryHistory = ?, weight = ? WHERE patientId = ?";

        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, medicalRecord.getAllergies());
            ps.setString(2, medicalRecord.getBloodType());
            ps.setString(3, medicalRecord.getDiseases());
            ps.setString(4, medicalRecord.getDiseasesHistory());
            ps.setString(5, medicalRecord.getFamilyHistory());
            ps.setDouble(6, medicalRecord.getHeight());
            ps.setString(7, medicalRecord.getMedications());
            ps.setString(8, medicalRecord.getObservations());
            ps.setString(9, medicalRecord.getStatus());
            ps.setString(10, medicalRecord.getSurgeryHistory());
            ps.setDouble(11, medicalRecord.getWeight());
            ps.setInt(12, medicalRecord.getPatientId());

            int rowsAffected = ps.executeUpdate();

            return rowsAffected > 0;

        } catch (SQLException e) 
        {
            System.out.println("Error (MedicalRecordDAO Update): " + e.getMessage());
            return false;
        }
    }
    
    public boolean Delete(int id) 
    {
        String sql = "DELETE FROM MedicalRecord WHERE id = ?";
        
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql)) 
        {
            ps.setInt(1, id);

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } 
        catch (SQLException e) 
        {
            System.out.println("Error (MedicalRecordDAO Delete): " + e.getMessage());
            return false;
        }
    }
}

