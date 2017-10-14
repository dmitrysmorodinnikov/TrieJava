package tests.search;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import tests.TestTries;
import trie.TrieDataStructure;

public class SearchTest3 {

    private TrieDataStructure ActualTrie;

    @Before
    public void init() {
        ActualTrie = (TrieDataStructure) TestTries.get(2);
    }

    @Test
    public void testMethod1()  {
        Assert.assertFalse(ActualTrie.search("a"));
    }

        @Test
    public void testMethod2() {
        Assert.assertFalse(ActualTrie.search("ab"));
    }

        @Test
    public void testMethod3() {
        Assert.assertTrue(ActualTrie.search("abcd"));
    }

        @Test
    public void testMethod4() {
        Assert.assertTrue(ActualTrie.search("abc"));
    }

        @Test
    public void testMethod5()  {
        Assert.assertFalse(ActualTrie.search("ak"));
    }

        @Test
    public void testMethod6()  {
        Assert.assertFalse(ActualTrie.search("t"));
    }

        @Test
    public void testMethod7()  {
        Assert.assertFalse(ActualTrie.search("12345"));
    }

        @Test
    public void testMethod8()  {
        Assert.assertTrue(ActualTrie.search("abgl"));
    }

        @Test
    public void testMethod9()  {
        Assert.assertTrue(ActualTrie.search("cdf"));
    }

        @Test
    public void testMethod10()  {
        Assert.assertTrue(ActualTrie.search("lmn"));
    }
}
