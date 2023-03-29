package model;

public class Nurse extends User{

    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void ShowUserData() {
        System.out.println("Enefermera\nLa enfermera es de la especialidad de: " + getSpeciality() + "\nY su nombre es: " + getName());
    }

}
