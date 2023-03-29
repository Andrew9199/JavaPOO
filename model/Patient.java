package model;

import java.util.ArrayList;
import java.util.Date;


public class Patient extends User {
    
    
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    
    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentDoctor> appointmentNurse = new ArrayList<>();
    

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentDoctor> getAppointmentNurse() {
        return appointmentNurse;
    }

    public void setAppointmentNurse(ArrayList<AppointmentDoctor> appointmentNurse) {
        this.appointmentNurse = appointmentNurse;
    }

    
    
    public Patient(String name, String email) {
        super(name, email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    
    
    public String getWeight() {
        return this.weight + "Kg.";
    }

    
    
    
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    
    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\nWeigth: " + getWeight() +
        "\nHeight: " + getHeight() + "\nBlood: " + blood;
    }

    @Override
    public void ShowUserData() {
        System.out.println("Paciente \nSu cumpleaños es: " + getBirthday() + "\nSu tipo de sangre es " + getBlood());
    }
}