
package Entidad;


public class Electrodomestico {

    //Atributos
    protected double precio;
    protected String color;
    protected char consumo_energetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumo_energetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(char consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarColor(String color) {

        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado = false;

        for (int i = 0; i < colores.length && !encontrado; i++) {

            if (colores[i].equalsIgnoreCase(color)) {
                encontrado = true;
            }

        }

        if (encontrado) {
            this.color = color;

        } else {
            this.color = "Blanco";
        }

    }

    public void ComprobarConsumoEnergetico(char letra) {
        char letra1 = 'F';

        if (String.valueOf(letra).equalsIgnoreCase("A") || String.valueOf(letra).equalsIgnoreCase("B")
                || String.valueOf(letra).equalsIgnoreCase("C") || String.valueOf(letra).equalsIgnoreCase("D")
                || String.valueOf(letra).equalsIgnoreCase("E")) {
            
         

            this.consumo_energetico = letra;

        }else{
            this.consumo_energetico='F';
        } 
            
        
      
    }

    public void precioFinal() {
        double precioPar = 0;
        
        //11 opcion para pasar char a mayuscula
        char pasarMayus = Character.toUpperCase(consumo_energetico);
        
        
        switch (pasarMayus) {
            case 'A':
           // case 'a':                  2 opcion para comparar mayus y minuscula
                precioPar += 1000;
                break;
            case 'B':
                precioPar += 800;
                break;
            case 'C':
                precioPar += 600;
                break;
            case 'D':
                precioPar += 500;
                break;
            case 'E':
                precioPar += 300;
                break;
            case 'F':
                precioPar += 100;
                break;

        }

        if(peso>=0 && peso<19){
            precioPar+=100;
            
        }else if(peso>=20 && peso<49){
            precioPar+=500;
            
        }else if(peso>=50 && peso<79){
            precioPar+=800;
            
        }else if(peso>80){
            precioPar+=800;
            
        }
        
        this.precio+=precioPar;
        
        
    
        
    }

    @Override
    public String toString() {
        return "\n Color: " + color + ", Consumo Energetico: " + consumo_energetico + ", Peso: " + peso +"\n***Precio Final" + precio+"***" ;
    }

    
    
    
    
    
}
