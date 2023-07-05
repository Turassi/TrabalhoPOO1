import Actions.Gastos;
import Actions.Ganhos;
import Enums.*;

public class ganhosEPerdaCalculo {
    public static double SomaDeGanhosMes(Gastos[] gastos, Meses Mes)
    {
        double result = 0;
        for(int i = 0; i < gasto.length; i++)
        {
            if (gastos[i] != null)
              if (gastos[i].Mes != null)
                if (gastos[i].Mes == Mes)
                {
                    result += gastos[i].ValorGastos;
                }
        }
        return result;
    }    

    public static double SomaDeGastosMes(Ganhos[] ganhos, Meses Mes)
    {
        double result = 0;
        for(int i = 0; i < ganho.length; i++)
        {
            if (ganhos[i] != null)
              if (ganhos[i].Mes != null)
                if (ganhos[i].Mes == Mes)
                {
                    result += ganhos[i].ValorGanhos;
                }
        }
        return result;
    }    
}