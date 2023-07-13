import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Task
{
     public static HashSet GenerateHashSet(int count)
    {
    HashSet < Object > ObjSet = new HashSet <> ();
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Введите вес выпадения: ");
    int numWeight = scanner.nextInt();
    
    System.out.println("Введите название игрушки: ");
    String nameToy = scanner.nextLine();
    
    ClassOfStore NoteBook1 = new ClassOfStore (count++, numWeight, nameToy);
    ObjSet.add (NoteBook1);
    return ObjSet;
    }
  
    public static void print_menu() {
        // Меню
        System.out.println("Меню фильтрации: \n1 - По названию ноутбука;\n2 - По ОС ноутбука;");
        System.out.println("3 - По цвету ноутбука; \n4 - Минимальным параметрам; \n5 - Очистить фильтр поиск;");
        System.out.println("6 - Выход.");
    }  
 
 
    public static void main (String[]args)
    {
    HashSet < Object > ObjSet1 = new HashSet <> ();
    print_menu();
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
