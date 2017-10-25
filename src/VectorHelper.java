import java.util.ArrayList;

public class VectorHelper {
/** 
 * crée un vecteur sous forme d'un arrayListe
*/	
public ArrayList<Integer> Vecteur;

/** 
 * déclarer un constructeur 
 */
public VectorHelper(){
	
	
	Vecteur=new ArrayList<Integer>();
	
                      }
/** 
 * Methode d'ajout d'un element
 * contien le paramétre :
 * @param value
 */
public void addVectElement(int value)
      {
	  Vecteur.add(value);
      }
/**
 * Methode Get d'un element on utilise son index
 * @param index
 * @return la valeur de l'élement 
 */

public int getElement(int index){
	return Vecteur.get(index);
}

/** 
 * Methode qui retourn la taille du vecteur
 * @return la taille du vecteur
 */

public int VectSize(){
	return Vecteur.size();
                     }

/** 
   * Methode d'affichage d'un vecteur
 */
public void Afficher(){
	System.out.println(Vecteur.toString());
                }

/** 
     * Methode de trie d'un vecteur
     * @author abdeslam 
 */      
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

/**
 *  methode qui réalise la Somme de deux vecteurs 
 *  @throws DiffrentSizeException si jamais la taille des deux vecteur n'est pas la même
 *  @param vl
 *  @author nacer
 */
public void somme (VectorHelper v1 ) throws DiffrentSizeException
{
VectorHelper result=new VectorHelper();
int i=0;

if(this.VectSize()!=v1.VectSize()) throw new DiffrentSizeException();

else
	
 for (i=0;i<v1.VectSize();i++)
 { 
    result.addVectElement(this.getElement(i)+v1.getElement(i));
 }
	
  this.Vecteur=result.Vecteur;
}


/**
 *  methode qui inverse le vecteur 
 */
public void VectInverser(){
    int temp;
	for(int i=0;i<Vecteur.size()/2;i++){
    	temp=Vecteur.get(i);
    	Vecteur.set(i,Vecteur.get(this.VectSize()-i-1));
    	Vecteur.set(this.VectSize()-i-1, temp);
    }
                          }
/** 
 * retourn le max des element de ce vecteur
 * @return l'element le plus grand dans ce vecteur 
 */
public int VectMax(){
	int m=this.Vecteur.get(0);	
	for(int i=1;i<this.VectSize();i++){
		if(Vecteur.get(i)>m) m=Vecteur.get(i);
	}
	return m;
}

/** 
 * retourn le minimum de ce vecteur
 * @return l'element le plus petit dans le vecteur
 */

public int VectMin(){
	int m=this.Vecteur.get(0);	
	for(int i=1;i<this.VectSize();i++){
		if(Vecteur.get(i)<m) m=Vecteur.get(i);
	}
	return m;
}

/**
 * multiplier le vecteur par un entier donner dans les paramétre de la methode
 * @param value
 */

public void VectMultiplication(int value){
	for(int i=0;i<this.VectSize();i++){
		this.Vecteur.set(i,Vecteur.get(i)*value);
	                                  }
	                                     }

/**
 * Methode qui teste si deux vecteur sont egaux 
 * @param v
 * @return vrai si son egaux faut sinon 
 * @see vectSize
 */
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