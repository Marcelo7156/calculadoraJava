public class Calculadora{
    private double somar, subtrair, multiplicar, dividir;

    public Calculadora(double somar, double subtrair, double multiplicar, double dividir ){
        this.somar = somar;
        this.subtrair = subtrair;
        this.multiplicar = multiplicar;
        this.dividir = dividir;
    }

    public void somar(double a, double b){
        this.somar = a + b;
        this.somar = somar;
        
    }

    public void subtrair(double a, double b){
        this.subtrair = a - b;
        this.subtrair = subtrair;
    }

    public void multiplicar(double a, double b){
        this.multiplicar = a * b;
        this.multiplicar = multiplicar;
    }

    public void dividir(double a, double b){
        this.dividir = a/b;
        this.dividir = dividir;
    }

    public void setSomar(double somar){
        this.somar = somar;
    }

    public void setSubtrair(double subtrair){
        this.subtrair = subtrair;
    }

    public void setMultiplicar(double multiplicar){
        this.multiplicar = multiplicar;
    }

    public void setDividir(double dividir){
        this.dividir = dividir;
    }

    public double getSomar(){
        return somar;
    }

    public double getSubtrair(){
        return subtrair;
    }

    public double getMultiplicar(){
        return multiplicar;
    }

    public double getDividir(){
        return dividir;
    }
} 
