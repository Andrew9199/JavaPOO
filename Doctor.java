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
}
