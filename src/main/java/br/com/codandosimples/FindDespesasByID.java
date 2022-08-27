package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.model.Despesa;

import java.util.Optional;

public class FindDespesasByID {
    public static void main(String[] args) {

           DespesaDAO dao = new DespesaDAO();
           Optional<Despesa> despesaOptional = dao.findById(3L);
           despesaOptional.ifPresent(despesa -> {
           System.out.println("ID: "+ despesa.getId());
           System.out.println("Descricao: "+ despesa.getDescricao());
           System.out.println("Valor: "+ despesa.getValor());
       });

    }
}
