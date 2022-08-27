package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.time.LocalDate;

public class InsereNovaDespesa {
    public static void main(String[] args) {
       // ESTE BLOCO DE CODIGO, INSERE UMA NOVA DESPESA TESTE
               Despesa despesa = new Despesa();
               despesa.setDescricao("Saúde");
               despesa.setCategoria(Categoria.SAUDE);
               despesa.setValor(659.51);
               despesa.setData(LocalDate.of(2022, 8, 14));
               // Recuperando o ID da despesa inserida no BD
        DespesaDAO dao = new DespesaDAO();
        Despesa despesaInserida = dao.save(despesa);
               System.out.println("A despesa foi inserida com ID: "+ despesaInserida.getId());

    }
}
