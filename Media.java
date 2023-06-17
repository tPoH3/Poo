
package sp.senai.br.calculomedias;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Media {
    
    public static void main(String args[]){   
       
        Poo biblioteca = new Poo();
        
        biblioteca.inserirNotas();
        biblioteca.calcularMedia();
        biblioteca.verificarSituacao();
        biblioteca.exibirResultados();
    	System.exit(0);
		
    }
}
