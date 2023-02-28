package a2802;

public class Pessoa {
  private String nome;
  private String telefone;
  private int sexo;
  public static int masculino = 1;
  public static int feminino = 2;
  public static int naobinario = 3;

  public void setSexo(int s) {
    this.sexo = s;
  }

  public int getSexo() {
    return this.sexo;
  }

}