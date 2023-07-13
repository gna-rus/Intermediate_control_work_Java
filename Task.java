import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.LinkedList;

public class Task
{
     public static ClassOfStore GenerateHashSet()
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
    
    return toyFromStore;
    }
  
    public static void print_menu() {
        // Меню
        System.out.println("Меню: \n1 - Новая игрушка;\n2 - Перечень всех игрушек;");
        System.out.println("3 - Провести розыгрыш; \n4 - Выход.");
    }  
    
    
    public static void print_all_toys(HashSet ObjSet1) {
        LinkedList<String> toLinkToyStore = new LinkedList<>();
        for (Object str1 : ObjSet1) {
            System.out.println(str1.toString());
        }
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
                    ObjSet1.add(GenerateHashSet());
                    continue;
                case 2:
                    print_all_toys(ObjSet1);
            }
    
    } 
}
}
