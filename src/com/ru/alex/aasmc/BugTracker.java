package com.ru.alex.aasmc;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSpring() {
        System.out.println("Sprint is active");
        activeSprint = true;
    }

    public void finishSprint() {
        System.out.println("Sprint is inactive");
        activeSprint = false;
    }
}
