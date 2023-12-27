package com.company;

public class Staff {
    private int employee_no;
    private String name;
    private String gender;
    private int contact_no;
    private String kin;



    public Staff (String name, String gender, int employee_no, int contact_no, String kin){
        super();
        this.employee_no = employee_no;
        this.name = name;
        this.gender =gender;
        this.contact_no =contact_no;
        this.kin =kin;
    }

    //settergetter

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployee_no() {
        return employee_no;
    }

    public void setEmployee_no(int employee_no) {
        this.employee_no = employee_no;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getContact_no() {
        return contact_no;
    }

    public void setContact_no(int contact_no) {
        this.contact_no = contact_no;
    }

    public void setKin(String kin) {
        this.kin = kin;
    }

    public String getKin() {
        return kin;
    }
}




