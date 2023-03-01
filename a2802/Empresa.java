package a2802;
import java.util.Arrays;

public class Empresa{
  
	private Departamento[] departamentos;
  
	private String nome;
  
	public Departamento[] getDepartamentos() {
		return departamentos;
	}
	public void setDepartamentos(Departamento[] departamentos) {
		this.departamentos = departamentos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Empresa " + nome + 
				"\nDepartamentos=" + Arrays.toString(departamentos);
	}
} 
