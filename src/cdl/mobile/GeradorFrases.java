package cdl.mobile;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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
public class GeradorFrases {
    public static void main(String[] args) {
        Map<Integer, String> frasesMap = new HashMap<>();
        // teste inicial com uso do HashMap e Random
        frasesMap.put(1, "Bazinga! (The Big Bang Theory)");
        frasesMap.put(2, "Não entre em pânico. (Guia do Mochileiro das Galáxias)");
        frasesMap.put(3, "Que a Força esteja com você! (Star Wars)");

        Random valores = new Random();
        System.out.println(frasesMap.get(valores.nextInt(1, 4)));
    }
}
