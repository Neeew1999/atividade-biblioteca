public class Main {
    public static void main(String[] args) {
        // Criando uma instância da biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros à biblioteca
        System.out.println("\n=== ADICIONANDO LIVROS ===");
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 59.90));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell", 1949, 39.90));
        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis", 1899, 29.50));

        // Demonstrando getters e setters
        System.out.println("\n=== GETTERS E SETTERS ===");
        Livro livro = biblioteca.buscarLivroPorTitulo("1984");
        if (livro != null) {
            System.out.println("Preço original: R$ " + livro.getPreco());
            livro.setPreco(35.00);
            System.out.println("Novo preço: R$ " + livro.getPreco());
        }

        // Empréstimo e devolução
        System.out.println("\n=== EMPRÉSTIMO E DEVOLUÇÃO ===");
        livro = biblioteca.buscarLivroPorTitulo("Dom Casmurro");
        if (livro != null) {
            livro.emprestar();
            livro.emprestar(); // Tentar emprestar novamente (deve falhar)
            livro.devolver();
        }

        // Calculando idade do livro
        System.out.println("\n=== IDADE DO LIVRO ===");
        livro = biblioteca.buscarLivroPorTitulo("O Senhor dos Anéis");
        if (livro != null) {
            int anoAtual = 2023;
            System.out.println("Idade do livro: " + livro.obterIdade(anoAtual) + " anos");
        }

        // Aplicando desconto
        System.out.println("\n=== APLICANDO DESCONTO ===");
        livro = biblioteca.buscarLivroPorTitulo("O Senhor dos Anéis");
        if (livro != null) {
            livro.aplicarDesconto(10); // 10% de desconto
        }

        // Listando livros disponíveis
        System.out.println("\n=== LISTAGEM DE LIVROS ===");
        biblioteca.listarLivrosDisponiveis();

        // Calculando valor total
        System.out.println("\n=== VALOR TOTAL DA BIBLIOTECA ===");
        System.out.println("Valor total: R$ " + biblioteca.calcularValorTotal());
    }
}