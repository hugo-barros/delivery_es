/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package delivery;
/**
 *
 * @author Jorge
 */
public class Cliente {
    public String Nome;
    public String Telefone;
    public String Endereco;
    
    public Cliente(){}
    
    public Cliente(String Nome, String Telefone, String Endereco){
        this.Nome = Nome;
        this.Telefone = Telefone;
        this.Endereco = Endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nome=" + Nome + ", Telefone=" + Telefone + ", Endereco=" + Endereco + '}';
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }  
    
}
