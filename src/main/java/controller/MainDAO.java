package controller;

import javax.swing.JFrame;
import view.view_Main;

public class MainDAO 
{
    public enum Singleton
    {
        INSTANCE;
        
        private view_Main main;
        
        private JFrame mainFrame;

        public view_Main getMain() {
            return main;
        }

        public void setMain(view_Main main) {
            this.main = main;
        }

        public JFrame getMainFrame() {
            return mainFrame;
        }

        public void setMainFrame(JFrame mainFrame) {
            this.mainFrame = mainFrame;
        }
    }
}
