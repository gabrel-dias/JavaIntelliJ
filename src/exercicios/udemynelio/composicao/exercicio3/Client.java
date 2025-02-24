package exercicios.udemynelio.composicao.exercicio3;

import java.time.LocalDateTime;

public class Client {
    private String name;
    private String email;
    private LocalDateTime birthDate;

    public Client(String name, String email, LocalDateTime birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
}
