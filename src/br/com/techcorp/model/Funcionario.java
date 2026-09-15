package br.com.techcorp.model;

public class Funcionario {
private String matricula;
private String nome;
private String cargo;
public String getMatricula() {
    return matricula;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
    Funcionario other = (Funcionario) obj;
    if (matricula == null) {
        if (other.matricula != null)
            return false;
    } else if (!matricula.equals(other.matricula))
        return false;
    return true;
}
public void setMatricula(String matricula) {
    this.matricula = matricula;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public Funcionario(String matricula, String nome, String cargo) {
    this.matricula = matricula;
    this.nome = nome;
    this.cargo = cargo;
}
public String getCargo() {
    return cargo;
}
public void setCargo(String cargo) {
    this.cargo = cargo;
}
@Override
public String toString() {
    return "Funcionario [matricula=" + matricula + ", nome=" + nome + ", cargo=" + cargo + "]";
}
}
