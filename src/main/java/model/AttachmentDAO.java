package model;

import controller.ConnectDAO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AttachmentDAO 
{
    public boolean Insert(AttachmentDTO attachment)
    {
        String sql = "INSERT INTO Attachment(title, path, professionalId) VALUES (?, ?, ?)";
    
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql)) 
        {
            ps.setString(1, attachment.getTitle());
            ps.setString(2, attachment.getPath());
            ps.setInt(3, attachment.getProfessionalId());

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) 
            {
                return true;
            }
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error (AttachmentDAO): " + e.getMessage());
        }
        
        return false;
    }
    
    public ArrayList<AttachmentDTO> List()
    {
        ArrayList<AttachmentDTO> list = new ArrayList<>();
        
        String sql = "SELECT a.id, a.title, a.path, a.date, a.professionalId, p.name FROM Attachment a JOIN Professional p ON a.professionalId = p.id ORDER BY a.date DESC";
        
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) 
        {
            while (rs.next()) 
            {
                AttachmentDTO attachment = new AttachmentDTO();
                attachment.setId(rs.getInt("id"));
                attachment.setTitle(rs.getString("title"));
                attachment.setPath(rs.getString("path"));
                attachment.setFormattedDate(rs.getTimestamp("date"));
                attachment.setProfessionalId(rs.getInt("professionalId"));
                attachment.setProfessionalName(rs.getString("name"));
                
                list.add(attachment);
            }   
            return list;
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error (AttachmentDAO): " + e.getMessage());
        }
        return null;
    }   
    
    public AttachmentDTO Select(int id) throws SQLException
    {
        AttachmentDTO attachment = new AttachmentDTO();
        String sql = "SELECT title, path FROM Attachment WHERE id = ?";
        
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql))
        {
            ps.setInt(1, id);
            
            try (ResultSet rs = ps.executeQuery()) 
            {
                if (rs.next()) 
                {
                    attachment.setTitle(rs.getString("title"));
                    attachment.setPath(rs.getString("path"));
                }   
                return attachment;
            } 
            catch (SQLException e) 
            {
                JOptionPane.showMessageDialog(null, "Error (AttachmentDAO): " + e.getMessage());
            }
        }      
        return null;
    } 
    
    public boolean Update(AttachmentDTO attachment) 
    {
        String sql = "UPDATE Attachment SET title = ?, date = ?, professionalId = ? WHERE id = ?";
        
        try (Connection conn = new ConnectDAO().ConnectDB(); PreparedStatement ps = conn.prepareStatement(sql)) 
        {
            ps.setString(1, attachment.getTitle());
            ps.setString(2, attachment.getFormattedDate());
            ps.setInt(3, attachment.getProfessionalId());
            ps.setInt(4, attachment.getId());

            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar o anexo: " + e.getMessage());
            return false;
        }
    }

    public boolean Delete(int id) 
    {
        String sql = "DELETE FROM Attachment WHERE id = ?";
        
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

