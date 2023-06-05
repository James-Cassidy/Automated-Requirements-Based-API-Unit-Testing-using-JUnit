package org.jfree.data.RangeTest;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RangeTest {
	
	private Range rangeOne, rangeTwo, rangeThree, rangeFour;
	
	@Before
	public void setUp() throws Exception {
		rangeOne = new Range(-5, 5);
		rangeTwo = new Range(1, 5);
		rangeThree = new Range(-5, -1);
		rangeFour = new Range(1, 1);
	}
	
	@After
	public void tearDown() throws Exception{
		
	}
	
	@Test
	public void testValueNegativeSixIsNotWithinRangeOne() {	
		
		double value = -6;		
		assertEquals("The range -5 to 5 does not contain the value -6", false, rangeOne.contains(value));		
	}
	
	@Test
	public void testValueOneIsWithinRangeOne() {
		
		double value = 1;		
		assertEquals("The range -5 to 5 does contain the value 1", true, rangeOne.contains(value));		
	}
	
	@Test
	public void testValuePositiveSixIsNotWithinRangOne() {
		
		double value = 6;	
		assertEquals("The range -5 to 5 does not contain the value 6", false, rangeOne.contains(value));		
	}

	@Test
	public void testValueNegativeSixIsNotWithinRangeTwo() {	
		
		double value = -6;		
		assertEquals("The range 1 to 5 does not contain the value -6", false, rangeTwo.contains(value));		
	}
	
	@Test
	public void testValuePositiveThreeIsWithinRangeTwo() {	
		
		double value = 3;		
		assertEquals("The range 1 to 5 does contain the value 1", true, rangeTwo.contains(value));		
	}
	
	@Test
	public void testValuePositiveSixIsNotWithinRangeTwo() {
		
		double value = 6;	
		assertEquals("The range 1 to 5 does not contain the value 6", false, rangeTwo.contains(value));		
	}
	
	@Test
	public void testValueNegativeSixIsNotWithinRangeThree() {	
		
		double value = -6;		
		assertEquals("The range -5 to -1 does not contain the value -6", false, rangeThree.contains(value));		
	}
	
	@Test
	public void testValueNegativeThreeIsWithinRangeThree() {	
		
		double value = -3;		
		assertEquals("The range -5 to -1 does contain the value 1", true, rangeThree.contains(value));		
	}
	
	@Test
	public void testValuePositiveSixIsNotWithinRangThree() {
		
		double value = 6;	
		assertEquals("The range -5 to -1 does not contain the value 6", false, rangeThree.contains(value));		
	}
	
	@Test
	public void testValueNegativeSixIsNotWithinRangeFour() {	
		
		double value = -6;		
		assertEquals("The range 1 to 1 does not contain the value -6", false, rangeFour.contains(value));		
	}
	
	@Test
	public void testValuePositiveOneIsWithinRangeFour() {	
		
		double value = 1;		
		assertEquals("The range 1 to 1 does contain the value 1", true, rangeFour.contains(value));		
	}
	
	@Test
	public void testValuePositiveSixIsNotWithinRangFour() {
		
		double value = 6;	
		assertEquals("The range 1 to 1 does not contain the value 6", false, rangeFour.contains(value));		
	}
	
	/*
	 * GetLength Tests
	 */
	
	@Test
	public void testGetLengthreturnsTenForRangeOne() {
		
		assertEquals("The range -5 to 5 has length 10", 10.0, rangeOne.getLength(), 10.00000001d);
	}
	
	@Test
	public void testGetLengthreturnsFourForRangeTwo() {
		
		assertEquals("The range 1 to 5 has length 4", 4.0, rangeTwo.getLength(), 4.00000001d);
	}
	
	@Test
	public void testGetLengthreturnsFourForRangeThree() {
		
		assertEquals("The range -5 to -1 has length 4", 4.0, rangeThree.getLength(), 4.00000001d);
	}
	
	@Test
	public void testGetLengthreturnsZeroForRangeFour() {
		
		assertEquals("The range 1 to 1 has length 0", 0.0, rangeFour.getLength(), 0.00000001d);
	}
	
	/*
	 * Intersects Test
	 */
	
	@Test
	public void testRangeNegativeThreeToPositiveTenIntersectsRangeOne() {
		
		assertEquals("The range -3 to 10 intersects the range -5 to 5", true, rangeOne.intersects(-3, 10));
	}
	
	@Test
	public void testRangePositiveThreeToPositiveTenIntersectsRangeOne() {
		
		assertEquals("The range 3 to 10 intersects the range -5 to 5", true, rangeOne.intersects(3, 10));
	}
	
	@Test
	public void testRangeNegativeTwelveToNegativeSevenDoesNotIntersectRangeOne() {
		
		assertEquals("The range -12 to -7 does not intersects the range -5 to 5", false, rangeOne.intersects(-12, -7));
	}
	
	@Test
	public void testRangePositiveOneToPositiveOneIntersectsRangeOne() {
		
		assertEquals("The range 1 to 1 intersects the range -5 to 5", true, rangeOne.intersects(1, 1));
	}
	
	@Test
	public void testRangeNegativeThreeToPositiveTenIntersectsRangeTwo() {
		
		assertEquals("The range -3 to 10 intersects the range 1 to 5", true, rangeTwo.intersects(-3, 10));
	}
	
	@Test
	public void testRangePositiveThreeToPositiveTenIntersectsRangeTwo() {
		
		assertEquals("The range 3 to 10 intersects the range 1 to 5", true, rangeTwo.intersects(3, 10));
	}
	
	@Test
	public void testRangeNegativeTwelveToNegativeSevenDoesNotIntersectRangeTwo() {
		
		assertEquals("The range -12 to -7 does not intersect the range 1 to 5", false, rangeTwo.intersects(-12, -7));
	}
	
	@Test
	public void testRangePositiveOneToPositiveOneIntersectsRangeTwo() {
		
		assertEquals("The range 1 to 1 intersects the range 1 to 5", true, rangeTwo.intersects(1, 1));
	}

	@Test
	public void testRangeNegativeThreeToPositiveTenIntersectsRangeThree() {
		
		assertEquals("The range -3 to 10 intersects the range -5 to -1", true, rangeThree.intersects(-3, 10));
	}
	
	@Test
	public void testRangePositiveThreeToPositiveTenIntersectsRangeThree() {
		
		assertEquals("The range 3 to 10 intersects the range -5 to -1", true, rangeThree.intersects(3, 10));
	}
	
	@Test
	public void testRangeNegativeTwelveToNegativeSevenDoesNotIntersectRangeThree() {
		
		assertEquals("The range -12 to -7 does not intersect the range -5 to -1", false, rangeThree.intersects(-12, -7));
	}
	
	@Test
	public void testRangePositiveOneToPositiveOneIntersectsRangeThree() {
		
		assertEquals("The range 1 to 1 intersects the range -5 to -1", true, rangeThree.intersects(1, 1));
	}
	
	@Test
	public void testRangeNegativeThreeToPositiveTenDoesNotIntersectsRangeFour() {
		
		assertEquals("The range -3 to 10 does not intersect the range -5 to -1", false, rangeFour.intersects(-3, 10));
	}
	
	@Test
	public void testRangePositiveThreeToPositiveTenDoesNotIntersectRangeFour() {
		
		assertEquals("The range 3 to 10 does not intersect the range -5 to -1", false, rangeFour.intersects(3, 10));
	}
	
	@Test
	public void testRangeNegativeTwelveToNegativeSevenDoesNotIntersectRangeFour() {
		
		assertEquals("The range -12 to -7 does not intersect the range -5 to -1", false, rangeFour.intersects(-12, -7));
	}
	
	@Test
	public void testRangePositiveOneToPositiveOneIntersectsRangeFour() {
		
		assertEquals("The range 1 to 1 intersects the range -5 to -1", true, rangeFour.intersects(1, 1));
	}
	
	/*
	 * Constrain Tests
	 */
	
	@Test
	public void testConstrainNegativeSixReturnsNegativeFiveForRangeOne() {
		
		assertEquals("The range -5 to 5 returns - 5 when constrain is called with the value -6", -5.0, rangeOne.constrain(-6), -5.0000000001d);
	}
	
	@Test
	public void testConstrainPositiveSixReturnsPositiveFiveForRangeOne() {
		
		assertEquals("The range -5 to 5 returns 5 when constrain is called with the value 6", 5.0, rangeOne.constrain(6), 5.0000000001d);
	}
	
	@Test
	public void testConstrainPositiveThreeReturnsPositiveThreeForRangeOne() {
		
		assertEquals("The range -5 to 5 returns 3 when constrain is called with the value 3", 3.0, rangeOne.constrain(3), 3.0000000001d);
	}
	
	@Test
	public void testConstrainNegativeSixReturnsPositiveOneForRangeTwo() {
		
		assertEquals("The range 1 to 5 returns 1 when constrain is called with the value -6", 1.0, rangeTwo.constrain(-6), 1.0000000001d);
	}
	
	@Test
	public void testConstrainPositiveSixReturnsPositiveFiveForRangeTwo() {
		
		assertEquals("The range 1 to 5 returns 5 when constrain is called with the value 6", 5.0, rangeTwo.constrain(6),5.0000000001d);
	}
	
	@Test
	public void testConstrainPositiveThreeReturnsPositiveThreeForRangeTwo() {
		
		assertEquals("The range 1 to 5 returns 3 when constrain is called with the value 3", 3.0, rangeTwo.constrain(3), 3.0000000001d);
	}
	
	@Test
	public void testConstrainNegativeSixReturnsNegativeFiveForRangeThree() {
		
		assertEquals("The range -5 to -1 returns -5 when constrain is called with the value -6", -5.0, rangeThree.constrain(-6), -5.0000000001d);
	}
	
	@Test
	public void testConstrainPositiveSixReturnsNegativeOneForRangeThree() {
		
		assertEquals("The range -5 to -1 returns -1 when constrain is called with the value 6", -1.0, rangeThree.constrain(6), -1.0000000001d);
	}
	
	@Test
	public void testConstrainNegativeThreeReturnsNegativeThreeForRangeThree() {
		
		assertEquals("The range -5 to -1 returns -3 when constrain is called with the value -3", -3.0, rangeThree.constrain(-3), -3.0000000001d);
	}
	
	@Test
	public void testConstrainNegativeSixReturnsPositiveOneForRangeFour() {
		
		assertEquals("The range 1 & 1 returns 1 when constrain is called with the value -6", 1.0, rangeFour.constrain(-6), 1.0000000001d);
	}
	
	@Test
	public void testConstrainPositiveOneReturnsPositiveOneForRangeFour() {
		
		assertEquals("The range 1 & 1 returns 1 when constrain is called with the value 6", 1.0, rangeFour.constrain(6), 1.0000000001d);
	}
	
	@Test
	public void testConstrainPositiveSixReturnsPositiveOneForRangeFour() {
		
		assertEquals("The range 1 & 1 returns 1 when constrain is called with the value 6", 1.0, rangeFour.constrain(6), 1.0000000001d);
	}
	
	/*
	 * ExpandToIclude Tests
	 *
	 * There was some confusion when it came to the interpretation of what this class should return.
	 * 
	 * The description states the class should "Return a range that includes all the values in the specified range AND contains the specified value."
	 * I would take that to mean a new range is returned with all the values of the old range plus the specified value
	 * 
	 * However, it also states under the return header "A range which spans over the input range, and has been expanded to contain the input value."
	 * This would mean the range has been expanded encompassing the values between the old range and the specified value. 
	 * For the purposes of these tests, and due to the fact that the modified java doc makes that distinction, while the old java doc simply states
	 * the method returns a range, means i am going with the second interpretation as that is what i believe is the intention
	 * .
	 */
	
	@Test
	public void testValueLessThanLBForRangeOne() {

		
		Range newRange = Range.expandToInclude(rangeOne, -6);		

		
		assertTrue("New Range is not expanded to include -6 ", newRange.contains(-6));
		
	}
	
	@Test
	public void testValueGreaterThanUBForRangeOne() {

		
		Range newRange = Range.expandToInclude(rangeOne, 10);		

		assertTrue("New Range is not expanded to include 10 ", newRange.contains(10));
	}
	
	@Test
	public void testValueAlreadyInTheRangeForRangeOne() {
		
		Range newRange = Range.expandToInclude(rangeOne, 1);
		assertEquals("New Range does not equal old range", rangeOne, newRange);
	}
	
	@Test
	public void testValueLessThanLBForRangeTwo() {

		
		Range newRange = Range.expandToInclude(rangeTwo, -6);		
	
		assertTrue("New Range is not expanded to include -6 ", newRange.contains(-6));
	}
	
	@Test
	public void testValueGreaterThanUBForRangeTwo() {

		
		Range newRange = Range.expandToInclude(rangeTwo, 10);		
	
		assertTrue("New Range is not expanded to include 10 ", newRange.contains(10));
	}
	
	@Test
	public void testValueAlreadyInTheRangeForRangeTwo() {
		
		Range newRange = Range.expandToInclude(rangeTwo, 1);
		assertEquals("New Range does not equal old range", rangeTwo, newRange);
	}
	
	@Test
	public void testValueLessThanLBForRangeThree() {

		
		Range newRange = Range.expandToInclude(rangeThree, -6);		
	
		assertTrue("New Range is not expanded to include -6 ", newRange.contains(-6));
	}
	
	@Test
	public void testValueGreaterThanUBForRangeThree() {

		
		Range newRange = Range.expandToInclude(rangeThree, 10);		
		
		assertTrue("New Range is not expanded to include 10 ", newRange.contains(10));
	}
	
	@Test
	public void testValueAlreadyInTheRangeForRangeThree() {
		
		Range newRange = Range.expandToInclude(rangeThree, -3);
		assertEquals("New Range does not equal old range", rangeThree, newRange);
	}
	
	@Test
	public void testValueLessThanLBForRangeFour() {

		
		Range newRange = Range.expandToInclude(rangeFour, -6);		
	
		assertTrue("New Range is not expanded to include -6 ", newRange.contains(-6));
	}
	
	@Test
	public void testValueGreaterThanUBForRangeFour() {

		
		Range newRange = Range.expandToInclude(rangeFour, 10);		
	
		assertTrue("New Range is not expanded to include 10 ", newRange.contains(10));
	}
	
	@Test
	public void testValueAlreadyInTheRangeForRangeFour() {
		
		Range newRange = Range.expandToInclude(rangeFour, 1);
		assertEquals("New Range does not equal old range", rangeFour, newRange);
	}
	
	@Test
	public void testNegativeValueInsertedIntoNullRange() {		
		Range newRange = Range.expandToInclude(null, -6);
		
		assertTrue("New Range is not expanded to include -6 ", newRange.contains(-6));
	}
	
	@Test
	public void testPositiveValueInsertedIntoNullRange() {		
		Range newRange = Range.expandToInclude(null, 10);
		
		assertTrue("New Range is not expanded to include 10 ", newRange.contains(10));
	}
}
