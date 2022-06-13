

import org.junit.Test;
import static org.junit.Assert.*;

public class MyArraysTest {
    
    MyArrays a = new MyArrays();
  

	@Test
	public void testSum2DArray() 
        {
            int[][]nums={{1,2,3},{4,5,6}};
            assertEquals(a.sum2DArray(nums), 21);
            int[][]nums2={{1,0,1},{4,1,4},{0,8,4},{2,3,7}};
            assertEquals(a.sum2DArray(nums2), 35);    
            int[][]nums3={{1,14,0,1},{4,22,1,4},{51,0,8,4}};
            assertEquals(a.sum2DArray(nums3), 110);    
	}
    @Test
	public void testfindLargest() 
        {
            int[][]nums={{1,2,3},{4,5,6}};
            assertEquals(a.findLargest(nums), 6);
            int[][]nums2={{1,0,1},{4,1,4},{0,8,4},{2,3,7}};
            assertEquals(a.findLargest(nums2), 8);    
            int[][]nums3={{1,14,0,1},{4,22,1,4},{51,0,8,4}};
            assertEquals(a.findLargest(nums3), 51);    
	}
         @Test
	public void testSumArrays() 
        {
            int[][] b = {{1,2,3},{4,5,6}};
            int[][] c = {{1,2,3},{7,8,9}};
            int[][] d = {{2,4,6},{11,13,15}};
            assertArrayEquals( a.sumArrays(b, c), d );
            int[][] e = {{1,0,1},{4,1,4},{0,8,4},{2,3,7}};
            int[][] f = {{7,2,62},{41,-5,11},{0,-12,31},{22,13,-27}};
            int[][] g = {{8,2,63},{45,-4,15},{0,-4,35},{24,16,-20}};
            assertArrayEquals( a.sumArrays(e, f), g );
	}
            @Test
	public void testEraseEvens()
        {
            int[][] b = {{1,2,3},{4,5,6}};
            int[][] c = {{1,0,3},{0,5,0}};
            assertArrayEquals( a.eraseEvens(b), c );
         
            int[][] d = {{7,2,62},{41,-5,11},{0,-12,31},{22,13,-27}};
            int[][] e = {{7,0,0},{41,-5,11},{0,0,31},{0,13,-27}};
            assertArrayEquals( a.eraseEvens(d), e );
	}
          @Test
	public void testisCheckMate() 
        {
            char[][] b = {  {'N','N','Q','N','N','N','N','N'},
                            {'N','N','N','K','N','Q','N','N'},
                            {'N','N','N','N','N','N','N','N'},
                            {'N','N','N','N','N','N','Q','N'},
                            {'N','N','N','N','N','N','N','N'},
                            {'N','N','N','N','N','N','N','N'},
                            {'N','N','N','N','N','N','N','N'},
                            {'N','Q','N','N','N','N','N','N'}};
           
           assertEquals(a.isCheckmate(b), false); 
           
           char[][] d = {   {'N','N','Q','N','N','N','N','N'},
                            {'N','N','N','K','N','Q','N','N'},
                            {'N','N','N','N','N','N','N','N'},
                            {'N','N','N','N','N','N','Q','N'},
                            {'N','Q','N','N','N','N','N','N'},
                            {'N','N','N','N','N','N','N','N'},
                            {'N','N','N','N','N','N','N','N'},
                            {'N','Q','N','N','N','N','N','N'}};
           
           assertEquals(a.isCheckmate(d), true); 
           
           char[][] c = {   {'N','N','N','N','N','N','N','N'},
                            {'Q','N','N','N','N','N','N','N'},
                            {'N','N','N','N','N','N','N','N'},
                            {'N','N','N','N','N','N','N','N'},
                            {'N','N','N','N','N','N','N','N'},
                            {'N','N','N','N','N','N','N','N'},
                            {'N','Q','N','N','N','N','N','N'},
                            {'N','N','N','N','N','N','N','K'}};
           
           assertEquals(a.isCheckmate(c), true); 
           
           
	}
}