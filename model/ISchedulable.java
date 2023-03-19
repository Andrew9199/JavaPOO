package model;

import java.util.Date;

public interface ISchedulable {
//20.1 Aqui agregamos el identificador de nuestra interfaz para poderla implementar en las clases
    void schedule(Date date, String time);

}
