/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "Caixa")
public class Caixa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer ID;
    private Float Entrada;
    private Float Saida;
    private Float ValorTotalCaixa;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Float getEntrada() {
        return Entrada;
    }

    public void setEntrada(Float Entrada) {
        this.Entrada = Entrada;
    }

    public Float getSaida() {
        return Saida;
    }

    public void setSaida(Float Saida) {
        this.Saida = Saida;
    }

    public Float getValorTotalCaixa() {
        return ValorTotalCaixa;
    }

    public void setValorTotalCaixa(Float ValorTotalCaixa) {
        this.ValorTotalCaixa = ValorTotalCaixa;
    }
}
