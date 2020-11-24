package laba4;

import junit.framework.TestCase;
import laba3.model.University;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ManagerTest extends TestCase {

    @Test
    public void testManager() throws IOException {
        Manager manager = new Manager();
        Filling filling = new Filling();

        University ntu = filling.createUniversity();

        manager.writeToFile(ntu);
        University ntuNew = manager.readFromFile();

        Assert.assertEquals(ntuNew.toString(), ntu.toString());


    }
}