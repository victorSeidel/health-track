package model;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AttachmentDTO 
{
    private int id;
    private String title;
    private String path;
    private LocalDateTime date;
    private int professionalId;
    private String professionalName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    
    public String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/yyyy HH:mm");
        return this.date.format(formatter);
    }

    public void setFormattedDate(Timestamp dateStr) {
        LocalDateTime date = dateStr.toLocalDateTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/yyyy HH:mm");
        String formattedDate = date.format(formatter);
        this.date = LocalDateTime.parse(formattedDate, formatter);
    }

    public int getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(int professionalId) {
        this.professionalId = professionalId;
    }

    public String getProfessionalName() {
        return professionalName;
    }

    public void setProfessionalName(String professionalName) {
        this.professionalName = professionalName;
    }
}
