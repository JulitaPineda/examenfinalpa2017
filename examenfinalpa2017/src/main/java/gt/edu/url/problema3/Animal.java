package gt.edu.url.problema3;

public class Animal {
    String Peso;
    int N;
    String Tipo;
    String Color;
    public Animal(String tipo, int n, String peso, String color){
        Tipo = tipo;
        Peso = peso;
        N = n;
        Color = color;
    }
    
    public void setSkinColor(String color){
        Color = color;
    }
    
    public String getSkinColor(){
        return Color;
    }
    
    public void setType(String tipo){
        Tipo = tipo;
    }
    
    public String getType(){
        return Tipo;
    }
    
    public void setPeso(String peso){
        Peso = peso;
    }
    
    public String getPeso(){
        return Peso;
    }
}
