import static org.junit.Assert.*;

import org.junit.Test;


public class VectorHelperTest {

	@Test
	public void testAddVectElement() {
		VectorHelper vect = new VectorHelper ();
		vect.addVectElement(5);
		
		assertTrue(vect.getElement(0)==5);
		
		
	}

	@Test
	public void testVectSize() {
		VectorHelper vect = new VectorHelper ();
		vect.addVectElement(4);
		vect.addVectElement(2);
		
		assertTrue(vect.VectSize()==2);
	}

	@Test
	public void testTrie() {
		VectorHelper vect = new VectorHelper ();
		vect.addVectElement(4);
		vect.addVectElement(2);
		vect.addVectElement(8);
		vect.addVectElement(3);
		vect.addVectElement(15);
		
		vect.Trie();
		
		VectorHelper vect2 = new VectorHelper ();
		vect2.addVectElement(2);
		vect2.addVectElement(3);
		vect2.addVectElement(4);
		vect2.addVectElement(8);
		vect2.addVectElement(15);
		
		assertTrue(vect.equals(vect2));
		
	}

	@Test
	public void testSomme() {
		VectorHelper vect = new VectorHelper ();
		vect.addVectElement(4);
		vect.addVectElement(2);
		vect.addVectElement(8);
		vect.addVectElement(3);
		vect.addVectElement(15);
		
		VectorHelper vect2 = new VectorHelper ();
		vect2.addVectElement(15);
		vect2.addVectElement(3);
		vect2.addVectElement(8);
		vect2.addVectElement(2);
		vect2.addVectElement(4);
		
		try{
			vect.somme(vect2);
		}catch(DiffrentSizeException e){
			
			System.out.println(e);
			
		}
		VectorHelper vect3 = new VectorHelper ();
		vect3.addVectElement(19);
		vect3.addVectElement(5);
		vect3.addVectElement(16);
		vect3.addVectElement(5);
		vect3.addVectElement(19);
		
		
		
		assertTrue(vect.equals(vect3));
		
	}

	@Test
	public void testVectInverser() {
		VectorHelper vect = new VectorHelper ();
		vect.addVectElement(4);
		vect.addVectElement(2);
		vect.addVectElement(8);
		vect.addVectElement(3);
		vect.addVectElement(15);
		
		vect.VectInverser();
		
		VectorHelper vect2 = new VectorHelper ();
		vect2.addVectElement(15);
		vect2.addVectElement(3);
		vect2.addVectElement(8);
		vect2.addVectElement(2);
		vect2.addVectElement(4);
		
		assertTrue(vect.equals(vect2));
	}

	@Test
	public void testVectMax() {
		VectorHelper vect = new VectorHelper ();
		vect.addVectElement(4);
		vect.addVectElement(2);
		vect.addVectElement(8);
		vect.addVectElement(3);
		vect.addVectElement(15);
		
		assertTrue(vect.VectMax()==15);
	}

	@Test
	public void testVectMin() {
		VectorHelper vect = new VectorHelper ();
		vect.addVectElement(4);
		vect.addVectElement(2);
		vect.addVectElement(8);
		vect.addVectElement(3);
		vect.addVectElement(15);
		
		assertTrue(vect.VectMin()==2);
	}

	@Test
	public void testVectMultiplication() {
		VectorHelper vect = new VectorHelper ();
		vect.addVectElement(4);
		vect.addVectElement(2);
		vect.addVectElement(8);
		vect.addVectElement(3);
		vect.addVectElement(15);
		
		vect.VectMultiplication(2);
		
		VectorHelper vect2 = new VectorHelper ();
		vect2.addVectElement(8);
		vect2.addVectElement(4);
		vect2.addVectElement(16);
		vect2.addVectElement(6);
		vect2.addVectElement(30);
		
		assertTrue(vect.equals(vect2));
	}

	@Test
	public void testEqualsObject() {
		VectorHelper vect = new VectorHelper ();
		vect.addVectElement(4);
		vect.addVectElement(2);
		vect.addVectElement(8);
		vect.addVectElement(3);
		vect.addVectElement(15);
		
		
		
		VectorHelper vect2 = new VectorHelper ();
		vect2.addVectElement(8);
		vect2.addVectElement(4);
		vect2.addVectElement(16);
		vect2.addVectElement(6);
		vect2.addVectElement(30);
		
		assertTrue((vect.equals(vect))&&(!(vect.equals(vect2))));
		
	}

}
