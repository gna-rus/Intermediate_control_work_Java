import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class Task {
    // Фунция заполнения Класса
    public static ClassOfStore GenerateHashSet(int numId) {
        System.out.println("Введите вес выпадения: ");
        Scanner scanner = new Scanner(System.in);
        int numWeight = scanner.nextInt();

        System.out.println("Введите название игрушки: ");
        Scanner scanner1 = new Scanner(System.in);
        String nameToy = scanner1.nextLine();

        Random random = new Random();
        int rndQuantityInStock = random.nextInt(12) + 5;
        System.out.printf("Количество %s на складе: %d \n", nameToy, rndQuantityInStock);

        ClassOfStore toyFromStore = new ClassOfStore(numId, numWeight, nameToy, rndQuantityInStock);
        toyFromStore.setCount(numId);
        toyFromStore.setNum(numWeight);
        toyFromStore.SetNameToy(nameToy);
        toyFromStore.setQuantity(rndQuantityInStock);
        //System.out.println(toyFromStore.getNum());
        return toyFromStore;
    }

    // Меню
    public static void print_menu() {

        System.out.println("Меню: \n1 - Новая игрушка;\n2 - Перечень всех игрушек;");
        System.out.println("3 - Провести розыгрыш; \n4 - Запись в файл результатов;");
        System.out.println("5 - Изменить вес игрушки; \n6 - Выход.");
    }

    public static void print_all_toys(LinkedList ObjSet1) {

        for (Object str1 : ObjSet1) {
            System.out.println(str1.toString());
        }
    }

    // функция генерации Link
    public static LinkedList generatorOfLink(String Toy) {
        LinkedList<String> toLinkToyStore = new LinkedList<>();
        toLinkToyStore.add(generatorOfElem(Toy, "id"));
        toLinkToyStore.add(generatorOfElem(Toy, "weight"));
        toLinkToyStore.add(generatorOfElem(Toy, "Name"));
        toLinkToyStore.add(generatorOfElem(Toy, "quantity_in_stock"));
        return toLinkToyStore;
    }

    // функция поиска элемента в строке через определение индексов
    public static String generatorOfElem(String Toy, String Elem) {
        int firstIndex = FindFirstIndexOf(Toy, Elem);
        int finalIndex = firstIndex + Elem.length() + 2;
        String elem = FindLastIndexOf(Toy, finalIndex);
        return elem.trim();
    }

    // поиск первого индекса подстроки в строке
    public static int FindFirstIndexOf(String BigStr, String SmallStr) {
        int index = BigStr.lastIndexOf(SmallStr);
        return index;
    }

    // функция поиска значения параметра через индексы строки
    public static String FindLastIndexOf(String BigStr, int StartIndex) {
        String word = "";
        for (int i = StartIndex + 1; i < BigStr.length(); i++) {

            char char1 = BigStr.charAt(i);
            if ((char1 != ',') & (char1 != '.')) {
                word += char1;
            } else {
                break;
            }
        }
        return word;
    }

    //////////////////////
    // функция розыгрыша приза (будет осуществляться через массив)
    public static String make_calkulation(LinkedList ObjSet1) {
        LinkedList<String> toLinkToy = new LinkedList<>();
        int lengthWeight = 0;
        for (Object str1 : ObjSet1) {
            toLinkToy = generatorOfLink(str1.toString()); // запускается алгоритм перевода строки в LinkedLink
            lengthWeight += Integer.parseInt(toLinkToy.get(1));
        }
        String[] arrRoulette = new String[lengthWeight]; // массив-рулекта
        arrRoulette = arrFill(ObjSet1, arrRoulette); // заполняю массиву-рулетку названиями игрушек
        String elem = arrRandomElem(arrRoulette); // через рандом определяю победителя
        System.out.println("Игрушка победитель: " + elem);
        return elem;

    }

    //функция заполнения массива названиями игрушек
    public static String[] arrFill(LinkedList ObjSet1, String[] arrRoulette) {
        int count = 0;
        LinkedList<String> toLinkToy = new LinkedList<>();
        for (Object str1 : ObjSet1) {
            toLinkToy = generatorOfLink(str1.toString());
            for (int i = 0; i < Integer.parseInt(toLinkToy.get(1)); i++) {
                arrRoulette[count] = toLinkToy.get(2);
                count++;
            }
        }
        return arrRoulette;
    }

    // функция извлечение случайного элемента из массива-рулетки
    public static String arrRandomElem(String[] arrRoulette) {
        Random random = new Random();
        int randomIndex = random.nextInt(arrRoulette.length);
        return arrRoulette[randomIndex];
    }

    // Функция записи результата в файл
    public static void work_with_PriorityQueue(PriorityQueue ObjSet1) {
        for (Object elem : ObjSet1) {
            System.out.println(elem);
        }

        try (FileWriter writer = new FileWriter("result.txt", false)) {
            for (Object elem : ObjSet1) {
                // запись всей строки
                writer.write(elem.toString() + "\n");

                writer.flush(); // очистить буфер без прерывания сессии программы
            }
        }
        // если не получилось записать то выдает ошибку в консоль без прерывания сессии
        catch (IOException ex) {

            System.out.println("Error!!!\n" + ex.getMessage());
        }
    }

    // Функция изменения веса игрушки
    public static void changeWeightToy(LinkedList ObjSet1) {
        LinkedList<String> LinkToyStore = new LinkedList<>();
        System.out.println("Изменить вес игрушки");
        for (Object elem : ObjSet1) {
            LinkToyStore = generatorOfLink(elem.toString());
            System.out.println(LinkToyStore.get(2));
        }
    }

    // Функция изменения количества игрушек на скоале
    public static void changeQuantityToy(LinkedList ObjSet1, String Toy) {
        LinkedList<String> LinkToyStore = new LinkedList<>(); // генерирую коллекцию
        LinkedList<String> LinkToyStore2 = new LinkedList<>();

        for (Object elem : ObjSet1) {
            LinkToyStore = generatorOfLink(elem.toString());// делаю LinkedList каждого обьекта класса
            for (String elem1 : LinkToyStore) { // в каждома обьекте класса ищу необходимое название игрушки
                if (elem1.equals(Toy)) {
                    LinkToyStore2.add(Integer.toString(Integer.parseInt(elem1) - 1)); // изменяю количество
                }
                else {LinkToyStore2.add(elem1);}
            }
        }
        // создаю новый образец класса с новыми параметрами
        ClassOfStore toyFromStore = new ClassOfStore(Integer.parseInt(LinkToyStore2.get(0)), Integer.parseInt(LinkToyStore2.get(1)), LinkToyStore2.get(2), Integer.parseInt(LinkToyStore2.get(3)));
    }


    public static void main(String[] args) {

        LinkedList<ClassOfStore> ObjSet1 = new LinkedList<>();
        PriorityQueue<String> PriorityQueueResult = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        print_menu();
        int count = 1;
        int num = 0;
        while (true) {

            System.out.print("Введите число: ");
            num = scanner.nextInt();
            if (num == 6) {
                break;
            }
            switch (num) {
                case 1:
                    ObjSet1.addFirst(GenerateHashSet(count++));
                    continue;
                case 2:
                    print_all_toys(ObjSet1);
                    continue;
                case 3:
                    PriorityQueueResult.add(make_calkulation(ObjSet1));// провожу лотырею и записываю результат в Очередь
                    continue;
                case 4:
                    work_with_PriorityQueue(PriorityQueueResult);// передаю очередь для записи в файл
                    continue;
                case 5:
                    changeWeightToy(ObjSet1);// передаю очередь для записи в файл
                    break;

            }

        }
    }
}
