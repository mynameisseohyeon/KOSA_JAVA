package org.example;

public class Regular { // 급여

    private int workDays; // 근무 일수
    private int hourlyWages; // 시급

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public int getHourlyWages() {
        return hourlyWages;
    }

    public void setHourlyWages(int hourlyWages) {
        this.hourlyWages = hourlyWages;
    }

    public Regular(int workDays, int hourlyWages) {
        this.workDays = workDays;
        this.hourlyWages = hourlyWages;
    }
}
