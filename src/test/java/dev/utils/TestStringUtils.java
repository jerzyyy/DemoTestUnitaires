package dev.utils;

import org.junit.Assert;
import org.junit.Test;

public class TestStringUtils {
	@Test(expected = NullPointerException.class)
	public void testlevenshteinDistanceWhenNull() {
	CharSequence lhs= null;
	CharSequence rhs=null;
	StringUtils.levenshteinDistance(lhs, rhs);
	}
	@Test
	public void testlevenshteinDistanceWhenChanginOneLetter() {
	CharSequence lhs="paris" ;
	CharSequence rhs="aris";
	Assert.assertEquals(5,lhs.length());
	StringUtils.levenshteinDistance(lhs, rhs);
	}
	@Test
	public void testlevenshteinDistanceWithSameText() {
	CharSequence lhs= "madrid";
	CharSequence rhs="madrid";
	Assert.assertEquals(lhs.length(),rhs.length());
	StringUtils.levenshteinDistance(lhs, rhs);
	}
}
