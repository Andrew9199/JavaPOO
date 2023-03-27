package model;

import java.util.ArrayList;
import java.util.Date;

//Reto 11
public class Patient extends User {
    // 20.0 Aqui retiramos los atributos redundantes la clase model.Doctor dejando el
    // atributo que lo diferencia del paciente
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //37 Aqui vamos a agregar un map que tiene las citas que va a tener habilitadas el paciente
    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentDoctor> appointmentNurse = new ArrayList<>();
    //37 Y tambien generamos los getters y setters

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }
//37 Y en el caso de doctors le ponemos add en lugar de set y de parametros recibira Doctor doctor, Date date, String time
    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        //Finalmente luego de los ajustes en appointment doctor y que tengamos planteada la fecha de la cita aejcutamos el schedule
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentDoctor> getAppointmentNurse() {
        return appointmentNurse;
    }

    public void setAppointmentNurse(ArrayList<AppointmentDoctor> appointmentNurse) {
        this.appointmentNurse = appointmentNurse;
    }

    // 12.0 Nota importante, los metodos constructores solo tienen un modificador de
    // acceso, ni void ni nada
    public Patient(String name, String email) {
        super(name, email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    // 13 Aqui establecemos las reglas del negocio en las clases en donde no se
    // pueden modificar por los usuarios
    public String getWeight() {
        return this.weight + "Kg.";
    }

    // 13.0 El metodo setter en publico para que podamos utilizarlo de cierto lugar
    // 13.1 Este metodo tiene regreso en void por el hecho de que no devuelve na' y
    // setWeight es una convencion de nombre
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

    //21.1 Esta es la primera sobreescritura del metodo toString
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