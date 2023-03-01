package a2802;

public class Departamento{
	private Empresa empresa;
	private String nomeDepartamento;
  
	public String getNomeDepartamento() {
		return nomeDepartamento;
	}
	public void setNomeDepartamento(String nomeDepartamento) {
		this.nomeDepartamento = nomeDepartamento;
	}
	@Override
	public String toString() {
		return "Departamento " + nomeDepartamento + "]";
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
} 