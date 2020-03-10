import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    //Triangle tr = new Triangle(2,2,2);

    @Test
    public void Triangle(){

        assertThrows(IllegalArgumentException.class, () -> { Triangle tr = new Triangle(0,0,0);});

    }

    @Test
    public  void classify(){

        Triangle tr1 = new Triangle(5,5,2);

        assertEquals("equilateral",tr1.classify());

    }



}