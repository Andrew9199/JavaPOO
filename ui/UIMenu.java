//8.5 Aqui esta el codigo que nos dejo la profe, no se del todo que es pero bueno
//8.6 La ui se debe poner en una carpeta aparte :0
package ui;
//32.2 En esta parte importamos los modelos de las clases para los Arrays
import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;
import static ui.UIDoctorMenu.showDoctorMenu;

public class UIMenu {
    //9.1 Aqui declaramos los meses de manera estatica para poder acceder a ellos desde cualquier parte del codigo
    /*9.3 Vamos a dejar el month como una constante utilizando la palabra reservada Final, esta palabra casi siempre va
    con static pues una constante generalmente se la necesita en todo el programa*/
    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    //32.3 Aqui creamos las variables que usamos para dar el resultado final del Doctor o paciente logeado
    public static Doctor doctorLogged;
    public static Patient patientLogged;
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    System.out.println("Doctor");
                    //Aqui vamos a asignar el tipo de usuario segun que diga el usuario
                    response = 0;
                    authUser(1);
                    showDoctorMenu();
                    break;
                case 2:
                    response = 0;
                    //Segundo caso en el cual el tipo de usuario seria 2 o Paciente
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    //9.2 Aqui ponemos el codigo para que se pongan solo los primeros 3 meses
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

//32.0 Aquí creamos el metodo que nos ayudara con la autenticación del doctor o paciente
    private static void authUser(int userType){
        //UserType = 1 Doctor
        //UserType = 2 Patient
//32.1 Aquí creamos los Arrays
        //Array de Doctor
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martinez", "alejandra@gmail.com"));
        doctors.add(new Doctor("Roberto Rodriguez", "roberto@gmail.com"));
        doctors.add(new Doctor("Rocio Gómez", "Rocio@gmail.com"));
    //Array de Pacient
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Alexis Sanchez", "alexis@gmail.com"));
        patients.add(new Patient("Juan Torres", "alejandra@gmail.com"));
        patients.add(new Patient("Andrew Williams", "andrew@gmail.com"));
        //32.02 Creamos una variable booleana para la logica de la siguiente validacion
        boolean emailCorrect = false;
    //32.2 Aqui vemos la logica de comprobacion de lo que va del mail y tal
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
/*Hasta aqui todo chido pero ahora nos vamos hasta la clase y creamos unas
variables con scope en la raiz de la clase que serán las de arriba las cuales
nos serviran para saber en que Array buscar el correo ingresado, ahora esto se
nos da a la hora de que en el menu nos dicen si va a ingresar un Doctor o un
Paciente que sería el usuario logeado*/
            if (userType == 1){
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario logeado
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                    if (userType == 2){
                        for (Patient p: patients){
                            if (p.getEmail().equals(email)){
                                emailCorrect = true;
                                //Obtener el Paciente logeado
                                patientLogged = p;
                            }
                        }
                    }
                }
            }


        }while (!emailCorrect);
    }
}
