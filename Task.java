import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Task
{
     public static HashSet GenerateHashSet(int count)
    {
    HashSet < Object > ObjSet = new HashSet <> ();
    System.out.print("Введите id: ");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    String nameToy = scanner.nextLine();
    ClassOfStore NoteBook1 = new ClassOfStore (count++, num, nameToy);
    ObjSet.add (NoteBook1);
    return ObjSet;
    }
  
 
 
    public static void main (String[]args)
    {
    HashSet < Object > ObjSet1 = new HashSet <> ();
    //ObjSet1 = GenerateHashSet ();
    int count = 0;
    int num = 0;
        while (true) {
            System.out.print("Введите число: ");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            if (num == 6){break;}
            switch (num) {
                case 1:
                    ObjSet1 = GenerateHashSet(count);
                    continue;
            }
    
    } 
}
}
