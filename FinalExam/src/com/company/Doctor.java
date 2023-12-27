package com.company;

public class Doctor extends Staff{

    private String highest_qualification;
    private int GDA_register_no;


    public Doctor(String name, String gender, int employee_no, int contact_no, String kin, String h, int g){
        super(name, gender, employee_no,contact_no,kin);
        highest_qualification =h;
        GDA_register_no =g;
    }


    public String getHighest_qualification() {
        return highest_qualification;
    }

    public void setHighest_qualification(String highest_qualification) {
        this.highest_qualification = highest_qualification;
    }

    public int getGDA_register_no() {
        return GDA_register_no;
    }

    public void setGDA_register_no(int GDA_register_no) {
        this.GDA_register_no = GDA_register_no;
    }

    //toString
    @Override
    public String toString(){
        return String.format("Doctor Name: %S\nGender: %S \nEmployee ID: %d\nContact No: %d\nNext of Kin: %S\nHighest Qualification:%s\nGeneral Doctor Association Register Number:%d\n", super.getName(),super.getGender(),super.getEmployee_no(), super.getContact_no(), super.getKin(),highest_qualification,GDA_register_no);
    }



}
