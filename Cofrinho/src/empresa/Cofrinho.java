package empresa;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> listaMoedas;

    public Cofrinho() {
        listaMoedas = new ArrayList<>();
    }

    // Adiciona uma moeda na lista
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

    public void remover(Moeda moeda) {
        if (listaMoedas.remove(moeda)) {
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Moeda não encontrada no cofrinho.");
        }
    }

    // Lista todas as moedas que tem
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("Cofrinho vazio!");
        } else {
            for (Moeda m : listaMoedas) {
                m.info();
            }
        }
    }

    // Calcula o total convertido para Real
    public double totalConvertido() {
        double total = 0;
        for (Moeda m : listaMoedas) {
            total += m.converter();
        }
        return total;
    }
}