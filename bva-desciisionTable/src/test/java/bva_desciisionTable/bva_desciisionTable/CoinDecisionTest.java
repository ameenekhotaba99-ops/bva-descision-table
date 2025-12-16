package bva_desciisionTable.bva_desciisionTable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CoinDecisionTest {

    CoinDecision cd = new CoinDecision();

    @Test
    public void testR1ANDR9() {
        String result = cd.CoinDecision("T", "T", "T", "H");
        assertEquals("Negative", result);
    }

    @Test
    public void testR2() {
        String result = cd.CoinDecision("H", "T", "T", "T");
        assertEquals("Negative", result);
    }
    
    @Test
    public void testR3() {
        String result = cd.CoinDecision("T", "H", "T", "T");
        assertEquals("Negative", result);
    }

    @Test
    public void testR4() {
        String result = cd.CoinDecision("H", "H", "T", "T");
        assertEquals("Positive", result);
    }

    @Test
    public void testR5() {
        String result = cd.CoinDecision("T", "T", "H", "T");
        assertEquals("Negative", result);
    }

    @Test
    public void testR6() {
        String result = cd.CoinDecision("H", "T", "H", "T");
        assertEquals("Positive", result);
    }
    
    @Test
    public void testR7ANDR8() {
        
        String result = cd.CoinDecision("H", "H", "H", "T");
        assertEquals("Positive", result);
    }
    
    
    @Test
    public void testR10() {
        String result = cd.CoinDecision("H", "T", "T", "H");
        assertEquals("Positive", result);
    }
    
    
    @Test
    public void testR11ANDR12() {
        String result = cd.CoinDecision("T", "H", "T", "H");
        assertEquals("Positive", result);
    }
    
    
    
    
    @Test
    public void testR13TOR16() {
        String result = cd.CoinDecision("H", "H", "H", "T");
        assertEquals("Positive", result);
    }
}
