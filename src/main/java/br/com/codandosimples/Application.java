package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();

        Despesa despesa = new Despesa();
        despesa.setDescricao("Saúde");
        despesa.setCategoria(Categoria.SAUDE);
        despesa.setValor(659.51);
        despesa.setData(LocalDate.of(2022, 8, 14));
        // Recuperando o ID da despesa inserida no BD
        Despesa despesaInserida = dao.save(despesa);
        System.out.println("A despesa foi inserida com ID: "+ despesaInserida.getId());

    }

}
