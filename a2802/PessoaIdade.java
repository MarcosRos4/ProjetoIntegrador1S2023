package a2802;
import java.util.Calendar;

public class PessoaIdade{
private String nome;
private int nascimento;
private int idade = this.setIdade();
  
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getNascimento() {
	return nascimento;
}
public void setNascimento(int nascimento) {
	this.nascimento = nascimento;
}

private int setIdade(){
  return this.idade = Calendar.YEAR - this.getNascimento();
}

public int getIdade(){
  return this.idade;
}
@Override
	public String toString() {
		return "Nome " + this.nome + "\nIdade: "+this.idade;
	}
}