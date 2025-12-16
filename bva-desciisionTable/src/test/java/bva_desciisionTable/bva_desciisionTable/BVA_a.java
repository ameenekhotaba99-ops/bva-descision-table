package bva_desciisionTable.bva_desciisionTable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BVA_a {
	
	@Test
    void testAIsZero_shouldThrowException() {
        // arrange
        int a = -1;   // ערך לא חוקי
        int b = 60;
        int c = 60;
        int d = 60;
        int e = 60;

        // act + assert
        assertThrows(IllegalArgumentException.class, () -> {
        	MinCalculator.findMin(a, b, c, d, e);
        });
    }
 
 
 @Test
    void testAIsZero1_shouldThrowException() {
        // arrange
        int a = 1001;   // ערך לא חוקי
        int b = 60;
        int c = 60;
        int d = 60;
        int e = 60;

        // act + assert
        assertThrows(IllegalArgumentException.class, () -> {
        	MinCalculator.findMin(a, b, c, d, e);
        });
    }
	
	@Test
    void testAIsOne_shouldReturnMinimum() {
        // arrange
        int a = 1;    // ערך גבול תקין
        int b = 60;
        int c = 60;
        int d = 60;
        int e = 60;

        // act
        int result = MinCalculator.findMin(a, b, c, d, e);

        // assert
        assertEquals(1, result);   // 1 הוא הערך המינימלי
    }



@Test
void testAIs2_shouldReturnMinimum() {
// arrange
int a = 2;    // ערך גבול תקין
int b = 60;
int c = 60;
int d = 60;
int e = 60;

// act
int result = MinCalculator.findMin(a, b, c, d, e);

// assert
assertEquals(2, result);   // 2 הוא הערך המינימלי
}


@Test
void testAIsnominl_shouldReturnMinimum() {
// arrange
int a = 60;    // ערך גבול תקין
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
void testAIsmaxmenos1_shouldReturnMinimum() {
// arrange
int a = 999;    // ערך גבול תקין
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
void testAIsmax_shouldReturnMinimum() {
// arrange
int a = 1000;    // ערך גבול תקין
int b = 60;
int c = 60;
int d = 60;
int e = 60;

// act
int result = MinCalculator.findMin(a, b, c, d, e);

// assert
assertEquals(60, result);   
}

}
