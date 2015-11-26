package com.jd.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import junit.framework.Assert;

import org.junit.Test;

public class Flattener {

  public static Stream<Object> flattenToStream(List<Object> nestedList) {
    return nestedList.stream().flatMap(
        item -> item instanceof List<?> ? flattenToStream((List<Object>) item) : Stream.of(item));
  }

  public static List<Object> flatten(List<Object> nestedList) {
    if (nestedList == null)
      return null;
    return flattenToStream(nestedList).collect(Collectors.toList());
  }

  private static List<Object> a(Object... a) {
    return Arrays.asList(a);
  }

  @Test
  public void testFlattenNullList() {
    Assert.assertNull(flatten(null));
  }

  @Test
  public void testFlattenEmptyList() {
    Assert.assertEquals(new ArrayList<>(), flatten(a()));
  }

  @Test
  public void testFlattenFlatList() {
    Assert.assertEquals(a(1, 2, 3, 4, 5), flatten(a(1, 2, 3, 4, 5)));
  }

  @Test
  public void testFlattenSimpleNestedList() {
    Assert.assertEquals(a(1, 2, 3, 4, 5), flatten(a(1, a(2), 3, 4, 5)));
  }

  @Test
  public void testFlattenComplexNested() {
    Assert.assertEquals(a(1, 2, 3, 4, 5, 6, 7), flatten(a(a(1), 2, a(a(3, 4), 5), a(a(a(6))), 7)));

  }
}
