package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	 private int nrOfLegs;
	 private String Name;
	 
	 public int getNrOfLegs(){
		 return nrOfLegs;
	 }
	 public void setNrOfLegs(int nrOfLegs){
		 this.nrOfLegs = nrOfLegs;
		 
	 }
	 public String getName(){
		 return Name;
	 }
	 public void setName(String Name){
		 this.Name = Name;
	 }
}
