package src.main.java.Dio.SpringBoot.app.app;

import java.util.List;
@Component
public class SistemaMensagem implements CommandLineRunner{
    @Autowired
    private Remetente remetente;

    public void run(String... args) throws  Exception{
        System.out.println("Mensagem Enviada por: " + remetente.getNome()
        + "\nE-mail:" + remetente.getEmail() + "\nCom telefone para contato: "
                + remetente.getTelefones());
        System.out.println("Seu cadastro foi  aprovado");

    }
}
