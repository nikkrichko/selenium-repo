package lessons.lesson_03;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathemTest {
    @Test
    public void summTest(){
        Mathem mathem = new Mathem();
        Assert.assertEquals(mathem.summ(2,2), 4 );
        System.out.println("MATHEM PASS");
    }


}