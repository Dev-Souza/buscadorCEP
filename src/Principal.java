import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner cep = new Scanner(System.in);
        System.out.println("Digite seu CEP:");

        String cepDigitado = cep.nextLine();
        ConsultaCep consultaCep = new ConsultaCep();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cepDigitado);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }
}