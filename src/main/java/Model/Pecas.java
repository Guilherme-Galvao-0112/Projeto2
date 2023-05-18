
package Model;

import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pecas")
public class Pecas {
    @Id
    @GeneratedValue
    private Integer ID;
    private String Referencia;
    private String Descricao;
    private String Marca;
    private String Aplicacao;
    private Double ValorCompra;
    private Double ValorVenda;
    private Integer Quantidade;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getAplicacao() {
        return Aplicacao;
    }

    public void setAplicacao(String Aplicacao) {
        this.Aplicacao = Aplicacao;
    }

    public Double getValorCompra() {
        return ValorCompra;
    }

    public void setValorCompra(Double ValorCompra) {
        this.ValorCompra = ValorCompra;
    }

    public Double getValorVenda() {
        return ValorVenda;
    }

    public void setValorVenda(Double ValorVenda) {
        this.ValorVenda = ValorVenda;
    }

    public Integer getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(Integer Quantidade) {
        this.Quantidade = Quantidade;
    }
    
}
