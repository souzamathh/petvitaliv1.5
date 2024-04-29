/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesDeCadastros;

import javax.swing.JOptionPane;

/**
 *
 * @author paje9
 */
public class CadClientes {
    
    //Nome, Email, Usuario, Senha, Numero;
    
   
    private String Nome;
    private String Email;
    private String Usuario;
    private String Senha;
    private int Numero;

    public CadClientes() {
    }
     
    public CadClientes(String Nome, String Email, String Usuario, String Senha, int Numero) {
       this.Nome = Nome;
       this.Email = Email;
       this.Usuario = Usuario;
       this.Senha = Senha;
       this.Numero = Numero;
     }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    
    public void IncluiCli(){
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
    }
    
}
