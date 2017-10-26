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
 * ex: this.Vecteur=(1,2,3) => this.addVectElement(4) = (1,2,3,4)
 * @param value valeur de l'element a ajouter au vecteur
 */
public void addVectElement(int value)
      {
	  Vecteur.add(value);
      }
/**
 * Methode Get d'un element on utilise son index
 * @param index l'index de l'element qu'on veut consulter
 * @return la valeur de l'élement 
 */

public int getElement(int index){
	return Vecteur.get(index);
}

/** 
 * Methode qui retourn la taille du vecteur
 * @return la taille du vecteur
 * ex: this.Vecteur=(1,2,3) => this.getElement(2)=2
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
     * ex: this.Vecteur=(3,1,2) => this.Trie()=(1,2,3)
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
 *  @param vl vecteur qu'on somme avec l'objet qui appele la methode somme.
 *  ex: this.Vecteur=(1,1,1) v1.Vecteur=(2,2,2) => this.somme(v1)=(3,3,3)
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
 *  ex: this.vecteur=(1,2,3) => this.VectInverser()=(3,2,1)
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
 * ex: this.vecteur=(1,2,3) => this.VectMax()=3
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
 * ex:this.vecteur=(1,2,3) => this.VectMin()=1
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
 * @param value valeur par laquelle on multiplie le vecteur 
 * ex: this.vecteur=(1,1,1) value=2 => this.VectMultiplication(2)==(2,2,2)
 */

public void VectMultiplication(int value){
	for(int i=0;i<this.VectSize();i++){
		this.Vecteur.set(i,Vecteur.get(i)*value);
	                                  }
	                                     }

/**
 * Methode qui teste si deux vecteur sont egaux 
 * @param v le vecteur qu'on compre a notre objet courant
 * @return vrai si son egaux faut sinon 
 * @see vectSize
 * ex: v.vecteur=(1,2,1) this.vecteur=(2,3,4) => this.equals(v)==false
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