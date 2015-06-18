/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetranco;

/**
 *
 * @author Osvaldo
 */
public class Tabuleiro {
    
    private static Tabuleiro instance;
    
    public static Tabuleiro getInstance(){
        if(instance == null){
            instance = new Tabuleiro();
        }        
        return instance;
    }

    public Tabuleiro() {
    }    
    
}
