package mg;



import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Person> phoneBook = new ArrayList<>();
        List<String> findList = new ArrayList<>();

        Converter converter = new Converter();
        converter.convertDirectoryFromString(phoneBook);
        converter.convertFindListFromString(findList);

        Search search = new Search();
        System.out.println("Start searching (linear search)...");

        search.linearSearch(phoneBook, findList, true);
        System.out.println();
        Sort sort = new Sort();
        System.out.println("Start searching (bubble sort + jump search)...");
        sort.bubbleSort(phoneBook, findList);
        System.out.println();

        System.out.println("Start searching (quick sort + binary search)...");
        sort.startQuickSort(phoneBook, findList, 0, phoneBook.size() - 1);
        System.out.println();

        System.out.println("Start searching (hash table)");
        search.addAndFindInHashMap(phoneBook, findList);


    }
}

