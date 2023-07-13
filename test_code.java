
class ToyStore{
    
    private int ToyID; 
    private int WeightToy;
    private String NameToy; 


  public ToyStore (int ToyID, int WeightToy, String NameToy)
  {
    this.ToyID = ToyID;
    this.WeightToy = WeightToy;
    this.NameToy = NameToy;
  }
  
   public int getToyID()
  {
    return ToyID;
  }
  
  public void setToyID (int ToyID)
  {
    this.ToyID = ToyID;
  }
  
     public int getWeightToy()
  {
    return WeightToy;
  }
  
  public void setWeightToy (int WeightToy)
  {
    this.WeightToy = WeightToy;
  }
  
  
   public String getNameToy()
  {
    return NameToy;
  }
  
  public void setNameToy (String NameToy)
  {
    this.NameToy = NameToy;
  }
  
  
}


public class Task
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		ToyStore NoteBook1 = new ToyStore(1,2, "AAA");
		ToyStore NoteBook2 = new ToyStore(100,100, "AAA");
		
		
		System.out.println(NoteBook1.getToyID());
		NoteBook1.setToyID(2222);
		System.out.println(NoteBook1.getToyID());
		
		System.out.println(NoteBook1.getWeightToy());
		
		System.out.println(NoteBook1.getNameToy());
		
		System.out.println(NoteBook1.getWeightToy() + NoteBook2.getWeightToy());
		
	}
}
