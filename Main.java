public class Main {
    //5.0 Como en todo proyecto de java necesitamos un metodo name para que el proyecto pueda vivir
    public static void main(String[] args){
        //5.4 Aqui vemos un ejemplo sencillo de como se usan los atributos de una clase modularizada
        /*6.1 Aquí agregamos la funcion de que nosotros le pasamos el parametro
        y el metodo constructor lo añade como atributo a la nueva instancia utilizanod el atributo
        this.name = name que usamos en el metodo contructos*/
        Doctor myDoctor = new Doctor("Alejandro Sanchez");
        myDoctor.showName();
    }
}
