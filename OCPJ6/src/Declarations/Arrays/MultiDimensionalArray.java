
package Declarations.Arrays;

import java.util.Random;

public class MultiDimensionalArray {
	
	// THEORY
	// Java allows creation and use of multi-dimensional arrays, 
	//		with NO LIMIT on the number of dimensions
	// Multidimensional array is implemented as an ARRAY or ARRAYS
	//		So it is possible to re-assign one of the arrays
	//		such that it has a DIFFERENT size from the other arrays
	//		That is, each array does not have the same size

	public static void main(String[] args) {
		MultiDimensionalArray mda = new MultiDimensionalArray();

		// 1 DECLARATION - see below

		// 2 INSTANTIATION
		mda.InstantiateMultiDimensionalArray();

		// 3 IT IS POSSIBLE TO RE-DEFINE part of the array
		mda.ReallocateMultiDimensionalArray();

		mda.IterateThroughMultiDimensionalArrayWithForLoopAndIndexing(5,6,7);
		mda.IterateThroughMultiDimensionalArrayWithForEachLoop(6,3,3);

		mda.CreateMultiDimArrayWithDiffLengths();
	}

	// DECLARATION - creating a multi-dimensional array
	int[][] m_table;
	// static int s_table[][];

	public String toString() {
		String result = "table = \n";
		String padding= "        ";

		for (int[] row : m_table) {
			result += padding;
			for (int entry : row) {
				result += entry + " ";
			}
			result += "\n";
		}
		return result;
	}

	void InstantiateMultiDimensionalArray() {
		m_table = new int[5][4];
		System.out.println("Array is\n" + this);
	}

	void ReallocateMultiDimensionalArray() {
		// pick a row to extend, and a size for the new array / row
		int rowIndex = new Random().nextInt(m_table.length);
		m_table[rowIndex] = new int[ rowIndex ];

		System.out.println("Array reallocation using (index, size)=(" + rowIndex + ", " + rowIndex + ")");
		System.out.println("Array update to:\n" + this);
	}

	void IterateThroughMultiDimensionalArrayWithForLoopAndIndexing(int xDim, int yDim, int zDim) {
		int[][][] threeDShape = new int[xDim][yDim][zDim];

		// use nested for loops with indexes
		for (int x = 0; x < threeDShape.length; x++) {
			for (int y = 0; y < threeDShape[x].length; y++) {
				for (int z = 0; z < threeDShape[x][y].length; z++) {
					System.out.print(threeDShape[x][y][z] + "-");
				}
				System.out.println(" Z");
			}
			System.out.println(" Y");
		}
		System.out.println(" X");
	}

	void IterateThroughMultiDimensionalArrayWithForEachLoop(int xDim, int yDim, int zDim) {
		System.out.println("IterateThroughMultiDimensionalArrayWithForEachLoop(" + xDim + "," + yDim + ")");

		int[][][] threeDShape = new int[xDim][yDim][zDim];

		// use nested foreach loop
		for (int[][] xArray : threeDShape) {
			for (int[] yArray : xArray) {
				for (int zVal : yArray) {
					System.out.print(zVal + "-");
				}
				System.out.println(" Z");
			}
			System.out.println(" Y");
		}
	}

	void IterateThroughMultiDimArrayWithDiffLengths(int[][][] multiDimArray) {
		// use nested foreach loop
		System.out.println("Printing multidim array");

		for (int[][] xArray : multiDimArray) {
			//System.out.println("x");
			for (int[] yArray : xArray) {
				//System.out.println("y");
				for (int zVal : yArray) {
					System.out.print(zVal + "-");
				}
				System.out.println(" Z");
			}
			System.out.println(" Y");
		}
	}

	void CreateMultiDimArrayWithDiffLengths() {
		int[][][] threeLevels;

		int level3Size = new Random().nextInt(9);
		threeLevels = new int[level3Size][][];		
		
		for (int x = 0; x < level3Size; x++) {
			//System.out.println("level2");
			int level2Size = new Random().nextInt(9);
			threeLevels[x] = new int[level2Size][];

			for (int y = 0; y < level2Size ; y++) {
				//System.out.println("level1");
				int level1Size = new Random().nextInt(9);
				
				threeLevels[x][y] = new int[level1Size];
			}
		}
		
		IterateThroughMultiDimArrayWithDiffLengths(threeLevels);
	}
}