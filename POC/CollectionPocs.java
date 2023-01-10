import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionPocs {

    public static void main(String[] args) {


/*       Iterable ->
        this is the parent interface of all collection
                1. Interface
                2. contain 3 methods default "forEach", default "Spliterator" and abstrect "iterator";
                3. extend by Collection "public interface Collection<E> extends Iterable<E> {"


        Collection->
                1 Interface
                2 root interface of collections
                3 contain mutipal methods
                4 not support primitive datatype
                5 only support the user defines and wapper class opjects
 */
        Collection<Integer> collectionInteger = new ArrayList<>();

        collectionInteger.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 90, 20, 10, 30, 50, 40, 60, 20, 30, 60));

        Collection<Integer> collectionInteger1 = new ArrayList<>();
        collectionInteger1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 90, 20, 10, 30, 50, 40, 60, 20, 30, 60));

//        Collection<Integer> collectionString= Arrays.asList(       );


//        1  add(Object); ->This method is used to add an object to the collection.

        System.out.print("boolean add(E e) : ");
        System.out.println(collectionInteger.add(50));

//       addAll(Collection c) -> This method adds all the elements in the given collection to this collection.

        System.out.print(" boolean addAll(Collection c) : ");
        System.out.println(collectionInteger.addAll(Arrays.asList(44, 55, 66, 77)));

//      void clear() This method removes all of the elements from this collection.
        System.out.print(" void clear()  : ");
//       void collectionInteger.clear();
        System.out.println(collectionInteger);
//    boolean contains(Object o) This method returns true if the collection contains the specified element.

        System.out.print(" boolean contains(Object o) : ");
        System.out.println(collectionInteger.contains(20));
        System.out.println(collectionInteger.contains(111));

//       boolean containsAll(Collection c) This method returns true if the collection contains all of the elements in the given
//        collection.
        System.out.print(" boolean contains(Object o) : ");
        System.out.println(collectionInteger.containsAll(Arrays.asList(50, 60, 20, 30)));
        System.out.println(collectionInteger.containsAll(Arrays.asList(11, 222, 333, 555, 74, 6)));

//      boolean  equals(Object o) This method compares the specified object with this collection for equality.
        System.out.print(" boolean equals(Object o) : ");
        System.out.println(collectionInteger.equals(collectionInteger1));

//      int hashCode() This method is used to return the hash code value for this collection.
        System.out.print(" int hashCode() : ");
        System.out.println(collectionInteger.hashCode());

//       boolean isEmpty() This method returns true if this collection contains no elements.

        System.out.print(" boolean isEmpty() : ");
        System.out.println(collectionInteger.isEmpty());

 //        iterator() This method returns an iterator over the elements in this collection.

        System.out.print("  iterator() : ");
        System.out.println(collectionInteger.iterator().hasNext());
        System.out.println(collectionInteger.iterator().next());
        System.out.println(collectionInteger);





//        iterator() This method returns an iterator over the elements in this collection.
//                max() This method is used to return the maximum value present in the collection.
//        parallelStream() This method returns a parallel Stream with this collection as its source.
//        remove(Object o) This method is used to remove the given object from the collection.If there are duplicate
//        values, then this method removes the first occurrence of the object.
//        removeAll(Collection c) This method is used to remove all the objects mentioned in the given collection from the
//        collection.
//                removeIf(Predicate filter) This method is used to remove all the elements of this collection that
//        satisfy the given predicate.
//        retainAll(Collection c) This method is used to retain only the elements in this collection that are contained
//        in the specified collection.
//        size() This method is used to return the number of elements in the collection.
//        spliterator() This method is used to create a Spliterator over the elements in this collection.
//                stream() This method is used to return a sequential Stream with this collection as its source.
//        toArray() This method is used to return an array containing all of the elements in this collection.
//
//
//
//


    }


}


class Student {

    private Integer id;
    private String name;
    private String address;

    public Student(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
