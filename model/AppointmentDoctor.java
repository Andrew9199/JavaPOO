package model;

import java.util.Date;

public class AppointmentDoctor implements ISchedulable {
    private int id;
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String time;

    //37 Asi tambien generamos un metodo constructor que este habilitado con los datos que tenemos en
    // public void addAppointmentDoctors(Doctor doctor, Date date, String time)

    public AppointmentDoctor(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
//37 Tmb para que todo quede mas chido le colocamos que se le agrege el "hrs." cuando se envie la hora
    public String getTime() {
        return time + "hrs.";
    }

    public void setTime(String time) {
        this.time = time;
    }

    //24.1 Esta es la implementacion obligatoria del implemento
    /**37 Yyyy tmb ponemos algunas cosas en la agenda pero esta solo se ejecuta hasta que se ejecuta por si ya tenemos
    *la cita pero todavia no hemos cuadrado la hora*/
    @Override
    public void schedule(Date date, String time) {
        this.date = date;
        this.time = time;
    }
}
