
public class Demo {

	public static void main(String[] args) {
	VectorHelper v1=new VectorHelper();
	VectorHelper v2=new VectorHelper();

	
	
	v1.addVectElement(1);
	v2.addVectElement(2);
	v1.addVectElement(1);
	v2.addVectElement(2);
	v1.addVectElement(1);
	v2.addVectElement(2);
	
	v2.Afficher();
	v1.Afficher();
	
	try
	{
	v1.somme(v2);
	}
	
	catch(DiffrentSizeException e)
	{
		
		System.out.println(e);
	}
    System.out.println("Somme des deux vecteurs: ");
	v1.Afficher();
			
	
	
	
	
	
	
	return;
	
	}

}
