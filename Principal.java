import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calculadora calculadora = new Calculadora(0, 0, 0, 0);
        int opc;
        double num1, num2;
        System.out.println("Digite dois numeros: ");
        num1 = ler.nextDouble();
        System.out.println("Segundo numero: ");
        num2 = ler.nextDouble();

        System.out.println("Agora escolha: \n1 Somar. \n 2 Subtrair. \n 3 Multiplicar. \n 4 Dividir.");
        opc = ler.nextInt();

        switch(opc){
            case 1:
                calculadora.somar(num1, num2);
                System.out.println(num1 +" + "+ num2 + " = " +calculadora.getSomar());
                break;
            case 2:
                calculadora.subtrair(num1, num2);
                System.out.println(num1 +" - "+ num2 + " = " +calculadora.getSubtrair());
                break;
            case 3:
                calculadora.multiplicar(num1, num2);
                System.out.println(num1 +" x "+ num2 + " = " +calculadora.getMultiplicar());
                break;
            case 4:
                if(num2 != 0){
                    calculadora.dividir(num1, num2);
                    System.out.println(num1 +" / "+ num2 + " = " +calculadora.getDividir());
                }else{
                    System.out.println("Divisão por zero não existe!");
                }

            default:
                System.out.println("Opção invalida! ");
                break;
        }
        
    }
}
