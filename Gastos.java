package Actions;

import Enums.*;

public class Gastos {
    public String NomeGastos;
    public double ValorGastos;
    public Meses Mes;

    public Gastos() {
    }

    public Gastos(String NomeGastos, double ValorGastos, Meses Mes) {
        this.ValorGastos = ValorGastos;
        this.NomeGastos = NomeGastos;
        this.Mes = Mes;
    }
}