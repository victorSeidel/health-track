package controller;

import view.view_Main;

public class MainDAO 
{
    public enum Singleton
    {
        INSTANCE;
        
        private view_Main main;

        public view_Main getMain() {
            return main;
        }

        public void setMain(view_Main main) {
            this.main = main;
        }
    }
}
