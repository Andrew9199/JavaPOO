package ui;

import java.util.Scanner;

public class UIDoctorMenu {

    public static void showDoctorMenu(){
//33 En esta variable la ponemos para que el ciclo Do while no se rompa hasta que esto cambie
        int response = 0;
/*33.1 en cuanto a menus vamos a usar sobre todo el Do while, es mas lo usaremos bastante
a lo largo de los siguientes cursos*/
        do{
            System.out.println("/n/n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
/*33.2 En esta parte vamos a aclarar lo siguiente, haber, traemos la variable doctorLogged
desde la UIMenu, esta variable contendra el objeto del usuario que haya iniciado sesion,
ahora vamos a ver que se usa el metodo .getName() que habiamos creado ateriormente 
en la clase de getter  setter del modelo del objeto doctor el cual nos devolvera el
nombre del objeto contenido el cual paso de la variable d a la variable doctorLogged
Quien sabe esto le parezca redundante a mi yo del futuro pero quiero tener bien claro
el camino que ha tenido cada pedazo de mi codigo*/
            System.out.println("1. Add Available Appintment");
            System.out.println("2. My Scheduled appointments");
            System.out.println("0. Logout");

//33.4 Ahora debemos solicitar una respuesta

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

//33.5 Y empezamos con las evaluaciones de las respuestas

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    //33.6 En este caso es si el usuario quiere salir, cerrar sesion o "logout"
                    UIMenu.showMenu();
                    break;
            }
        }while (response != 0);
    }

    /*33.7 Hecho esto creamos un nuevo metodo, el nombre es asi de largo ya que es una
    * buena practica el no poner abreviaturas y que los metodos tengan un nombre
    * lo mas descriptivo posible*/
    private static void showAddavailableAppointmentsMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println(":: Add Available Appointment");
            System.out.println(":: Select a Month");

            for (int i = 0; i < 3; i++) {
            //33.8 Aqui no usamos la propia i ya que si la incrementamos vamos a afectar el ciclo for
            //33.9 Por cierto, el uso de esta variable es para mostrar el numero de mes
                int j = i + 1;
                //33.9 En esta seccion llamamos al la clase MONTHS en la cual declaramos todos los meses
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            //33.10 Siempre debemos dejar una opcion de regreso para no dejar atrapado al usuario
            System.out.println("0 : return");
            //33.11 Abrimos nuevamente el escaner para hacer las comparaciones en el menu
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            //33.12 Una vez con la respuesta del usuario pondremos las acciones que va a dar cada opcion, sin olvidar claro poner nuestro return
            if (response > 0 && response < 4){
                //1,2,3
                //33.13 En esta parte asiganaremos el mes seleccionado a una variable mas descriptiva
                int monthSelected = response;
                System.out.println(monthSelected + UIMenu.MONTHS[monthSelected]);

                System.out.println("Insert the date avaible: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Your date is: " + date + "\n1. Correct\n2. Chage Date");
                //33.14 A continuacion veremos como usaremos continue y break, mas bien las pondermos en uso.
            } else if (response == 0) {
                showDoctorMenu();
            }
        } while (response != 0);
    }
}
