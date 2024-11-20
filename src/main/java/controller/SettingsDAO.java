package controller;

public class SettingsDAO 
{
    public enum Singleton
    {
        INSTANCE;
        
        private boolean startNewPanel;

        public boolean isStartNewPanel() {
            return startNewPanel;
        }

        public void setStartNewPanel(boolean startNewPanel) {
            this.startNewPanel = startNewPanel;
        }
    }
}
