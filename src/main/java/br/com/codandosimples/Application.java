package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;
import br.com.codandosimples.model.Categoria;
import br.com.codandosimples.model.Despesa;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();

        Despesa despesa = new Despesa();
        despesa.setDescricao("Pagamento do Aluguel");
        despesa.setCategoria(Categoria.MORADIA);
        despesa.setValor(1200);
        despesa.setData(LocalDate.of(2022, 8, 19));

        dao.save(despesa);

    }
// parei no minuto 15:50
    //https://youtu.be/CErX0MgvJ38?list=PL1lueKDtZ3Dcxc7kNKXr2BnXgSkccP0FG&t=957

}
