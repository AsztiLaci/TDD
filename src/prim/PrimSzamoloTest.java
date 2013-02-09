package prim;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class PrimSzamoloTest {

    private PrimSzamolo primSzamolo;

    @Before
    public void setUp() throws Exception {
        primSzamolo = new PrimSzamolo();
    }

    @Test
    public void nullaig() {
        PrimSzamolo primSzamolo = new PrimSzamolo();
        List<Integer> primek = primSzamolo.eddig(0);
        Assert.assertEquals(0, primek.size());
    }

    @Test
    public void kettoig() {
        List<Integer> primek = primSzamolo.eddig(2);
        Assert.assertEquals("legyen 1 db prim szam", 1, primek.size());
        Assert.assertEquals("legyen a szam 2", (Object) 2, primek.get(0));
    }

    @Test
    public void haromig() {
        List<Integer> primek = primSzamolo.eddig(3);
        Assert.assertEquals("legzen 2db prim syam", 2, primek.size());
        Assert.assertEquals("legzen ay 1. syam 2", (Object) 2, primek.get(0));
        Assert.assertEquals("legzen ay 2. syam 3", (Object) 3, primek.get(1));
    }

    /**
     * 2 3 5 7
     */
    @Test
    public void tizig() {
        List<Integer> primek = primSzamolo.eddig(10);
        Assert.assertEquals(4, primek.size());
        Assert.assertEquals((Object) 2, primek.get(0));
        Assert.assertEquals((Object) 3, primek.get(1));
        Assert.assertEquals((Object) 5, primek.get(2));
        Assert.assertEquals((Object) 7, primek.get(3));
    }
}
