package hw5;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class PatronTest {


    /** A single test for Patron. **/
    @Test public void testPatron() {
    
        Patron aPatron1 = new Patron("Dee A. B. Weikle", "weikleda@jmu.edu", 
                                    2, 1.50);
        
        // testing constructor 
        assertEquals("Patron: toString", "Name: Dee A. B. Weikle,"
                     + " Email: weikleda@jmu.edu, ID: 2, Balance: $1.50.", 
                     aPatron1.toString());
        Patron aPatron2 = new Patron("Dee A. B. Weikle", "weikleda@jmu.edu", 
                                    2, 1.50);
        
        // testing equals method
        assertTrue("Patron: equals", aPatron1.equals(aPatron2));
        
        aPatron1.adjustBalance(2.50);
        
        // testing toString and adjustBalance method
        assertEquals("Patron: toString", "Name: Dee A. B. Weikle,"
                     + " Email: weikleda@jmu.edu, ID: 2, Balance: $4.00.", 
                     aPatron1.toString());        

    }

}
