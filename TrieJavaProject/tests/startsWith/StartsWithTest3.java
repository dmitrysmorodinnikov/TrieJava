package tests.startsWith;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tests.TestTries;
import trie.TrieDataStructure;

public class StartsWithTest3 {
    private TrieDataStructure ActualTrie;

    @Before
    public void init()
    {
        ActualTrie = (TrieDataStructure) TestTries.get(2);
    }

    @Test
    public void testMethod1() {
        Assert.assertTrue(ActualTrie.startsWith("a"));
    }

    @Test
    public void testMethod2() {
        Assert.assertTrue(ActualTrie.startsWith("c"));
    }

    @Test
    public void testMethod3()  {
        Assert.assertTrue(ActualTrie.startsWith("l"));
    }

    @Test
    public void testMethod4()  {
        Assert.assertTrue(ActualTrie.startsWith("ab"));
    }

    @Test
    public void testMethod5()  {
        Assert.assertTrue(ActualTrie.startsWith("abc"));
    }

    @Test
    public void testMethod6()  {
        Assert.assertTrue(ActualTrie.startsWith("abcd"));
    }

    @Test
    public void testMethod7()  {
        Assert.assertTrue(ActualTrie.startsWith("abg"));
    }

    @Test
    public void testMethod8()  {
        Assert.assertTrue(ActualTrie.startsWith("abgl"));
    }

    @Test
    public void testMethod9() {
        Assert.assertTrue(ActualTrie.startsWith("cd"));
    }

    @Test
    public void testMethod10() {
        Assert.assertTrue(ActualTrie.startsWith("cdf"));
    }

    @Test
    public void testMethod11() {
        Assert.assertTrue(ActualTrie.startsWith("lm"));
    }

    @Test
    public void testMethod12() {
        Assert.assertTrue(ActualTrie.startsWith("lmn"));
    }

    @Test
    public void testMethod13() {
        Assert.assertFalse(ActualTrie.startsWith("abd"));
    }

    @Test
    public void testMethod14() {
        Assert.assertFalse(ActualTrie.startsWith("abgg"));
    }

    @Test
    public void testMethod15() {
        Assert.assertFalse(ActualTrie.startsWith("abcdgd"));
    }

    @Test
    public void testMethod16() {
        Assert.assertFalse(ActualTrie.startsWith("dfc"));
    }

    @Test
    public void testMethod17() {
        Assert.assertFalse(ActualTrie.startsWith("lmnp"));
    }

    @Test
    public void testMethod18() {
        Assert.assertFalse(ActualTrie.startsWith("cb"));
    }

    @Test
    public void testMethod19() {
        Assert.assertFalse(ActualTrie.startsWith("ad"));
    }

}
