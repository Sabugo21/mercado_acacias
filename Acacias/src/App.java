import com.controller.produtoController;

public class App {
    public static void main(String[] args) {
        System.out.println("A iniciar teste rápido do sistema...");

        produtoController controller = new produtoController();

        // Testar inserção direta de um produto de teste
        controller.cadastrarProduto("Arroz 5kg", 25.50, 10);

        System.out.println("Teste concluído!");
    }
}