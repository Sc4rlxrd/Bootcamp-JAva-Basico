package desafios_basico;
import java.util.Scanner; 
public class DesafioLeituraDaGertrudes {
// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:  
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next"; 
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.   
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        System.out.println(paginas/paginasLidas + " dias");
        
        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros

    }

}
