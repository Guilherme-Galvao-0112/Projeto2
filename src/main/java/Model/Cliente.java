
package Model;

<<<<<<< HEAD
import Padrao.PadraoListar;
=======
import java.io.Serializable;
>>>>>>> 816e5be5b80bc8e56c09dd793c1eeb5b67504e67
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
<<<<<<< HEAD
public class Cliente implements PadraoListar{

    public Cliente() {
    }
=======
public class Cliente implements Serializable{
>>>>>>> 816e5be5b80bc8e56c09dd793c1eeb5b67504e67
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer Id;
    private String Name;
    private String Endereco;
    private String Email;
    private String Telefone;
    private String CPF;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    @Override
    public String[] getTitulo(){
        return new String[]{"ID","Nome","Endereço","Email","Telefone","CPF"};
    }
    @Override
    public Object[] getDados(){
        return new Object[]{getId(),getName(),getEndereco(),getEmail(),getTelefone(),getCPF()};
    }
    public void AtualizaCliente(){
        
    }
    
}
