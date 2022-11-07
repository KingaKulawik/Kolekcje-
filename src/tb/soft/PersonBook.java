package tb.soft;
import java.util.*;


public class PersonBook {
//    private HashSet PersonHashSet;
//    private TreeSet PersonTreeSet;
//    private ArrayList PersonArrayList;
//    private LinkedList PersonLinkedList;

    private AbstractCollection book;

    public PersonBook(AbstractCollection collection) {
//        PersonHashSet=new HashSet();
//        PersonTreeSet=new TreeSet();
//        PersonArrayList=new ArrayList();
//        PersonLinkedList=new LinkedList();
        book = collection;
    }

    public void addToPersonBook(Person p){
        book.add(p);
    }

    public void deleteFromBook(Person p){
        book.remove(p);
    }

    public void  printBook(){
        String intro = "=================================\n" +
                       "Zawartosc biezacej kolekcji: \n"     ;
        for(Object p : book){
            // nieefektywne, ale trudno
            intro = intro + p.toString() + "\n";
        }
        intro += "=================================";

        // pozniej mozna zamiast print zrobic return
        System.out.println(intro);
    }
}
