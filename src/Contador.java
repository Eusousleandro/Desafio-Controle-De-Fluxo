import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt();
        terminal.close();

        try{

            contar(parametroUm, parametroDois);

        } 
        catch(ParametrosInvalidosException e){
            System.out.println("\n O segundo parâmetro deve ser MAIOR do que o primeiro parâmetro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois) {
            System.out.println("\n O segundo parâmetro deve ser MAIOR do que o primeiro parâmetro");
    } else {
        System.out.println("########## IMPRIMINDO OS PARÂMETROS ##########");
    }


        int contagem = parametroDois - parametroUm;
        for( int i = 0; i <= contagem; i++){
            System.out.println("Imprimindo o número: " + i); 
        }
    }
}
