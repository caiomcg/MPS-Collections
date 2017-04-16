/**
 * Created by caiomcg on 16/04/17.
 */
public class Data implements Comparable<Data> {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.format("%02d", dia) + "/" +
                String.format("%02d", mes) + "/" +
                String.format("%02d", ano);
    }

    @Override
    public int compareTo(Data o) {
        if (this.ano < o.getAno())
            return -1;
        else if (this.ano == o.getAno())
            if (this.mes < o.getMes())
                return -1;
            else if (this.mes == o.getMes())
                if (this.dia < o.getDia())
                    return -1;
                else if (this.dia == o.getDia())
                    return 0;

        return 1;

    }
}
