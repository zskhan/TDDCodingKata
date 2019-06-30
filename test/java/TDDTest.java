import com.coding.kata.TDD;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class TDDTest {

    @Test(expected = IOException.class)
    public void getDataFromFileTest_WhenfileDoesnotExist_throwFileNotFoundExceptio()
        throws IOException {
        TDD tdd = new TDD();
        String fileName = "temp.txt";
        List<String> data = tdd.getDataFromFile(fileName);

    }


    @Test
    public void getDataFromFileTest_WhenfileExist_ReturnString()
        throws IOException {
        TDD tdd = new TDD();
        String fileName = "weatherTest.csv";
        List<String> data = tdd.getDataFromFile(fileName);
        Assert.assertEquals(data.get(0),"  Dy, MxT,   MnT,   AvT,   HDDay,  AvDP, 1HrP, TPcpn, WxType, PDir, AvSp, Dir, MxS, SkyC, MxR, MnR, AvSLP");
        Assert.assertEquals(data.get(1),"1,88,59,74,        ,53.8,     ,0, F     ,280,9.6,270,17,1.6,93,23,1004.5");
    }

}
