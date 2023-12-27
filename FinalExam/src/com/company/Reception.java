package com.company;

public class Reception extends Staff{
    private String course_name;
    private int attend_year;



    public Reception(String name, String gender, int employee_no, int contact_no, String kin, String c, int a){
        super(name, gender, employee_no,contact_no,kin);
        course_name =c;
        attend_year =a;

    }

    public int getAttend_year() {
        return attend_year;
    }

    public void setAttend_year(int attend_year) {
        this.attend_year = attend_year;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    //toString
    @Override
    public String toString(){
        return String.format("Receptionist Name: %S\nGender: %S \nEmployee ID: %d\nContact No: %d\nNext of Kin: %S\nCourse Taken:%s\nYear Taken(Last Attend):%d\n", super.getName(),super.getGender(),super.getEmployee_no(), super.getContact_no(), super.getKin(),course_name,attend_year);
    }
}
