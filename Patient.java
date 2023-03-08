//Reto 11
public class Patient{
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //12.0 Nota importante, los metodos constructores solo tienen un modificador de acceso, ni void ni nada
    public Patient(String name, String email){
        this.name = name;
        this.email = email;
        this.weight = 54.5;
        System.out.println(weight + "Kg.");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
     //13 Aqui vemos como se asignaria una validacion de datos para el setter y solo se acepte el atributo si cumple con la validación
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El numero telefonico debe tener maximo 8 digitos");
        } else if (phoneNumber.length() < 8) {
            System.out.println("El numero telefonico debe tener minimo 8 digitos");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    //Aqui establecemos las reglas del negocio en las clases en donde no se pueden modificar por los usuarios
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