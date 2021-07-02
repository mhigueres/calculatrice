/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatriceTest;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 * @author Utilisateur
 */
public class calculatriceTestDeux {
    private static Instant debuteA;
    private Calculatrice laCalculatriceTestee;
    
    public calculatriceTestDeux() {
    }  
    
    @BeforeAll
    public static void initDepartTemps() {
        System.out.println("Appel avant tous les tests");
        debuteA = Instant.now();
    }
    
    @AfterAll
    public static void montreDureeTest() {
        System.out.println("Appel après tous les tests");
        Instant finiA = Instant.now();
        long duree = Duration.between(debuteA,finiA).toMillis();
        System.out.println(MessageFormat.format("Durée des tests : {0} ms", duree));
       
    }
    
    @BeforeEach
    public void initCalculatrice() {
        System.out.println("Appel avant chaque test");
        laCalculatriceTestee = new Calculatrice();
    }
    
    @AfterEach
    public void undefCalculatrice() {
        System.out.println("Appel après chaque test");
        laCalculatriceTestee = null;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @ParameterizedTest(name="{0} + {1} 0 doit être égale à {2}")
    @CsvSource({"1,1,2","2,3,5","42,57,99"})
    public void testAjoutDeuxNombresPositifs() {
    // ARRANGE (organiser/disposer/déclarer)
    int a=2;
    int b=3;
      
    // ACT (agir)
    
    int somme = laCalculatriceTestee.ajoute(a,b);
    
    // ASSERT (vérification)
    assertEquals(5,somme);
    }
    
    @ParameterizedTest(name="{0} x 0 doit être égale à 0")
    @ValueSource(ints = {1, 2, 42, 1011, 5089})
    public void testMultiplicationDeuxNombresPositifs(){
        // ARRANGE (organiser/disposer/déclarer); je paramètre les entrants
        int a=2;
        int b=3;
  
        // ACT (agir); j'effectue l'action à tester
        int produit = laCalculatriceTestee.multiplie(a,b);
        
        // ASSERT; je teste les sortrants

        assertEquals(6, produit);
    }
}
