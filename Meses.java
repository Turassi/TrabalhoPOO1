package Enums;

public enum Meses {
    JAN("Janeiro"),
    FEV("Fevereiro"),
    MAR("Março"),
    ABR("Abril"),
    MAI("Maio"),
    JUN("Junho"),
    JUL("Julho"),
    AGO("Agosto"),
    SET("Setembro"),
    OUT("Outubro"),
    NOV("Novembro"),
    DEZ("Dezembro");

    private final String Mes;

    Meses(String Mes) {
        this.Mes = Mes;
    }

    public String getMes() {
        return Mes;
    }
}