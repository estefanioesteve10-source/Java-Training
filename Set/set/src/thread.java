public class thread {
    public static void main(String[] args) {

        // Thread 1: Geração do PDF
        Thread threadGeracao = new Thread(() -> {
            try {
                System.out.println("[Gerador] Iniciando geração do PDF...");
                // Simula o tempo de espera de 5 segundos
                Thread.sleep(5000);
                System.out.println("[Gerador] PDF gerado com sucesso após 5 segundos!");
            } catch (InterruptedException e) {
                System.err.println("A geração foi interrompida.");
            }
        });

        // Thread 2: Impressão do PDF
        Thread threadImpressao = new Thread(() -> {
            try {
                System.out.println("[Impressora] Aguardando o PDF ficar pronto...");

                // A mágica acontece aqui: a thread de impressão espera a de geração terminar
                threadGeracao.join();

                System.out.println("[Impressora] Recebido! Enviando para a fila de impressão...");
                Thread.sleep(2000); // Simula o tempo de impressão
                System.out.println("[Impressora] PDF impresso com sucesso!");

            } catch (InterruptedException e) {
                System.err.println("A impressão foi interrompida.");
            }
        });

        // Iniciamos as duas
        threadGeracao.start();
        threadImpressao.start();
    }
}