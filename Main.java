/*8.7 Aqui estamos importando por primera vez una libreria con lo que aprendimos, el static para que las variables vivan
en la clase y el .* para que se importe todo, creo*/
import static ui.UIMenu.*;

import java.util.Date;
public class Main {

    //18
    public static enum Numero {
        UNO("One","Huk","Um"),
        DOS("Two","Iskay","Dois"),
        TRES("Three","Kinsa","Três"),
        CUATRO("Four","Tawa","Quatro"),
        CINCO("Five","Pisqa","Cinco"),
        SEIS("Six","Soqta","Seis"),
        SIETE("Seven","Qanchis","Sete"),
        OCHO("Eight","Pusaq","Oito"),
        NUEVE("Nine","Isqon","Nove"),
        DIEZ("Ten","Chunka","Dez");

        private String english;
        private String quechua;
        private String portugues;

        private Numero(String e,String q, String p){
            english = e;
            quechua = q;
            portugues = p;
        }

        public String getEnglish() {
            return english;
        }

        public String getQuechua() {
            return quechua;
        }

        public String getPortugues() {
            return portugues;
        }
    }
    //5.0 Como en todo proyecto de java necesitamos un metodo name para que el proyecto pueda vivir
    public static void main(String[] args){
        //5.4 Aqui vemos un ejemplo sencillo de como se usan los atributos de una clase modularizada
        /*6.1 Aquí agregamos la funcion de que nosotros le pasamos el parametro
        y el metodo constructor lo añade como atributo a la nueva instancia utilizanod el atributo
        this.name = name que usamos en el metodo contructos*/
        Doctor myDoctor = new Doctor("Alejandro Sanchez", "Pediatra");
        /*myDoctor.showId();
        myDoctor.showName();
        System.out.println(myDoctor.id);*/
        //16.4 Prueba
        myDoctor.addAvailableAppointment(new Date(), "4PM");
        myDoctor.addAvailableAppointment(new Date(), "10AM");
        myDoctor.addAvailableAppointment(new Date(), "1PM");

        //16.5 Este codigo nos imprimira la lista de ids de los datos, va hasta donde entiendo
        /*System.out.println(myDoctor.getAvailableAppointments());*/

        //16.6 Aqui usamos un for each para recorrer el codig uno a uno e imprimir lo que nos interesa

        /*for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }*/

        
        //18.1
        for (int i = 0; i < Numero.values().length; i++) {
            System.out.println(Numero.values()[i].getQuechua()+ ","+ Numero.values()[i].getEnglish()+ ","+ Numero.values()[i].getPortugues());
        }

        System.out.println("\nhora en distintos idiomas :D! y con ForEach\n");
        for (Numero numero: Numero.values()) {
            System.out.println(numero.getQuechua() +","+ numero.getEnglish() +","+ numero.getPortugues() );
        }
    }

        //8.3 Aqui vamos a ver que ocure si se aumenta en la clase main, ya que es estatica pues saldrá 3 en el doctor 2
        //8.4 Aqui probammos que pasaría si le pondriamos al tipo de variable no static lo cual nos traería siempre el 1
        //Doctor.id++;

        //8.2 Aqui declaramos otros doctores para ver como se imprimiria el id
        /*Doctor myDoctorAnd = new Doctor("Andrew Williams", "Enfermedades infecciosas");
        myDoctorAnd.showId();
        myDoctorAnd.showName();
        System.out.println(myDoctorAnd.id);*/

        /*8.8Aqui llamamos el showMenu sin el UIMenu ya que colocamos el import como static, asi tambien no olvidar poner
        la clase showMenu(); como publica*/
        //9.0 En esta clase mas usaremos solo esta cosa
        //showMenu();

        //10 Vamos a ver como se puede inicializar una instancia de Doctor
        //Doctor Ann = new Doctor("Anahí", "Profesora");
        //10 Aqui vimos mas que todo la funcion de this. y por que usarlo para que el valor se asigne a la instancia y no salga null
        /*System.out.println(Ann.name);
        System.out.println(Ann.speciality);*/

        //12.1 Creación de nueva instancia patient
        /*Patient patient = new Patient("Alejandra", "alejanda@mail.com");
        patient.setWeight(55.14);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("12355123");
        System.out.println(patient.getPhoneNumber());*/
    }