/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.humhubwebservice.factory;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Marcus Vinicius
 */
public class ConnectionFactory {
    
    private static final String STR_DRIVER = "com.mysql.jdbc.Driver";
    //private static final String DATABASE = "humhub";
    private static final String STR_CON = "jdbc:mysql://localhost:3306/humhub";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public Connection criarConexao(){
        
        Connection conexao = null;
        
        try {
            
            Class.forName(STR_DRIVER);
            conexao = DriverManager.getConnection(STR_CON, USER, PASSWORD);
            
        
        } catch (Exception e) {
            System.out.println("Erro ao criar conexao com o banco de dados " + STR_CON);
            e.printStackTrace();
        }
        return conexao;
    }
    
    public void fecharConexao(Connection conexao, PreparedStatement pstmt, ResultSet rs){
        try {
            
            if(conexao != null){
                conexao.close();
            }
            if(pstmt != null){
                pstmt.close();               
            }
            if(rs != null){
                rs.close();
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao fechar conexao com o banco de dados " + STR_CON);
        }
    }
}
