import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
            System.out.println("MENU DE OPÇÕES:    ");
            System.out.println("MENU DE OPÇÕES 222:    ");  
            
            int opcao;
            do{
                System.out.println("1. Opção 1          ");
                System.out.println("2. Opção 2          ");
                System.out.println("3. Sair             ");
                System.out.print("Digite a opção desejada:");
                
                Scanner scanner = new Scanner(System.in);
                opcao = scanner.nextInt();

                switch (opcao){
                    case 1:
                        System.out.println("Você escolheu a primeira opção");
                    break; 
                    case 2:
                        System.out.println("Você escolheu a segunda opção");
                    break;
                    default:
                    System.out.println("O programa foi encerrado");
                opcao = 0;
            }
        } while (opcao!= 0);  
        
    }

}