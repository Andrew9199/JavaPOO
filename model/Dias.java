package model;

public class Dias {
    public static enum Day {
        MONDAY("Lunes"),
        TUESDAY("Martes"),
        WEEDNESDAY("Miercoles"),
        THURSDAY("Jueves"),
        FRIDAY("Viernes"),
        SATURDAY("Sabado"),
        SUNDAY("Domingo");

        private String Spanish;
        private Day(String s) {
            Spanish = s;
        }
        public String getSpanish() {
            return Spanish;
        }
    }
    public static void main(String[] args) {

        System.out.println(Dias.Day.FRIDAY.getSpanish());

    }
}
