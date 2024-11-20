package controller;

import controller.ConnectDAO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.PredefinedTextDTO;

public class PredefinedTextDAO 
{
    public boolean Insert(PredefinedTextDTO predefinedText)
    {
        String sql = "INSERT INTO PredefinedText(name, type, text) VALUES (?, ?, ?)";
    
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql)) 
        {
            ps.setString(1, predefinedText.getName());
            ps.setInt(2, predefinedText.getType());
            ps.setString(3, predefinedText.getText());

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) 
            {
                return true;
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error (PredefinedTextDAO Insert): " + e.getMessage());
        }
        
        return false;
    }
    
    public ArrayList<PredefinedTextDTO> List(int type)
    {
        ArrayList<PredefinedTextDTO> list = new ArrayList<>();
        
        String sql = "SELECT id, name, text FROM PredefinedText WHERE type = ?";
        
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql);) 
        { 
            ps.setInt(1, type);
            
            try (ResultSet rs = ps.executeQuery())
            {
                while (rs.next()) 
                {
                    PredefinedTextDTO predefinedText = new PredefinedTextDTO();
                    predefinedText.setId(rs.getInt("id"));
                    predefinedText.setName(rs.getString("name"));
                    predefinedText.setText(rs.getString("text"));

                    list.add(predefinedText);
                }   
                return list;   
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error (PredefinedTextDAO List): " + e.getMessage());
        }
        return null;
    }   
    
    public boolean Update(PredefinedTextDTO predefinedText) 
    {
        String sql = "UPDATE PredefinedText SET name = ?, text = ? WHERE id = ?";
        
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql)) 
        {
            ps.setString(1, predefinedText.getName());
            ps.setString(2, predefinedText.getText());
            ps.setInt(3, predefinedText.getId());

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Erro (PredefinedTextDAO Update): " + e.getMessage());
            return false;
        }
    }

    public boolean Delete(int id) 
    {
        String sql = "DELETE FROM PredefinedText WHERE id = ?";
        
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql)) 
        {
            ps.setInt(1, id);

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao excluir o anexo: " + e.getMessage());
            return false;
        }
    }
}

