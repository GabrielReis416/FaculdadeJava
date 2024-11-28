import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Jogador {
    String nome;
    int fichas;
    int pontuacao;

    public Jogador(String nome) {
        this.nome = nome;
        this.fichas = 50; 
        this.pontuacao = 0;
    }
}

public class Palpitao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        System.out.print("Digite o nome do jogador 1: ");
        String nomeJogador1 = scanner.nextLine();
        Jogador jogador1 = new Jogador(nomeJogador1);

        System.out.print("Digite o nome do jogador 2: ");
        String nomeJogador2 = scanner.nextLine();
        Jogador jogador2 = new Jogador(nomeJogador2);

        
        String[] times = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o nome do time " + (i + 1) + ": ");
            times[i] = scanner.nextLine();
        }

        
        List<String[]> partidas = new ArrayList<>();
        for (int i = 0; i < times.length; i++) {
            for (int p = i + 1; p < times.length; p++) {
                partidas.add(new String[]{times[i], times[p]});
            }
        }

        
        int[][] resultados = new int[partidas.size()][2]; 
        for (int i = 0; i < partidas.size(); i++) {
            resultados[i][0] = random.nextInt(5); 
            resultados[i][1] = random.nextInt(5); 
        }

        
        Jogador[] jogadores = {jogador1, jogador2};
        for (Jogador jogador : jogadores) {
            while (jogador.fichas > 0) {
                System.out.println("\n" + jogador.nome + ", você tem " + jogador.fichas + " fichas.");
                System.out.println("Deseja fazer um palpite? (1 para Sim, 0 para Não)");
                int continuar = scanner.nextInt();
                if (continuar == 0) break;

                System.out.println("Escolha uma partida para apostar:");
                for (int i = 0; i < partidas.size(); i++) {
                    System.out.println((i + 1) + ": " + partidas.get(i)[0] + " x " + partidas.get(i)[1]);
                }

                System.out.print("Digite o número da partida: ");
                int partidaEscolhida = scanner.nextInt() - 1;

                if (partidaEscolhida < 0 || partidaEscolhida >= partidas.size()) {
                    System.out.println("Partida inválida!");
                    continue;
                }

                System.out.println("Partida selecionada: " + partidas.get(partidaEscolhida)[0] + " x " + partidas.get(partidaEscolhida)[1]);
                System.out.print("Escolha o time vencedor (1 para " + partidas.get(partidaEscolhida)[0] + ", 2 para " + partidas.get(partidaEscolhida)[1] + "): ");
                int timeEscolhido = scanner.nextInt();

                System.out.print("Quantas fichas deseja apostar? ");
                int fichasApostadas = scanner.nextInt();

                if (fichasApostadas > jogador.fichas) {
                    System.out.println("Você não tem fichas suficientes!");
                    continue;
                }

               
                int saldoGols = resultados[partidaEscolhida][0] - resultados[partidaEscolhida][1];
                boolean acertou = (timeEscolhido == 1 && saldoGols > 0) || (timeEscolhido == 2 && saldoGols < 0);

                jogador.fichas -= fichasApostadas;
                if (acertou) {
                    int ganho = Math.abs(saldoGols) * fichasApostadas;
                    jogador.pontuacao += ganho;
                    System.out.println("Parabéns! Você acertou e ganhou " + ganho + " pontos.");
                } else {
                    System.out.println("Palpite errado! Você perdeu as fichas apostadas.");
                }
            }
        }

        
        Jogador vencedor = jogador1.pontuacao > jogador2.pontuacao ? jogador1 : jogador2;
        System.out.println("\nResultados finais:");

        
        System.out.println("Pontuação total: " + jogador1.pontuacao);

       
        System.out.println("Pontuação total: " + jogador2.pontuacao);

        System.out.println("O vencedor é " + vencedor.nome + " com " + vencedor.pontuacao + " pontos!");

        
        System.out.println("Resultados das partidas:");
        for (int i = 0; i < partidas.size(); i++) {
            System.out.println(partidas.get(i)[0] + " " + resultados[i][0] + " x " + resultados[i][1] + " " + partidas.get(i)[1]);
        }
        
        scanner.close();
    }
}