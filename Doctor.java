import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    //5.2 Aqui vamos a ir agregando los tributos de la clase Doctor
    //8.0 Aqui agregamos nuestra primera variable estatica la cual siempre se iniciara en 0
    static int id = 0;
    String name;
    String speciality;
    //5.3 Agregamos los comportamientos

    //6.0 Recreamos el metodo constructor
    Doctor(String name, String especiality){
        //8.1 Aun se inicie en 0 cada vez que se cree un doctor se debe aumentar en 1
        ++id;
        /*6.1.1 Aqui podemos ver como debemos declarar que la variable para que
        coloque el nuevo atributo de la manera adecuada*/
        this.name = name;
        this.speciality = especiality;
        System.out.println("El nombre del doctor es: " + this.name);
    }
    public void showName(){
        System.out.println(name);
    }

    //Aqui declaramos id sin doctor.id ya que la variable vive en la clase
    public void showId(){
        System.out.println("ID doctor: " + id);
    }

    //16.1En esta sección creamos el Array que va a guardar nuestras fechas
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    //16.2 Esta es la invocación del metodo que declaramos dentro de la clase.
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }
    //16.3 Finalmente este es el codigo que nos devolveria el Array de las citas ingresadas

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    //16.0 Aqui vemos como creamos la Clase estatica anidada
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
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
