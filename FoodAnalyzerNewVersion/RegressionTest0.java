import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean12 = strSet7.isEmpty();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.stream.Stream<java.lang.String> strStream1 = strSet0.parallelStream();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet0.stream();
        org.junit.Assert.assertNotNull(strStream1);
        org.junit.Assert.assertNotNull(strStream2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.lang.String str3 = strSet1.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str5 = strSet4.pollFirst();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
        strSet12.clear();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.lang.String str6 = strSet2.toString();
        java.util.SortedSet<java.lang.String> strSet8 = strSet2.headSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.Spliterator<java.lang.String> strSpliterator12 = strSet2.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strSpliterator12);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
        java.util.stream.Stream<java.lang.String> strStream14 = strSet2.stream();
        java.lang.String str16 = strSet2.ceiling("");
        java.lang.String str17 = strSet2.pollFirst();
        java.lang.String[] strArray19 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet20 = new java.util.TreeSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        java.util.SortedSet<java.lang.String> strSet23 = strSet20.tailSet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = strSet2.remove((java.lang.Object) strSet20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.TreeSet cannot be cast to class java.lang.Comparable (java.util.TreeSet and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.SortedSet<java.lang.String> strSet13 = strSet2.headSet("[]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = strSet7.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
        int int14 = strSet12.size();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.lang.String str3 = strSet1.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet1);
        java.lang.Object obj5 = strSet1.clone();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "[]");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.lang.String str3 = strSet1.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str6 = strSet4.lower("");
        java.lang.String str8 = strSet4.lower("hi!");
        java.util.Iterator<java.lang.String> strItor9 = strSet4.descendingIterator();
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet10);
        java.lang.String str13 = strSet11.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet11);
        java.lang.String str16 = strSet14.higher("[]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = strSet4.contains((java.lang.Object) strSet14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.TreeSet cannot be cast to class java.lang.Comparable (java.util.TreeSet and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet12);
        java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet12);
        java.util.SortedSet<java.lang.String> strSet17 = strSet15.tailSet("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.lang.String str3 = strSet1.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str6 = strSet4.higher("[]");
        boolean boolean8 = strSet4.remove((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strSet4.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet12);
        java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet12);
        java.util.Collection<java.lang.String> strCollection16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = strSet12.containsAll(strCollection16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Collection.iterator()\" because \"c\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.lang.String str3 = strSet1.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str6 = strSet4.lower("");
        java.lang.String str8 = strSet4.lower("hi!");
        java.lang.String str9 = strSet4.toString();
        java.util.SortedSet<java.lang.String> strSet12 = strSet4.subSet("", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
        java.util.stream.Stream<java.lang.String> strStream14 = strSet2.stream();
        java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet16 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet15);
        java.lang.String str18 = strSet16.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet19 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet16);
        java.util.TreeSet<java.lang.String> strSet20 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet21 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet20);
        java.lang.String str23 = strSet21.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet24 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet21);
        java.lang.Iterable[] iterableArray26 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray27 = (java.lang.Iterable<java.lang.String>[]) iterableArray26;
        strIterableArray27[0] = strSet16;
        strIterableArray27[1] = strSet21;
        java.lang.Iterable<java.lang.String>[] strIterableArray32 = strSet2.toArray(strIterableArray27);
        boolean boolean34 = strSet2.add("hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(iterableArray26);
        org.junit.Assert.assertNotNull(strIterableArray27);
        org.junit.Assert.assertNotNull(strIterableArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        int int6 = strSet2.size();
        java.util.Spliterator<java.lang.String> strSpliterator7 = strSet2.spliterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strSpliterator7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.lang.String str3 = strSet1.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str6 = strSet1.floor("");
        java.util.stream.Stream<java.lang.String> strStream7 = strSet1.stream();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strStream7);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
        java.lang.Class<?> wildcardClass14 = strSet2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.lang.String str3 = strSet1.ceiling("hi!");
        boolean boolean5 = strSet1.remove((java.lang.Object) true);
        strSet1.clear();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
        java.util.stream.Stream<java.lang.String> strStream14 = strSet2.stream();
        java.lang.String str16 = strSet2.ceiling("");
        java.lang.String str17 = strSet2.pollFirst();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = strSet2.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.lang.String str3 = strSet1.floor("[]");
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        java.util.SortedSet<java.lang.String> strSet9 = strSet6.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet10);
        java.lang.String str13 = strSet11.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet11);
        boolean boolean15 = strSet6.containsAll((java.util.Collection<java.lang.String>) strSet11);
        java.lang.String str16 = strSet11.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = strSet1.remove((java.lang.Object) strSet11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.TreeSet cannot be cast to class java.lang.Comparable (java.util.TreeSet and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        boolean boolean7 = strSet2.equals((java.lang.Object) (-1));
        java.lang.Object[] objArray8 = strSet2.toArray();
        java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet9);
        java.lang.String str12 = strSet10.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet10);
        java.lang.String str14 = strSet10.pollLast();
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet17 = new java.util.TreeSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.SortedSet<java.lang.String> strSet20 = strSet17.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet21 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet22 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet21);
        java.lang.String str24 = strSet22.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet25 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet22);
        boolean boolean26 = strSet17.containsAll((java.util.Collection<java.lang.String>) strSet22);
        java.util.TreeSet<java.lang.String> strSet27 = new java.util.TreeSet<java.lang.String>();
        boolean boolean28 = strSet17.retainAll((java.util.Collection<java.lang.String>) strSet27);
        java.util.stream.Stream<java.lang.String> strStream29 = strSet17.stream();
        java.util.stream.BaseStream[] baseStreamArray31 = new java.util.stream.BaseStream[1];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.String, java.util.stream.Stream<java.lang.String>>[] strBaseStreamArray32 = (java.util.stream.BaseStream<java.lang.String, java.util.stream.Stream<java.lang.String>>[]) baseStreamArray31;
        strBaseStreamArray32[0] = strStream29;
        java.util.stream.BaseStream<java.lang.String, java.util.stream.Stream<java.lang.String>>[] strBaseStreamArray35 = strSet10.toArray(strBaseStreamArray32);
        boolean boolean36 = strSet2.addAll((java.util.Collection<java.lang.String>) strSet10);
        java.lang.String str37 = strSet2.last();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strStream29);
        org.junit.Assert.assertNotNull(baseStreamArray31);
        org.junit.Assert.assertNotNull(strBaseStreamArray32);
        org.junit.Assert.assertNotNull(strBaseStreamArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.String str12 = strSet7.toString();
        java.lang.String str14 = strSet7.higher("hi!");
        java.lang.String str15 = strSet7.pollLast();
        java.lang.String[] strArray17 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet18 = new java.util.TreeSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        java.util.SortedSet<java.lang.String> strSet21 = strSet18.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet22 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet23 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet22);
        java.lang.String str25 = strSet23.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet26 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet23);
        boolean boolean27 = strSet18.containsAll((java.util.Collection<java.lang.String>) strSet23);
        java.util.TreeSet<java.lang.String> strSet28 = new java.util.TreeSet<java.lang.String>();
        boolean boolean29 = strSet18.retainAll((java.util.Collection<java.lang.String>) strSet28);
        java.lang.Class<?> wildcardClass30 = strSet18.getClass();
        java.lang.String[] strArray32 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet33 = new java.util.TreeSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        java.util.SortedSet<java.lang.String> strSet36 = strSet33.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet37 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet38 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet37);
        java.lang.String str40 = strSet38.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet41 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet38);
        boolean boolean42 = strSet33.containsAll((java.util.Collection<java.lang.String>) strSet38);
        java.util.TreeSet<java.lang.String> strSet43 = new java.util.TreeSet<java.lang.String>();
        boolean boolean44 = strSet33.retainAll((java.util.Collection<java.lang.String>) strSet43);
        java.lang.Class<?> wildcardClass45 = strSet33.getClass();
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet48 = new java.util.TreeSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        java.util.SortedSet<java.lang.String> strSet51 = strSet48.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet52 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet53 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet52);
        java.lang.String str55 = strSet53.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet56 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet53);
        boolean boolean57 = strSet48.containsAll((java.util.Collection<java.lang.String>) strSet53);
        java.util.TreeSet<java.lang.String> strSet58 = new java.util.TreeSet<java.lang.String>();
        boolean boolean59 = strSet48.retainAll((java.util.Collection<java.lang.String>) strSet58);
        java.lang.Class<?> wildcardClass60 = strSet48.getClass();
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet63 = new java.util.TreeSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        java.util.SortedSet<java.lang.String> strSet66 = strSet63.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet67 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet68 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet67);
        java.lang.String str70 = strSet68.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet71 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet68);
        boolean boolean72 = strSet63.containsAll((java.util.Collection<java.lang.String>) strSet68);
        java.util.TreeSet<java.lang.String> strSet73 = new java.util.TreeSet<java.lang.String>();
        boolean boolean74 = strSet63.retainAll((java.util.Collection<java.lang.String>) strSet73);
        java.lang.Class<?> wildcardClass75 = strSet63.getClass();
        java.lang.Class[] classArray77 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray78 = (java.lang.Class<?>[]) classArray77;
        wildcardClassArray78[0] = wildcardClass30;
        wildcardClassArray78[1] = wildcardClass45;
        wildcardClassArray78[2] = wildcardClass60;
        wildcardClassArray78[3] = wildcardClass75;
        java.lang.Class<?>[] wildcardClassArray87 = strSet7.toArray(wildcardClassArray78);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strSet66);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(classArray77);
        org.junit.Assert.assertNotNull(wildcardClassArray78);
        org.junit.Assert.assertNotNull(wildcardClassArray87);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
        java.util.stream.Stream<java.lang.String> strStream14 = strSet2.stream();
        java.lang.String str16 = strSet2.ceiling("");
        java.util.Iterator<java.lang.String> strItor17 = strSet2.descendingIterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strItor17);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.lang.String str1 = strSet0.pollLast();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.lang.String str3 = strSet1.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet1);
        java.util.stream.Stream<java.lang.String> strStream5 = strSet4.parallelStream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strSet4.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strStream5);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet12);
        java.lang.String str15 = strSet14.toString();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.lang.String str3 = strSet1.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str5 = strSet1.pollLast();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        java.util.SortedSet<java.lang.String> strSet11 = strSet8.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet12);
        java.lang.String str15 = strSet13.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet16 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet13);
        boolean boolean17 = strSet8.containsAll((java.util.Collection<java.lang.String>) strSet13);
        java.util.TreeSet<java.lang.String> strSet18 = new java.util.TreeSet<java.lang.String>();
        boolean boolean19 = strSet8.retainAll((java.util.Collection<java.lang.String>) strSet18);
        java.util.stream.Stream<java.lang.String> strStream20 = strSet8.stream();
        java.util.stream.BaseStream[] baseStreamArray22 = new java.util.stream.BaseStream[1];
        @SuppressWarnings("unchecked")
        java.util.stream.BaseStream<java.lang.String, java.util.stream.Stream<java.lang.String>>[] strBaseStreamArray23 = (java.util.stream.BaseStream<java.lang.String, java.util.stream.Stream<java.lang.String>>[]) baseStreamArray22;
        strBaseStreamArray23[0] = strStream20;
        java.util.stream.BaseStream<java.lang.String, java.util.stream.Stream<java.lang.String>>[] strBaseStreamArray26 = strSet1.toArray(strBaseStreamArray23);
        java.lang.String str27 = strSet1.pollLast();
        java.util.TreeSet<java.lang.String> strSet28 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet29 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet28);
        java.lang.String str31 = strSet29.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet32 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet29);
        java.lang.String str34 = strSet32.higher("[]");
        boolean boolean35 = strSet1.removeAll((java.util.Collection<java.lang.String>) strSet32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = strSet32.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strStream20);
        org.junit.Assert.assertNotNull(baseStreamArray22);
        org.junit.Assert.assertNotNull(strBaseStreamArray23);
        org.junit.Assert.assertNotNull(strBaseStreamArray26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.lang.Class<?> wildcardClass6 = strSet2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.lang.String str3 = strSet1.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str6 = strSet1.floor("");
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet10 = strSet7.tailSet("[]", true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.Iterator<java.lang.String> strItor12 = strSet7.descendingIterator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strItor12);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.lang.String str6 = strSet2.toString();
        java.lang.String str7 = strSet2.pollLast();
        boolean boolean8 = strSet2.isEmpty();
        java.lang.String str10 = strSet2.higher("[]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        boolean boolean7 = strSet2.equals((java.lang.Object) (-1));
        java.lang.String[] strArray9 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        java.util.SortedSet<java.lang.String> strSet13 = strSet10.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet14);
        java.lang.String str17 = strSet15.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet18 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet15);
        boolean boolean19 = strSet10.containsAll((java.util.Collection<java.lang.String>) strSet15);
        java.util.TreeSet<java.lang.String> strSet20 = new java.util.TreeSet<java.lang.String>();
        boolean boolean21 = strSet10.retainAll((java.util.Collection<java.lang.String>) strSet20);
        boolean boolean22 = strSet2.removeAll((java.util.Collection<java.lang.String>) strSet10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet2);
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.util.SortedSet<java.lang.String> strSet12 = strSet9.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet13);
        java.lang.String str16 = strSet14.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet17 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet14);
        boolean boolean18 = strSet9.containsAll((java.util.Collection<java.lang.String>) strSet14);
        java.util.TreeSet<java.lang.String> strSet19 = new java.util.TreeSet<java.lang.String>();
        boolean boolean20 = strSet9.retainAll((java.util.Collection<java.lang.String>) strSet19);
        java.util.stream.Stream<java.lang.String> strStream21 = strSet9.stream();
        java.util.TreeSet<java.lang.String> strSet22 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet23 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet22);
        java.lang.String str25 = strSet23.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet26 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet23);
        java.util.TreeSet<java.lang.String> strSet27 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet28 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet27);
        java.lang.String str30 = strSet28.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet31 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet28);
        java.lang.Iterable[] iterableArray33 = new java.lang.Iterable[2];
        @SuppressWarnings("unchecked")
        java.lang.Iterable<java.lang.String>[] strIterableArray34 = (java.lang.Iterable<java.lang.String>[]) iterableArray33;
        strIterableArray34[0] = strSet23;
        strIterableArray34[1] = strSet28;
        java.lang.Iterable<java.lang.String>[] strIterableArray39 = strSet9.toArray(strIterableArray34);
        boolean boolean40 = strSet6.removeAll((java.util.Collection<java.lang.String>) strSet9);
        java.util.Comparator<? super java.lang.String> wildcardComparator41 = strSet9.comparator();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strStream21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(iterableArray33);
        org.junit.Assert.assertNotNull(strIterableArray34);
        org.junit.Assert.assertNotNull(strIterableArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(wildcardComparator41);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet12);
        java.lang.String[] strArray16 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet17 = new java.util.TreeSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        java.util.SortedSet<java.lang.String> strSet20 = strSet17.tailSet("hi!");
        boolean boolean22 = strSet17.equals((java.lang.Object) (-1));
        java.lang.Object[] objArray23 = strSet17.toArray();
        boolean boolean24 = strSet14.containsAll((java.util.Collection<java.lang.String>) strSet17);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.lang.String str6 = strSet2.toString();
        java.lang.String str7 = strSet2.pollLast();
        boolean boolean8 = strSet2.isEmpty();
        java.lang.String str9 = strSet2.toString();
        strSet2.clear();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet12);
        java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet12);
        java.lang.String str16 = strSet12.pollFirst();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet12);
        java.lang.String str16 = strSet12.higher("hi!");
        boolean boolean17 = strSet12.isEmpty();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet2);
        java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet2);
        java.util.NavigableSet<java.lang.String> strSet16 = strSet2.tailSet("[]", false);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.lang.String str12 = strSet7.toString();
        java.lang.String str14 = strSet7.higher("hi!");
        boolean boolean15 = strSet7.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream16 = strSet7.parallelStream();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strStream16);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.util.Spliterator<java.lang.String> strSpliterator2 = strSet1.spliterator();
        java.lang.String str3 = strSet1.pollLast();
        org.junit.Assert.assertNotNull(strSpliterator2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.lang.String str3 = strSet1.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str6 = strSet4.lower("");
        java.lang.String str8 = strSet4.lower("hi!");
        java.util.Iterator<java.lang.String> strItor9 = strSet4.descendingIterator();
        java.lang.String str10 = strSet4.pollFirst();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strItor9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.SortedSet<java.lang.String> strSet13 = strSet2.tailSet("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.util.Spliterator<java.lang.String> strSpliterator2 = strSet1.spliterator();
        boolean boolean3 = strSet1.isEmpty();
        org.junit.Assert.assertNotNull(strSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.lang.String str3 = strSet1.floor("[]");
        boolean boolean5 = strSet1.add("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
        java.util.stream.Stream<java.lang.String> strStream14 = strSet2.stream();
        java.util.NavigableSet<java.lang.String> strSet19 = strSet2.subSet("hi!", false, "hi!", true);
        java.util.NavigableSet<java.lang.String> strSet20 = strSet2.descendingSet();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.lang.String str3 = strSet1.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str6 = strSet4.lower("");
        java.lang.String str8 = strSet4.lower("hi!");
        java.util.SortedSet<java.lang.String> strSet10 = strSet4.tailSet("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet6);
        java.lang.String str9 = strSet7.ceiling("hi!");
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet7);
        boolean boolean11 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        boolean boolean13 = strSet2.retainAll((java.util.Collection<java.lang.String>) strSet12);
        java.lang.String str14 = strSet12.pollLast();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.util.SortedSet<java.lang.String> strSet5 = strSet2.tailSet("hi!");
        boolean boolean7 = strSet2.equals((java.lang.Object) (-1));
        java.lang.String str8 = strSet2.last();
        java.util.NavigableSet<java.lang.String> strSet9 = strSet2.descendingSet();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strSet9);
    }
}

