package Exercicios.OrientacaoObjetos.EAssociacao.domain;

public class Usuario {
    private String nome;
    private String email;

    
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Usuario){
            Usuario outro = (Usuario) obj;
            return super.equals(obj);

        } else {
            return false;
        }
    }

    public String textBlock(){
        return """
            Nome: %s
            Email: %s
                """.formatted(nome, email);
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
}
