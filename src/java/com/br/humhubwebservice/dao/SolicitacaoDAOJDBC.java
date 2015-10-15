/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.humhubwebservice.dao;

import com.br.humhubwebservice.model.Solicitacao;
import java.util.List;

/**
 *
 * @author Marcus Vinicius
 */
public class SolicitacaoDAOJDBC implements SolicitacaoDAO{
    private static final String INSERT_SOLICITACAO = "INSERT INTO solicitation(nome, cpf, item, status_sol) VALUES (?,?,?,?)";

    @Override
    public void save(Solicitacao solicitacao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Solicitacao> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
