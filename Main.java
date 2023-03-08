/*8.7 Aqui estamos importando por primera vez una libreria con lo que aprendimos, el static para que las variables vivan
en la clase y el .* para que se importe todo, creo*/
import static ui.UIMenu.*;
public class Main {
    //5.0 Como en todo proyecto de java necesitamos un metodo name para que el proyecto pueda vivir
    public static void main(String[] args){
        //5.4 Aqui vemos un ejemplo sencillo de como se usan los atributos de una clase modularizada
        /*6.1 Aquí agregamos la funcion de que nosotros le pasamos el parametro
        y el metodo constructor lo añade como atributo a la nueva instancia utilizanod el atributo
        this.name = name que usamos en el metodo contructos*/
        Doctor myDoctor = new Doctor("Alejandro Sanchez", "Pediatra");
        myDoctor.showId();
        myDoctor.showName();
        System.out.println(myDoctor.id);

        //8.3 Aqui vamos a ver que ocure si se aumenta en la clase main, ya que es estatica pues saldrá 3 en el doctor 2
        //8.4 Aqui probammos que pasaría si le pondriamos al tipo de variable no static lo cual nos traería siempre el 1
        Doctor.id++;

        //8.2 Aqui declaramos otros doctores para ver como se imprimiria el id
        Doctor myDoctorAnd = new Doctor("Andrew Williams", "Enfermedades infecciosas");
        myDoctorAnd.showId();
        myDoctorAnd.showName();
        System.out.println(myDoctorAnd.id);

        /*8.8Aqui llamamos el showMenu sin el UIMenu ya que colocamos el import como static, asi tambien no olvidar poner
        la clase showMenu(); como publica*/
        //9.0 En esta clase mas usaremos solo esta cosa
        showMenu();

        //10 Vamos a ver como se puede inicializar una instancia de Doctor
        Doctor Ann = new Doctor("Anahí", "Profesora");
        //10 Aqui vimos mas que todo la funcion de this. y por que usarlo para que el valor se asigne a la instancia y no salga null
        System.out.println(Ann.name);
        System.out.println(Ann.speciality);
    }
}
