package controller;

import model.MedicalRecordDTO;
import model.PatientDTO;

public class SettingsDAO 
{
    public enum Singleton
    {
        INSTANCE;
        
        private PatientDTO patient;
        
        public PatientDTO getPatient() {
            return patient;
        }

        public void setPatient(PatientDTO patient) {
            this.patient = patient;
        }
        
        private MedicalRecordDTO medicalRecord;

        public MedicalRecordDTO getMedicalRecord() {
            return medicalRecord;
        }

        public void setMedicalRecord(MedicalRecordDTO medicalRecord) {
            this.medicalRecord = medicalRecord;
        }
        
        private boolean startNewPanel;

        public boolean isStartNewPanel() {
            return startNewPanel;
        }

        public void setStartNewPanel(boolean startNewPanel) {
            this.startNewPanel = startNewPanel;
        }
    }
}
