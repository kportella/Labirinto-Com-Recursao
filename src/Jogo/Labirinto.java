package Jogo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Labirinto {


    public char[][] carregaLabirinto(String fileName) throws IOException
    {
        int contador = 0;
        int linha = 0;
        int coluna = 0;
        char[][] labirinto = null;
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while((line = reader.readLine()) != null)
        {
            contador++;
            if(contador == 1) {
                String valorLinha = "";
                int contadorLinha = 0;
                while(line.charAt(contadorLinha) != ' ')
                {
                    valorLinha = valorLinha.concat(Character.toString(line.charAt(contadorLinha)));
                    contadorLinha++;
                }
                linha = Integer.parseInt(valorLinha);
            }
            else if(contador == 2) {
                String valorColuna = "";
                int contadorColuna = 0;
                while(line.charAt(contadorColuna) != ' ') {
                    valorColuna = valorColuna.concat(Character.toString(line.charAt(contadorColuna)));
                    contadorColuna++;
                }
                coluna = Integer.parseInt(valorColuna);
                labirinto = new char[linha][coluna];
            }
            else {
                for (int x = 0; x < coluna; x++) {
                    labirinto[contador - 3][x] = line.charAt(x);
                }
            }
        }
        return labirinto;
    }

    /*public boolean Labirinto()
    {

    }

    private boolean Labirinto(char[][] labirinto, int linha, int coluna)
    {

    }*/
}
