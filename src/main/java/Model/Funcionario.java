/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author dell
 */
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author dell
 */
@Entity
@Table(name = "Funcionario")
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer ID;
    private String Nome;
    private String Endereco;
    private String Email;
    private String Telefone;
    @OneToOne(cascade = ({CascadeType.DETACH)})
    @JoinColumn(name= Id)
    private Integer CargoID;
    @OneToMany(targetEntity = Usuarios.class)
    private String login;
    private Date DataDeNascimento;
}

