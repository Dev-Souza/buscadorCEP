import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner cep = new Scanner(System.in);
        System.out.println("Digite seu CEP:");
        String cepDigitado = cep.nextLine();
        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = consultaCep.buscaEndereco(cepDigitado);
        System.out.println(novoEndereco);
    }
}