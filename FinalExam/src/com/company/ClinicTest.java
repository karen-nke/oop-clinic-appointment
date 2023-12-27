package com.company;


public class ClinicTest {
    public static void main(String[] args) {

        Patient patient1 = new Patient("Slyvie", "Address 1", 445567,201,"F");
        Patient patient2 = new Patient("Bobby", "Address 2", 453574,202,"M");
        Patient patient3 = new Patient("Danny", "Address 3", 775321,203,"M");

        System.out.println("<Patient List>");

        System.out.println(patient1);
        System.out.println(patient2);
        System.out.println(patient3);

        Doctor doctor1 = new Doctor ("Alex", "M",001, 123456, "Robert", "Master",100);
        Doctor doctor2 = new Doctor("Mary", "F",002, 789023, "Peter", "Degree",101);
        Doctor doctor3 = new Doctor ("John", "M",003, 654321, "Jay", "Degree",102);

        System.out.println("<Doctor List>");
        System.out.println(doctor1);
        System.out.println(doctor2);
        System.out.println(doctor3);


        Reception reception1 = new Reception("Janice","F",004,987765,"Tom","First Aid 101",2021);
        Reception reception2 = new Reception("Christine","F",005,554332,"Geoffrey","First Aid for All",2021);

        System.out.println("<Receptionist List>");
        System.out.println(reception1);
        System.out.println(reception2);


        Appointment appointment1 = new Appointment(301, 01-02-20221,001,"Present");
        Appointment appointment2 = new Appointment(302, 04-05-2021, 002, "Not Present");
        Appointment appointment3 = new Appointment(303, 06-07-2021, 003, "Present");

        System.out.println("<Appointment List>");
        System.out.println(appointment1);
        System.out.println(appointment2);
        System.out.println(appointment3);


        Receipt receipt1 = new Receipt(201,301, 10000, 0);
        Receipt receipt2 = new Receipt(202,302, 20000, 4);
        Receipt receipt3 = new Receipt(202,302, 20000, 1);

        System.out.println("<Receipt List>");

        System.out.println(receipt1);
        if (receipt1.checkRequirment()){
            System.out.println("RM300 Deposit is require for appointment because you had missed more than 3 times\n");
        }
        else{
            System.out.println("Deposit is not require.\n");
        }

        System.out.println(receipt2);
        if (receipt2.checkRequirment()){
            System.out.println("RM300 Deposit is require for appointment because you had missed more than 3 times\n");
        }
        else{
            System.out.println("Deposit is not require.\n");
        }

        System.out.println(receipt3);
        if (receipt3.checkRequirment()){
            System.out.println("RM300 Deposit is require for appointment because you had missed more than 3 times\n");
        }
        else{
            System.out.println("Deposit is not require.\n");
        }





    }
}
