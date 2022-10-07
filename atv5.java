import java.util.Scanner;

public class atv5 {

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        //Variaveis
        double metros;
        double centimetros;

        //Entrada de dados
        System.out.print("insira o número de metros ");
        metros = teclado.nextDouble();
        teclado.close();
        //Processamento de dados

        centimetros = (metros*100);

        //Saida de dados

        System.out.print(metros+" metros são "+centimetros+" centimetros");


 
        

}
}