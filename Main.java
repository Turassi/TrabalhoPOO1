import java.io.*;
import java.util.*;
import Actions.Ganhow;
import Enums.Meses;
import Actions.*;

public class Main {
    public static void main(String[] args) {
        boolean Menu = true;
        int escolha = 0;
        Scanner scanner = new Scanner(System.in);

        Ganhos[] ganhos = new Ganhos[64];
        int ganhoIndex = 0;

        Gastos[] gastos = new Gastos[64];
        int gastosIndex = 0;

        System.out.println("Qual foi o tipo do seu gasto?:");
        while (Menu) {
            System.out.println("1: Ganhos");
            System.out.println("2: Gastos");
            System.out.println("3: Relatorio");
            try {
                escolha = scanner.nextInt();
                if (escolha < 1 || escolha > 3) {
                    System.out.println("Escolha entre os números de 1 a 3");
                }
            } catch (Exception ex) {
                System.out.println("Escolha entre os números de 1 a 3");
                Menu = false;
            }
            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome de seu ganho:");
                    String nome = scanner.next();
                    System.out.print("Digite o valor de seu ganho:");
                    double value = scanner.nextDouble();
                    Meses mescolha = escolhaMeses.mesEscolha(scanner);
                    Ganhos newGanhos = new Ganhos(nome, value, mescolha);
                    ganhos[ganhoIndex] = newGanhos;
                    ganhosIndex++;
                    break;
                case 2:
                    System.out.print("Digite o nome de seu gasto");
                    String nomeGastos = scanner.next();
                    System.out.print("Digite o nome de seu gasto:");
                    double valueGastos = scanner.nextDouble();
                    Meses mescolhaGastos = escolhaMeses.mesEscolha(scanner);
                    Gastos newgastos = new Gastos(nomeGastos, valueGastos, mescolhaGastos);
                    gastos[gastosIndex] = newgastos;
                    gastosIndex++;
                    break;
                case 3:
                    System.out.print("De qual mês você deseja o relatório?");
                    Meses mescolhaRelatorio = escolhaMeses.mesEscolha(scanner);

                    System.out.println("Relatório de Gasto: \n");
                    for (int i = 0; i < gastos.length; i++) {
                      if (gastos[i] != null)
                        if (gastos[i].Mes != null)
                            if (gastos[i].Mes == mescolhaRelatorio)
                                System.out.println("Gasto: " + gastos[i].NomeGastos + "\n" + "Valor: " + gastos[i].ValorGastos);
                    }
                    System.out.println("=================================");
                    System.out.println("Relatório de Ganhos:");
                    for (int j = 0; j < ganhos.length; j++) {
                      if (ganhos[j] != null)
                        if (ganhos[j].Mes != null)
                            if (ganhos[j].Mes == mescolhaRelatorio)
                                System.out.print("Ganho: " + ganhos[j].NomeGanhos + "\n" + "Valor: " + ganhos[j].ValorGanhos);
                    }
                    double ganhosbruto = ganhosEPerdaCalculo.SomaDeGanhosMes(gastos, mescolhaRelatorio) - ganhosEPerdaCalculo.SomaDeGastosMes(ganhos, mescolhaRelatorio);
                    System.out.println("=================================");
                    System.out.println("Ganho Bruto do Mês: $" + ganhosbruto);
                    Menu = false;
                    break;
                default:
                    break;
            }
        }
    }
}