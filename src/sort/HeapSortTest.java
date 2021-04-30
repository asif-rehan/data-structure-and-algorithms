package sort;


class HeapSortTest {

	@Test
	void testBuildMinHeap() {
		HeapSort heapSort = new HeapSort(new int[] {4,1,3,2,16,9,10,14,8,7});
		heapSort.buildMinHeap();
		assertArrayEquals(new int[] {16,14,10,8,7,9,3,2,4,1}, heapSort.heap);
		
	}
	@Test
	void testHeapSort() {
		HeapSort heap = new HeapSort(new int[] {4,1,3,2,16,9,10,14,8,7});
		int[] sorted = heap.sort();
		assertArrayEquals(new int[] {1,2,3,4,7,8,9,10,14,16}, sorted);
	}

}
