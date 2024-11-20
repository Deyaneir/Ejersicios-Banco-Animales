package Animales;

public class Animal {
    private String nombre;
    private int edad;
    public Animal(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void hacerSonido(){
        System.out.println("Sonido generico de un animal");
    }
}
class Perro extends Animal{
    public Perro(String nombre, int edad){
        super(nombre, edad);
    }
    @Override
    public void hacerSonido(){
        System.out.println("Su nombre es: "+ getNombre() +" Su edad es: "+ getEdad());
        System.out.println("El perro ladra: GUAU, GUAU!!");
    }
}
class Gato extends Animal{
    public Gato(String nombre, int edad){
        super(nombre, edad);
    }
    @Override
    public void hacerSonido(){
        System.out.println("Su nombre es: "+ getNombre() +" Su edad es: "+ getEdad());
        System.out.println("El gato maulla: Miau,Miau!!");
    }
}
