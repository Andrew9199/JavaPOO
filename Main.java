public class Main {
    //5.0 Como en todo proyecto de java necesitamos un metodo name para que el proyecto pueda vivir
    public static void main(String[] args){
        //5.4 Aqui vemos un ejemplo sencillo de como se usan los atributos de una clase modularizada
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Sanchez";
        myDoctor.showName();
    }
}
