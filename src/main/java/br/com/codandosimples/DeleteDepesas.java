package br.com.codandosimples;

import br.com.codandosimples.dao.DespesaDAO;

public class DeleteDepesas {
    public static void main(String[] args) {
        DespesaDAO dao = new DespesaDAO();
        dao.delete(3L);
    }
}
