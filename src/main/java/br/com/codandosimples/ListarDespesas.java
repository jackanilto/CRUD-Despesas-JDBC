package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.util.List;

public class ListarDespesas {

    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();


          List<Despesa> despesas = dao.findByCategoria(Categoria.TRANSPORTE);
          for (Despesa despesa : despesas){
            System.out.println("ID: "+ despesa.getId());
            System.out.println("Descricao: "+ despesa.getDescricao());
            System.out.println("Categoria: " +despesa.getCategoria());
            System.out.println("Valor: "+ despesa.getValor());
        };

//        List<Despesa> despesas = dao.findAll();
//
//        for (Despesa despesa : despesas) {
//            System.out.println("ID: "+ despesa.getId());
//            System.out.println("Descricao: "+ despesa.getDescricao());
//            System.out.println("Valor: "+ despesa.getValor());
//            System.out.println("==============================================");
//        }

//       Optional<Despesa> despesaOptional = dao.findById(3L);
//       despesaOptional.ifPresent(despesa -> {
//           System.out.println("ID: "+ despesa.getId());
//           System.out.println("Descricao: "+ despesa.getDescricao());
//           System.out.println("Valor: "+ despesa.getValor());
//       });

        //ESTE BLOCO DE CODIGO, INSERE UMA NOVA DESPESA TESTE
 //       Despesa despesa = new Despesa();
 //       despesa.setDescricao("Saúde");
 //       despesa.setCategoria(Categoria.SAUDE);
 //       despesa.setValor(659.51);
 //       despesa.setData(LocalDate.of(2022, 8, 14));
 //       // Recuperando o ID da despesa inserida no BD
 //       Despesa despesaInserida = dao.save(despesa);
 //       System.out.println("A despesa foi inserida com ID: "+ despesaInserida.getId());

    }

}
