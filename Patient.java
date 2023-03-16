//Reto 11
public class Patient extends User{
    //20.0 Aqui retiramos los atributos redundantes la clase Doctor dejando el atributo que lo diferencia del paciente
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //12.0 Nota importante, los metodos constructores solo tienen un modificador de acceso, ni void ni nada
    public Patient(String name, String email){
        super(name, email);
    }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    //13 Aqui establecemos las reglas del negocio en las clases en donde no se pueden modificar por los usuarios
    public String getWeight(){
        return this.weight + "Kg.";
    }
     //13.0 El metodo setter en publico para que podamos utilizarlo de cierto lugar
    //13.1 Este metodo tiene regreso en void por el hecho de que no devuelve na' y setWeight es una convencion de nombre
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getBlood() {
        return blood;
    }
    public void setBlood(String blood) {
        this.blood = blood;
    }

    
}