package model;

public abstract class User {
    String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email){
        this.name = name;
        this.email = email;
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
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //21 Esta es la primera sobreescritura del metodo toString
    /*Aqui vamos a ver como sobreescribimos el metodo toString()
     * @Override demuestra que la clase no pertenece a esta clase
     * y el super.toString() que sale por default nos dice que
     * se esta modificando el metodo de la clase padre.
     */
    @Override
    public String toString() {
        return "model.User: " + name + ", Email: " + email + "\nAddress: " + address +
        ", Phone: " + phoneNumber;
    }
    
}
