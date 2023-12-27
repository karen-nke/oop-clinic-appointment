package com.company;

public class Receipt {
    private int patient_id;
    private int appointment_id;
    private int cost;
    private int time_missed;

    public Receipt(int p, int a, int c, int t){
        patient_id =p;
        appointment_id =a;
        cost =c;
        time_missed=t;

    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTime_missed() {
        return time_missed;
    }

    public void setTime_missed(int time_missed) {
        this.time_missed = time_missed;
    }

    public boolean checkRequirment() {
        if (time_missed > 3) {
            return true;
        } else
            return false;


    }

    @Override
    public String toString(){
        return String.format("Patient ID: %d,\nAppointment ID: %d,\nCost of Treatment: %d,\nPatient missed: %d times", patient_id,appointment_id,cost,time_missed);
    }




}
