package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.model.Despesa;

import java.util.List;

public class FindAllDespesas {
    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();
        List<Despesa> despesas = dao.findAll();

        for (Despesa despesa : despesas) {
            System.out.println("ID: "+ despesa.getId());
            System.out.println("Descricao: "+ despesa.getDescricao());
            System.out.println("Valor: "+ despesa.getValor());
            System.out.println("==============================================");
        }
    }
}
