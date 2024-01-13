package our_arraylist;

public class Main {
    public static void main(String[] args) {

    OurList <String> list1 = new OurArrayList<>();

        list1.append("A");
        list1.append("B");
        list1.append("C");
        list1.append("D");

        System.out.println(list1.size());
        System.out.println(list1.get(3));
        System.out.println(list1.removeByID(3));
        System.out.println(list1.remove("C"));


        OurList <Integer> list2 = new OurArrayList<>();

        list2.append(35);
        list2.append(4);
        list2.append(98);
        list2.append(2);
        System.out.println(list2.size());
        System.out.println(list2.get(0));
        System.out.println(list2.removeByID(3));
        System.out.println(list2.remove(4));

    }
}
