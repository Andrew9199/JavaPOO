package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    
    
    
    String speciality;
    
    
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    
    public Doctor(String name, String email){
        super(name, email);
    }
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID doctor: id removido para que a futuro viva en una base de datos" );
    }
    public void addAvailableAppointment(String date, String time){
        
        availableAppointments.add(new AvailableAppointment(date, time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public void ShowUserData() {
        System.out.println("Doctor\nEl nombre del doctor es: " + getName() + "\nSu especialidad es: " + getSpeciality());
    }

    
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time){
            
            
            try {
                this.date = format.parse(date);
            }
            
            catch (ParseException e) {
                throw new RuntimeException(e);
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        
    }
}
