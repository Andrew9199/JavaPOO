public class Doctor {
    //5.2 Aqui vamos a ir agregando los tributos de la clase Doctor
    int id;
    String name;
    String speciality;
    //5.3 Agregamos los comportamientos

    //6.0 Recreamos el metodo constructor
    Doctor(String name){
        /*6.1.1 Aqui podemos ver como debemos declarar que la variable para que
        coloque el nuevo atributo de la manera adecuada*/
        this.name = name;
        System.out.println("El nombre del doctor es: " + this.name);
    }
    public void showName(){
        System.out.println(name);
    }
}
