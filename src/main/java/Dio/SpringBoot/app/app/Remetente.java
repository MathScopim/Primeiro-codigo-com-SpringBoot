package src.main.java.Dio.SpringBoot.app.app;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix =
        "remetente")

public class Remetente {
    private String nome;
    private String email;
    private List<Long> telefones;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public List<Long> getTelefones() {
        return telefones;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefones(List<Long> telefones) {
        this.telefones = telefones;
    }
}
