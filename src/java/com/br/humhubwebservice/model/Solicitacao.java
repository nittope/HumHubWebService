/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.humhubwebservice.model;

import java.util.Objects;

/**
 *
 * @author Marcus Vinicius
 */
public final class Solicitacao {
    private Integer id;
    private String nome_sol;
    private String cpf;
    private String item_sol;
    private Integer status_sol;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_sol() {
        return nome_sol;
    }

    public void setNome_sol(String nome_sol) {
        this.nome_sol = nome_sol;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getItem_sol() {
        return item_sol;
    }

    public void setItem_sol(String item_sol) {
        this.item_sol = item_sol;
    }

    public Integer getStatus_sol() {
        return status_sol;
    }

    public void setStatus_sol(Integer status_sol) {
        this.status_sol = status_sol;
    }

    @Override
    public String toString() {
        return "Solicitacao{" + "id=" + id + ", nome_sol=" + nome_sol + ", cpf=" + cpf + ", item_sol=" + item_sol + ", status_sol=" + status_sol + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        hash = 41 * hash + Objects.hashCode(this.nome_sol);
        hash = 41 * hash + Objects.hashCode(this.cpf);
        hash = 41 * hash + Objects.hashCode(this.item_sol);
        hash = 41 * hash + Objects.hashCode(this.status_sol);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Solicitacao other = (Solicitacao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nome_sol, other.nome_sol)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.item_sol, other.item_sol)) {
            return false;
        }
        if (!Objects.equals(this.status_sol, other.status_sol)) {
            return false;
        }
        return true;
    }
    
    
}
