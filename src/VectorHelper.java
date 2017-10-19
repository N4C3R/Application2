import java.util.ArrayList;

public class VectorHelper {
/** ArrayList contenant les elements du vecteur */	
public ArrayList<Integer> Vecteur;

/** Constructeur */
public VectorHelper(){
	
	
	Vecteur=new ArrayList<Integer>();
                      }
/** Methode d'ajout d'un element*/
public void addVectElemnt(int value)
      {
	  Vecteur.add(value);
      }

/**Methode d'affichage d'un vecteur*/
public void Afficher(){
	System.out.println(Vecteur.toString());
                }

/**Methode de trie d'un vecteur*/      
public void Trie(){
	for(int i=0;i<Vecteur.size()-1;i++){
	   for(int j=i+1;j<Vecteur.size();j++){
		   if(Vecteur.get(i)>Vecteur.get(j)) {
			    int temp=Vecteur.get(i);
			    Vecteur.set(i,Vecteur.get(j));
			    Vecteur.set(j,temp);
		                                     }
		   
	                                      }
	                                   }
                  }
/**Methode Get d'un element par son index */

public int getElemnt(int index){
	return Vecteur.get(index);
}

/** Methode retournant la taille du vecteur */

public int VectSize(){
	return Vecteur.size();
                     }

/**Methode equals */
@Override
public boolean equals (Object V)  { 
	boolean s=false;
	if (V instanceof VectorHelper ) { 
		VectorHelper n =(VectorHelper)V;
		if (this.VectSize()==n.VectSize()) {
		s=true ;
		for(int i=0;i<this.VectSize();i++){
		
		  if (!(this.Vecteur.get(i)== n.Vecteur.get(i))) { s=false ;break ; }  
	                                   }
	}
	}
	return s ;
}
}