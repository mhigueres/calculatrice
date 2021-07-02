/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatriceTest;

import java.time.Instant;



/**
 *
 * @author Utilisateur
 */
class Calculatrice { 

    int ajoute(int a, int b) {
        
        return a+b;

    }

    int multiplie(int a, int b) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return a*b;
    }
    
    public void traitementLong() {
            try {
                // Attendre 2 secondes
                    Thread.sleep(500);
            } catch (InterruptedException e) {
                    e.printStackTrace();
            }
    }
    
    public double ajoute(double a, double b) {
		return a + b;
    }
}
