package guia_7_extras6;


public class Rectangulo {
    
private int lado1;
private int lado2;

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int calcularArea(){
        return lado1 * lado2;
         //System.out.println("El área del rectángulo es: "+area);
    
    }

}
