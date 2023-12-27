package com.company;

public class Patient {
    private String name;
    private String address;
    private int contact_no;
    private int patient_id;
    private String gender;


    public Patient (String n, String a, int c, int p, String g){
        name = n;
        address = a;
        contact_no = c;
        patient_id =p;
        gender =g;


    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact_no() {
        return contact_no;
    }

    public void setContact_no(int contact_no) {
        this.contact_no = contact_no;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;

    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    //toString
    @Override
    public String toString(){
        return String.format("Patient name: %S\nPatient Address: %S \nPatient Contact No: %d \nPatient ID: %d\nPatient Gender: %S\n", name, address,contact_no,patient_id,gender);
    }

}
