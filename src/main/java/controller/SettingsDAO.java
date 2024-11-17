package controller;

import view.view_Home;

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
