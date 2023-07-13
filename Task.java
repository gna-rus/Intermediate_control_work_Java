import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Task
{
     public static HashSet GenerateHashSet()
    {
    HashSet < Object > ObjSet = new HashSet <> ();
    
    int numId = 0;
    System.out.println("Введите вес выпадения: ");
    Scanner scanner = new Scanner(System.in);
    int numWeight = scanner.nextInt();
    
    System.out.println("Введите название игрушки: ");
    Scanner scanner1 = new Scanner(System.in);
    String nameToy = scanner1.nextLine();
    
    ClassOfStore toyFromStore = new ClassOfStore (numId, numWeight, nameToy);
    ObjSet.add (toyFromStore);
    System.out.println(toyFromStore.toLink());
    
    return ObjSet;
    }
  
    public static void print_menu() {
        // Меню
        System.out.println("Меню: \n1 - Новая игрушка;\n2 - Провести розыгрыш;");
        System.out.println("3 - Выход.");
    }  
 
 
    public static void main (String[]args)
    {
    HashSet < Object > ObjSet1 = new HashSet <> ();
    Scanner scanner = new Scanner(System.in);
    print_menu();
    int count = 0;
     int num = 0;
        while (true) {
            System.out.print("Введите число: ");
            num = scanner.nextInt();
            if (num == 3){break;}
            switch (num) {
                case 1:
                    ObjSet1 = GenerateHashSet();
                    continue;
            }
    
    } 
}
}
