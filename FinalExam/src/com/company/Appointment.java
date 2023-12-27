package com.company;

public class Appointment {
    private int ap_id;
    private int date;
    private int doctor_assigned;
    private String status;

    public Appointment(int i, int d, int a, String s) {
        ap_id = i;
        date = d;
        doctor_assigned = a;
        status = s;

    }

    public int getAp_id() {

        return ap_id;
    }

    public void setAp_id(int ap_id) {

        this.ap_id = ap_id;
    }

    public int getDate() {

        return date;
    }

    public void setDate(int date) {

        this.date = date;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public int getDoctor_assigned() {
        return doctor_assigned;
    }

    public void setDoctor_assigned(int doctor_assigned) {
        this.doctor_assigned = doctor_assigned;

    }


    @Override
    public String toString(){
        return String.format("Appointment ID: %d\nAppointment Date: %d\nDoctor ID %d\nStatus of Patient %s\n ", ap_id, date,doctor_assigned,status);
    }


}
