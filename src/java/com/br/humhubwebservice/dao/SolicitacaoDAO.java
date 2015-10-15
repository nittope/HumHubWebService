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
public interface SolicitacaoDAO {
    
    void save (Solicitacao solicitacao);
    
    List<Solicitacao> getAll();
    
    void init();
}
