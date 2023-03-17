package model;

public class Dias {
//18 Estes el codigo de la clase 18 que me llevo loco por un par de dias, haber...
/*18.1 Aqui vemos como declaramos una serie de constantes que estan bajo al
denominacion "Day" y el tipo enum que es como una coleccion de constantes*/
    public static enum Day {
        MONDAY("Lunes"),
        TUESDAY("Martes"),
        WEEDNESDAY("Miercoles"),
        THURSDAY("Jueves"),
        FRIDAY("Viernes"),
        SATURDAY("Sabado"),
        SUNDAY("Domingo");
//18.2 Aqui declaramos la variable Spanish que nos servira mas tarde en el contructor de la clase enum Day
        private String Spanish;

/*18.3 Aqui creamos el metodo contructor para el metodo Day el cual no habilita para justificar el que el 
metodo tenga mas variables detro de si mismo, la "s" que seria una entrada en String se le cataloga como 
el atributo "Spanish" en el constructor y con eso en la lista de variables se le reconoce de esta manera "s"*/
        private Day(String s) {
            Spanish = s;
        }
/*Esta seccion es la mas normalita ya que creamso un getter para poder acceder al atributo "s", siendo el flujo
 * Cuando se solicita el atributo Spanish se ve a que es equivalente que en este caso seria igual a "s" la cual 
 * tiene como desigancion el atributo que tenemos arriba como las traducciones de los dias de las semana
*/
        public String getSpanish() {
            return Spanish;
        }
    }

/*Una mencion a que el ChatGPT es el que me ayudo a ver un error ya que en una parte del codigo
 * estaba declarando el metodo constructor como una variable lo cual me trajo un dolor de cabeza por un dia entero
 * pero ahora ya lo entiendo
 */

    public static void main(String[] args) {

        System.out.println(Dias.Day.FRIDAY.getSpanish());

    }
}
