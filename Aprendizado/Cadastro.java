package Aprendizado;

public class Cadastro {
    private String nome;
    private String email;
    private String senha;
    private int idade;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void  setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Cadastro(String nome, String email, String senha, int idade) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.idade = idade;
    }

    public void Acao(){
        System.out.println("\nCadastro realizado com sucesso!\n");
        System.out.print("Nome: " + nome + "\n");
        System.out.print("E-mail: " + email + "\n");
        System.out.print("senha: ********\n");
        System.out.print("Idade: " + idade + "\n");
    }
}
