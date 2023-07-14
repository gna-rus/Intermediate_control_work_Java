import java.util.HashMap;
import java.util.LinkedList;

class ClassOfStore {
    private int count;
    private int num;
    private String nameToy; // название игрушки
   
   public ClassOfStore (int count, int num, String  nameToy)
  {
    this.count = count;
    this.num = num;
    this.nameToy = nameToy;
  }
  
  public int getCount ()
  {
    return count;
  }

  public void setCount (int count)
  {
    this.count = count;
  }
  
  
  public int getNum ()
  {
    return num;
  }

  public void setNum (int num)
  {
    this.num = num;
  }
  
  public String GetNameToy ()
  {
    return nameToy;
  }

  public void SetNameToy (String nameToy)
  {
    this.nameToy = nameToy;
  }

    @Override
    public String toString() {
        return ""
                + "id = " + count
                + ", weight = " + num
                + ", Name = " + nameToy + '.';
    }
    
    
    public LinkedList toLink() {
    LinkedList<String> toLinkToyStore = new LinkedList<>();
    // toLinkToyStore.add(String.valueOf(count));
    // toLinkToyStore.add(String.valueOf(num));
    toLinkToyStore.add(nameToy);
    return toLinkToyStore;
    }
}
