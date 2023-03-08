//Reto 11
public class Patient{
    private String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    private double weight;
    private double height;
    String blood;

    //12.0 Nota importante, los metodos constructores solo tienen un modificador de acceso, ni void ni nada
    public Patient(String name, String email){
        this.name = name;
        this.email = email;
        this.weight = 54.5;
        System.out.println(weight + "Kg.");
    }


}