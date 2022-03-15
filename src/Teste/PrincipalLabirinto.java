package Teste;

import Jogo.Labirinto;

import java.io.IOException;

public class PrincipalLabirinto {
    public static void main(String [] args) throws IOException {
        Labirinto labirinto = new Labirinto();
        char[][] result = labirinto.carregaLabirinto("C:/Users/porte/Documents/JogoLabirinto/src/Teste/labirinto.txt");
    }

    }
