import java.util.HashMap;
public class ClassOfStore {
    private int count;
    private int num;
    private String nameToy; // название игрушки
   
   public ClassOfStore (int count, int num, String  nameToy)
  {
    this.count = count;
    this.num = num;
    this.nameToy = nameToy;
  }
  
  public int count ()
  {
    return count;
  }

  public void count (int count)
  {
    this.count = count;
  }
  
  
  public int num ()
  {
    return num;
  }

  public void num (int num)
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
    //   String weightF = String.format("%.2f", weight);
    //   String priceF = String.format("%.2f", price);
        return "NoteBookClass{"
                + "Name = '" + nameToy + '\''
                + '}';
    }
    

    
}
