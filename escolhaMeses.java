import Enums.*;
import java.util.*;

public class escolhaMeses {
    public static Meses mesEscolha(Scanner scanner) {
        System.out.print("Mês:");
        int mesIndex = 1;
        for (Meses meses : Meses.values()) {
            System.out.print("\n" + mesIndex + ": " + meses);
            mesIndex++;
        }
        System.out.println("");
        int value = scanner.nextInt();
        switch (value) {
            case 1:
                return Meses.JAN;
            case 2:
                return Meses.FEV;
            case 3:
                return Meses.MAR;
            case 4:
                return Meses.ABR;
            case 5:
                return Meses.MAI;
            case 6:
                return Meses.JUN;
            case 7:
                return Meses.JUL;
            case 8:
                return Meses.AGO;
            case 9:
                return Meses.SET;
            case 10:
                return Meses.OUT;
            case 11:
                return Meses.NOV;
            case 12:
                return Meses.DEZ;
            default:
                System.out.println("Números de 1 a 12 apenas");
                System.exit(0);
        }
        return null;
    }
}