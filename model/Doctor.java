package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    //5.2 Aqui vamos a ir agregando los tributos de la clase model.Doctor
    //8.0 Aqui agregamos nuestra primera variable estatica la cual siempre se iniciara en 0
    //20.0 Aqui retiramos los atributos redundantes la clase model.Doctor dejando el atributo que lo diferencia del paciente
    String speciality;
    //5.3 Agregamos los comportamientos

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //6.0 Recreamos el metodo constructor
    public Doctor(String name, String email){
        //8.1 Aun se inicie en 0 cada vez que se cree un doctor se debe aumentar en 1, se ah eliminado ya que a futuro el id estara en una base de datos
        /*6.1.1 Aqui podemos ver como debemos declarar que la variable para que
        coloque el nuevo atributo de la manera adecuada*/
        super(name, email);
        // this.speciality = especiality;
        // System.out.println("El nombre del doctor es: " + this.name);

    }
    public void showName(){
        System.out.println(name);
    }

    //Aqui declaramos id sin doctor.id ya que la variable vive en la clase
    public void showId(){
        System.out.println("ID doctor: id removido para que a futuro viva en una base de datos" );
    }

    //16.1En esta sección creamos el Array que va a guardar nuestras fechas
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    //16.2 Esta es la invocación del metodo que declaramos dentro de la clase.
    public void addAvailableAppointment(String date, String time){
        //34.5 Aqui vamos a tranformar el dato date a Sting en esta propia clase para no estar convirtiendolo en una clase no correspondiente
        availableAppointments.add(new AvailableAppointment(date, time));
    }
    //16.3 Finalmente este es el codigo que nos devolveria el Array de las citas ingresadas

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public void ShowUserData() {
        System.out.println("Doctor\nEl nombre del doctor es: " + getName() + "\nSu especialidad es: " + getSpeciality());
    }

    //16.0 Aqui vemos como creamos la Clase estatica anidada
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        //34.6 En esta parte vamos a aprender como cambiar un formato de String a Date, de esta manera es como trabajaremos con fehcas
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time){
            //34.7 ahora cuando intentemos la transformacion nos dara la opcion de capturar una excepcion para que el programa no se rompa
            //34.8 En try ponemos las lineas que son vulnerables a errores
            try {
                this.date = format.parse(date);
            }
            //34.9 y en catch el como vamos a manejar el error
            catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public Date getDate() {
            return date;
        }
//34.11 Sobrecarga del metodo get Date por si necesitamos o queremos que el get date nos transforme de date a format(String)
        public String getDate(String DATE) {
            return format.format(date);
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        
    }
}
