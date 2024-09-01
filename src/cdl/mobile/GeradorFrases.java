package cdl.mobile;

/*
FRASES QUE SERÃO UTILIZADAS:
Bazinga! (The Big Bang Theory)
Não entre em pânico. (Guia do Mochileiro das Galáxias)
Que a Força esteja com você! (Star Wars)
Com grandes poderes, vem grandes responsabilidades. (Homem-Aranha)
O inverno está chegando. (Game of Thrones)
São as nossas escolhas, Harry, que revelam o que realmente somos, muito mais do que as nossas qualidades. (Harry Potter)
A mente é uma coisa frágil. Basta a mínima coisa para ir na direção errada. (X-Men)
Não brinque com o nerd de sua turma, pois um dia ele pode ser seu chefe. (Bill Gates)
It's bigger on the inside! (Qualquer um ao entrar na TARDIS pela primeira vez em Doctor Who)
One ring to rule them all (Senhor dos Anéis)
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GeradorFrases {
    public static void main(String[] args) {

        Map<Integer, String> mapFrasesGeradas = new HashMap() {
            {
                put(0, "Bazinga! (The Big Bang Theory)");
                put(1, "Não entre em pânico. (Guia do Mochileiro das Galáxias)");
                put(2, "Que a Força esteja com você! (Star Wars)");
                put(3, "Com grandes poderes, vem grandes responsabilidades. (Homem-Aranha)");
                put(4, "O inverno está chegando. (Game of Thrones)");
                put(5, "São as nossas escolhas, Harry, que revelam o que realmente somos, muito mais do que as nossas qualidades. (Harry Potter)");
                put(6, "A mente é uma coisa frágil. Basta a mínima coisa para ir na direção errada. (X-Men)");
                put(7, "Não brinque com o nerd de sua turma, pois um dia ele pode ser seu chefe. (Bill Gates)");
                put(8, "It's bigger on the inside! (Qualquer um ao entrar na TARDIS pela primeira vez em Doctor Who)");
                put(9, "One ring to rule them all (Senhor dos Anéis)");
            }
        };
        // criando uma chave inteira aleatória entre a quantidade mínima e máxima disponíveis no map, e assim poder resgatar um valor do mesmo
        Random valor = new Random();
        int valorTeste = valor.nextInt(11);
        System.out.println(valorTeste);
    }
}