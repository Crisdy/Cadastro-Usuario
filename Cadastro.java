import java.util.Scanner;

public class Cadastro{
    public static void main(String[] args) {
        System.out.println("___Cadastro de Usuarios___");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome Completo:");
        String nome = scanner.nextLine();

        System.out.print("Idade:");
        String idade = scanner.nextLine();
        
        System.out.print("Estado civil:");
        String civil = scanner.nextLine();

        System.out.print("Telefone:");
        String telefone = scanner.nextLine();

        System.out.print("Endereço:");
        String endereco = scanner.nextLine();

        System.out.print("Bairro:");
        String bairro = scanner.nextLine();

        System.out.print("Cidade:");
        String cidade = scanner.nextLine();

        System.out.print("Cep:");
        String cep = scanner.nextLine();

        System.out.println("--- DADOS ---");
        System.out.println(nome + "," + idade + "," + civil + "," + telefone);
        System.out.println("Endereço:" + endereco + "," + bairro + "," + cidade);
        System.out.println("Cep:" + cep);
        




        


        
       
        


    }

}