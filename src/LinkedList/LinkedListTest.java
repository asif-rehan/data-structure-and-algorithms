package practiceJava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListTest {
	LinkedListNode head;
	
	@BeforeEach
	void setUp() throws Exception {
		head = new LinkedListNode(0);
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testLinkedListNode() {
		assertTrue(head.data==0);
	}

	@Test
	void testAppedToEnd() {
		head.appedToEnd(6);
		assertTrue(head.next.data==6);
	}

	@Test
	void testDeleteNode() {
		head.appedToEnd(80);
		head.deleteNode(6);
		assertTrue(head.next.data==80);	
	}
	@Test
	void testDeleteNodeFirst() {
		head = head.deleteNode(0);
		assertTrue(head==null);
	}

}
