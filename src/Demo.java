
public class Demo {

	public static void main(String[] args) {
	VectorHelper v1=new VectorHelper();
	VectorHelper v2=new VectorHelper();
	
	
	v1.addVectElement(4);
	v2.addVectElement(4);
	v1.addVectElement(1);
	v2.addVectElement(1);
	v1.addVectElement(3);
	v2.addVectElement(1);
	
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
    
	v1.Afficher();
			
	
	
	
	
	
	
	return;
	
	}

}
