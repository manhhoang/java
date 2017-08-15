package com.jd.java.generic;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

interface Pair<K, V> {
  public K getKey();

  public V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {

  private K key;
  private V value;

  public OrderedPair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }
}

class Util {
  public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
    return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
  }
}

public class Generic {

  public static long sumOfList(List<? extends Number> list) {
    long s = 0;
    for (Number n : list)
      s += n.longValue();
    return s;
  }

  @Test
  public void test1() {
    List<Integer> li = Arrays.asList(1, 2, 3);
    Assert.assertEquals(6, sumOfList(li));
  }

  @Test
  public void test2() {
    Pair<String, Integer> p1 = new OrderedPair<>("Even", 8);
    Pair<String, String> p2 = new OrderedPair<>("hello", "world");
    Assert.assertEquals("Even", p1.getKey());
    Assert.assertEquals("world", p2.getValue());
  }

  @Test
  public void test3() {
    Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
    Pair<Integer, String> p2 = new OrderedPair<>(2, "pear");
    boolean same = Util.compare(p1, p2);
    Assert.assertFalse(same);
  }

}
