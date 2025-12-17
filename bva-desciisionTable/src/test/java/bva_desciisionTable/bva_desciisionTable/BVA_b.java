package bva_desciisionTable.bva_desciisionTable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BVA_b {
	
	@Test
    void testBIsZero_shouldThrowException() {
        // arrange
        int a = 60;   
        int b = -1;  // ערך לא חוקי
        int c = 60;
        int d = 60;
        int e = 60;

        // act + assert
        assertThrows(IllegalArgumentException.class, () -> {
        	MinCalculator.findMin(a, b, c, d, e);
        });
    }
 
 
 @Test
    void testBIsZero1_shouldThrowException() {
        // arrange
        int a = 60;   
        int b = 1001;  // ערך לא חוקי
        int c = 60;
        int d = 60;
        int e = 60;

        // act + assert
        assertThrows(IllegalArgumentException.class, () -> {
        	MinCalculator.findMin(a, b, c, d, e);
        });
    }

	
	@Test
    void testBIsOne_shouldReturnMinimum() {
    // arrange
    int a = 60;    
    int b = 1;
    int c = 60;
    int d = 60;
    int e = 60;

    // act
    int result = MinCalculator.findMin(a, b, c, d, e);

    // assert
    assertEquals(1, result);   
    }
    
    @Test
    void testBIs2_shouldReturnMinimum() {
    // arrange
    int a = 60;    
    int b = 2;
    int c = 60;
    int d = 60;
    int e = 60;

    // act
    int result = MinCalculator.findMin(a, b, c, d, e);

    // assert
    assertEquals(2, result);   
}
    @Test
    void testBIsnominal_shouldReturnMinimum() {
    // arrange
    int a = 60;    
    int b = 60;
    int c = 60;
    int d = 60;
    int e = 60;

    // act
    int result = MinCalculator.findMin(a, b, c, d, e);

    // assert
    assertEquals(60, result);   
    
    
}
    @Test
    void testBIsmaxmenos1_shouldReturnMinimum() {
    // arrange
    int a = 60;    
    int b = 999;
    int c = 60;
    int d = 60;
    int e = 60;

    // act
    int result = MinCalculator.findMin(a, b, c, d, e);

    // assert
    assertEquals(60, result);  
}
    @Test
    void testBIsMax_shouldReturnMinimum() {
    // arrange
    int a = 60;    
    int b = 1000;
    int c = 60;
    int d = 60;
    int e = 60;

    // act
    int result = MinCalculator.findMin(a, b, c, d, e);

    // assert
    assertEquals(60, result);  
}

}
