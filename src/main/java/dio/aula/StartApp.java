package dio.aula;

import dio.aula.model.Usuario;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired // para haver injeção de dependência
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setName("Juan");
        usuario.setUsuario("Juanito");
        usuario.setPassword("dio123");

        repository.save(usuario);

        for (Usuario u: repository.findAll()){
            System.out.println(u);
        }

    }
}
