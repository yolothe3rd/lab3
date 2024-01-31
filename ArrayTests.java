import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test public void testRIP1() {
    int[] input1 = {1, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3, 1}, input1);
  }
  
  @Test
  public void testRIP2() {
    int[] input1 = {1, 3, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 3, 1}, input1);
  }
  @Test
  public void testRIP3() {
    int[] input1 = {1, 3, 5, 7};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{7, 5, 3, 1}, input1);
  }
  @Test
  public void testRIP4() {
    int[] input1 = { };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ }, input1);
  }
  
  @Test
  public void testR1(){
    int[] input1 = {1};
    assertArrayEquals(new int[]{1}, ArrayExamples.reversed(input1));
  }
  @Test
  public void testR2(){
    int[] input1 = {1, 3};
    assertArrayEquals(new int[]{3, 1}, ArrayExamples.reversed(input1));
  }
  @Test
  public void testR3(){
    int[] input1 = {1, 3, 5};
   
    assertArrayEquals(new int[]{5, 3, 1},  ArrayExamples.reversed(input1));
  }
  

}
