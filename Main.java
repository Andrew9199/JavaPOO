/*8.7 Aqui estamos importando por primera vez una libreria con lo que aprendimos, el static para que las variables vivan
en la clase y el .* para que se importe todo, creo*/
// import model.Doctor;
// import model.Nurse;
// import model.Patient;
// import model.User;
import static ui.UIMenu.*;
// import java.util.Date;

public class Main {
    //5.0 Como en todo proyecto de java necesitamos un metodo name para que el proyecto pueda vivir
    public static void main(String[] args) {
        //5.4 Aqui vemos un ejemplo sencillo de como se usan los atributos de una clase modularizada
        /*6.1 Aquí agregamos la funcion de que nosotros le pasamos el parametro
        y el metodo constructor lo añade como atributo a la nueva instancia utilizanod el atributo
        this.name = name que usamos en el metodo contructos*/
        //Doctor myDoctor = new Doctor("Alejandro Sanchez","alexis@gmail.com");
        /*myDoctor.showId();
        myDoctor.showName();
        System.out.println(myDoctor.id);*/
        //16.4 Prueba
        // myDoctor.addAvailableAppointment(new Date().toString(), "4PM");
        // myDoctor.addAvailableAppointment(new Date().toString(), "10AM");
        // myDoctor.addAvailableAppointment(new Date().toString(), "1PM");

        //16.5 Este codigo nos imprimira la lista de ids de los datos, va hasta donde entiendo
        /*System.out.println(myDoctor.getAvailableAppointments());*/

        //16.6 Aqui usamos un for each para recorrer el codig uno a uno e imprimir lo que nos interesa

        /*for (model.Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }*/

        //8.3 Aqui vamos a ver que ocure si se aumenta en la clase main, ya que es estatica pues saldrá 3 en el doctor 2
        //8.4 Aqui probammos que pasaría si le pondriamos al tipo de variable no static lo cual nos traería siempre el 1
        //model.Doctor.id++;

        //8.2 Aqui declaramos otros doctores para ver como se imprimiria el id
        /*model.Doctor myDoctorAnd = new model.Doctor("Andrew Williams", "Enfermedades infecciosas");
        myDoctorAnd.showId();
        myDoctorAnd.showName();
        System.out.println(myDoctorAnd.id);*/

        /*8.8Aqui llamamos el showMenu sin el UIMenu ya que colocamos el import como static, asi tambien no olvidar poner
        la clase showMenu(); como publica*/
        //9.0 En esta clase mas usaremos solo esta cosa
        //showMenu();

        //10 Vamos a ver como se puede inicializar una instancia de model.Doctor
        //model.Doctor Ann = new model.Doctor("Anahí", "Profesora");
        //10 Aqui vimos mas que todo la funcion de this. y por que usarlo para que el valor se asigne a la instancia y no salga null
        /*System.out.println(Ann.name);
        System.out.println(Ann.speciality);*/

        //12.1 Creación de nueva instancia patient
        /*Patient patient = new Patient("Alejandra", "alejanda@mail.com");
        patient.setWeight(55.14);
        System.out.println(patient.getWeight());
        patient.setPhoneNumber("12355123");
        System.out.println(patient.getPhoneNumber());

        //21.2 Uso de la sobreescritura del metodo toString()
        System.out.println(patient);*/

        /*27.2 Aqui veremos la aplicacion de las clases abstractas,
        veremos que apesar de ser de la misma entidad User van a tomar distintos comportamientos*/
        //27.3 Primera instanciacion de una entidad Doctor
        // User userDoc = new Doctor("Alex", "alex@alex.com", "Pediatria");
        // userDoc.ShowUserData();
        // //27.3 Primera instanciacion de una entidad Nurse
        // User userNurse = new Nurse("Anita", "anita@anita.com", "General");
        // userNurse.ShowUserData();
        // //27.3 Primera instanciacion de una entidad Patient
        // User userPatient = new Patient("Carlos", "carlos@hotmail.com");
        // userPatient.ShowUserData();

        showMenu();
    }
}