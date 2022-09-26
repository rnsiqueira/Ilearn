package valid.document;


import org.junit.Assert;
import org.junit.Test;

public class TestValid {

    @Test
    public void test() {

        ValidDoc vd = new DocumentCpf();

        Assert.assertTrue(vd.valided("393.660.111-92"));
        Assert.assertFalse(vd.valided("123.123.123-11"));

    }
}
