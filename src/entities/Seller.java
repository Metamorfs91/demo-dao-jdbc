package entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {
    private Integer id;
    private String nome;
    private String email;
    private Date dataAniversario;
    private Double baseSalary;

    private Department departament;

    public Seller() {

    }

    public Seller(Integer id, String nome, String email, Date dataAniversario, Double baseSalary,
            Department departament) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataAniversario = dataAniversario;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public Double getbBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSaray) {
        this.baseSalary = baseSaray;
    }

    public Department getDepartament() {
        return departament;
    }

    public void setDepartament(Department departament) {
        this.departament = departament;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Seller other = (Seller) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Seller [id=" + id + ", nome=" + nome + ", email=" + email + ", dataAniversario=" + dataAniversario
                + ", salarioBase=" + baseSalary + ", departament=" + departament + "]";
    }

}
