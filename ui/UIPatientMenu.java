package ui;
//35 ahora vamos a ir avanzando con la interfaz del usuario
import ui.UIMenu.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import model.Doctor;

public class UIPatientMenu {

    public static void showPatientMenu(){
        int response = 0;
        do {
            
            System.out.println("/n/n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged);
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        } while (response != 0);
    }
    private static void showBookAppointmentMenu(){
        int response = 0;
        do {
            System.out.println(":: Book an appointment");
            System.out.println(":: Select date: ");
            //35 Aqui empieza algo interesante por lo que usaremos una coleccion llamada map pero eso lo veremos la proxima clase
            //36 Los map son colecciones key value
            //36.1 El prime valor va a ir la numeracion de la lista de fechas
            //[doctors]
            //1.- doctor1
                //-1 fecha1
                //-2 fecha2
            //2.- doctor2
            //3.- doctor3
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                /**5:04 Haber esto esta medio complicado asi que
                * 1 creamos el array llamado availableAppointment en donde vamos a capturar las citas
                * recordemos que AvailableAppointment es una clase estatica anidada
                 * ArrayList<Doctor.AvailableAppointment> availableAppointments
                * 2 accedemos a los datos con UIDoctorMenu.doctorsAvailableAppointments
                 * 3 y con el get(i) lo vamos recorriendo y obtenemos el indice del doctor que tenga
                 * citas disponibles
                 * 4 luego con getAvailableappointments() obtendremos la cita en cuestion enlazada a el indice del doctor*/
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                        = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();
                //Aqui crearemos el segundo nivel de esto y tambien por esto usamos treemap
                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
                //Ahora vamos a estar accediendo a el array que creamos mas arriba
                for (int j = 0; j < availableAppointments.size(); j++) {
                    /**Ahora debemos capturar los indices de los doctores (el primer numero del modelo de [doctors])
                     * Para esto creamos la variable k la cual tendra ese valor atravez de cada ciclo*/
                    k++; //Aqui aumentamos el indice ya que en esta parte ya estariamos imprimiendo valor y en los arrays empiezan desde el 0
                    /**Ahora vamos a obtener la fecha con formato como la queremos para luego utilizar nuestro doctorAppointment
                     * Para ir capturando el indice de la fecha y por otro lado el objeto doctor de la fecha correspondiente
                     */
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    //En esta parte tambien vemos que debemos convertir a j ya que map no puede aceptar valores primitivos, esto lo arreglamos con nuestra clase grapper
                    //Aqui vamos metiendo los datos en el map con put el cual tiene como parametros key, value
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    //De esta manera creamos una estructura que nos ayudara a darle la salida deseada a nuestros usuarios
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                    //Estamos metiendo una lista de objetos en una lista con un indice y objetos :0
                }
            }
            //Una vez dadas las fechas debemos manejar la respuesta del usuario
            Scanner sc = new Scanner(System.in);
            //Con esto ya sabemos que doctor mostrarle segun la fecha que ah seleccionado
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            //--------Hasta aqui llego la clase 36--------//
            //--------Aqui empieza la clase 37--------//
            /**
             * Vamos a crear otro map con el cual vamos a usar el arbol map para ingresar al dato que queremos que creo
             * es el nombre del doc*/
            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            //Aqui guardaremos el indice de la fecha y un doctor que a futuro guardara el doctor seleccionado
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("","");

            //Vamos a recorrer nuestro map con nuetro foreach
            for (Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }
            //Esto se va a descontrolaaaaar
            /**aqui vemos que empezamos a traer datos, pim pam pum, casi como traer oraciones lo cual si no hubiesemos
             * aplicado programacion orientada a objetos*/
            System.out.println(doctorSelected.getName() +
                    ".Date: " + doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
                    ".Time: " + doctorSelected.getAvailableAppointments().get(indexDate).getTime());
            System.out.println("Confirm your appointment: \n1. YES \2. Chage Data");
            response = Integer.valueOf(sc.nextLine());
            //37 Finalmente colocamos la logica luego de tener toda esta informacion
            //37 luego de un chingo de cambios venimos a aplicar esto
            if (response == 1){
                UIMenu.patientLogged.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime()
                );
                showPatientMenu();
            }
        }while (response != 0);
    }
    //37 Ahora con la opcion 2 tmb conocida como 2. My appointments
    private static void showPatientMyAppointments(){
        int response = 0;
        do {
            System.out.println(":: My Appointments");
            if (UIMenu.patientLogged.getAppointmentDoctors().size() == 0){
                System.out.println("Don't have appointments");
                break;
            }

            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " +
                        "Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                        "Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
                        "\n Doctor" + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName());
            }
            System.out.println("0. Return");
        } while (response != 0);

    }
}
