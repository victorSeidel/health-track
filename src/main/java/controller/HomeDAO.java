package controller;

import view.view_Home;

public class HomeDAO 
{
    public enum Singleton
    {
        INSTANCE;
        
        private view_Home home;

        public view_Home getHome() {
            return home;
        }

        public void setHome(view_Home home) {
            this.home = home;
        }
    }
}
