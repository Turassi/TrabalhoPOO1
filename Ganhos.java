package Actions;

import Enums.*;

public class Ganhos {

    public String NomeGanhos;
    public double ValorGanhos;
    public Meses Mes;

    public Ganhos() {
    }

    public Ganhos(String NomeGanhos, double ValorGanhos, Meses Mes) {
        this.ValorGanhos = ValorGanhos;
        this.NomeGanhos = NomeGanhos;
        this.Mes = Mes;
    }
}