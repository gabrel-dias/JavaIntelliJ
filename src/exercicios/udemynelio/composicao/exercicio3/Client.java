package exercicios.udemynelio.composicao.exercicio3;

import java.time.LocalDate;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;

    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
}
