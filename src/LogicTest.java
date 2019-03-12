import by.bntu.fitr.tnnf.javalabs.lab12.Logic;
import org.junit.Assert;
import org.junit.Test;

public class LogicTest {
    private float[][] arrayFor1Task = {{1,2,3}, {5,-6,7}, {9,10, 11}};

    private float[][] arrayFor12Task = {{-7,6,1}, {-3,-5,0}, {1,-9, 11}};
    private float[][] newArrayFor12Task = {{1, -7, 6}, {0,-3, -5}, {11, 1, -9}};

    private float[][] arrayFor2Task = {{1,3}, {9,-11}, {-7,13}};

    private float[][] firstArr = {{1,2},{3,4}};
    private float[][] secondArr = {{5,6},{7,8}};
    private float[][] newArr ={{31,32}, {59,60 }};

    @Test
    public void numStolb()
    {
        String tryAnswer = "2 ";
        Assert.assertEquals(tryAnswer, Logic.numStolb(arrayFor1Task, 3,3));
    }

    @Test
    public void numStMainDiagol()
    {
        String str = "1 sum: 6\n";
        Assert.assertEquals(str, Logic.numStMainDiagol(arrayFor1Task, 3,3 ));
    }

    @Test
    public void sumNegativOdElem()
    {
        float[] arrSum = {10, 14, 0};
        Assert.assertArrayEquals(arrSum, Logic.sumNegativOdElem(arrayFor12Task, 3,3),0.01f);
    }
    @Test
    public void newSortedArray()
    {
        Assert.assertArrayEquals(newArrayFor12Task, Logic.newSortedArray(arrayFor12Task, 3, 3));
    }

    @Test
    public void sumOddElem()
    {
          Assert.assertEquals(3, Logic.sumOddElem(arrayFor2Task, 3,2));
    }
    @Test
    public void createNewArray()
    {
        Assert.assertArrayEquals(newArr, Logic.createNewArray(firstArr,secondArr,2));
    }

}
