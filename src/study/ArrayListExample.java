package study;

import study.SystemExample.SystemExample;

import java.util.*;

/**
 * Created by ikocos on 11/03/2017.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();//기본 10개.

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("G");
        list.add(2, "E");
        list.set(3, "F");
        list.remove("G");
        list.remove(1);
        list.add("A");
        int num = list.size();
        for (int i = 0; i < num; i++) {
            String str = list.get(i);
            System.out.println(str);
        }
        int index1 = list.indexOf("A");
        int index2 = list.lastIndexOf("A");

        System.out.println("first: " + index1 + "/" + "last:" + index2);

       /* for(String str: list){
            System.out.println(str);
        }*/
        LinkedList<String> stringLinkedList = new LinkedList<String>();

        stringLinkedList.add("A1");
        stringLinkedList.add("A2");
        stringLinkedList.add("A3");
        stringLinkedList.add("A4");
        stringLinkedList.add("A5");
        stringLinkedList.add(2, "B1");
        stringLinkedList.set(4, "B2");
        stringLinkedList.remove(5);
        stringLinkedList.remove("A1");


        int length = stringLinkedList.size();

        for (int i = 0; i < length; i++) {
            String str = stringLinkedList.get(i);
            System.out.println(str);
        }

        System.out.println("===========");
        Iterator<String> iterator = stringLinkedList.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }

        System.out.println("===========");
        LinkedList<Integer> stack = new LinkedList<Integer>();

        stack.addLast(new Integer(10));
        stack.addLast(new Integer(9));
        stack.addLast(new Integer(8));

        while (!stack.isEmpty()) {
            Integer integer = stack.removeLast();
            System.out.println(integer);

        }
        System.out.println("===========");
        LinkedList<Integer> queue = new LinkedList<Integer>();

        queue.offer(new Integer(7));
        queue.offer(new Integer(6));
        queue.offer(new Integer(5));
        while (!queue.isEmpty()) {
            Integer integer = queue.poll();
            System.out.println(integer);
        }
        System.out.println("===========");
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("A1", new Integer(10));
        hashMap.put("A2", 20);
        hashMap.put("A3", 30);
        hashMap.put(new String("A1"), 30);

        Integer hashNum = hashMap.get("A1");

        System.out.println("A1:" + hashNum);


        System.out.println("===========");

        String obj1 = new String("Sky");
        String obj2 = new String("blue");
        int hash1 = obj1.hashCode();
        int hash2 = obj2.hashCode();
        System.out.println(hash1);
        System.out.println(hash2);

        System.out.println("===========");

        HashMap<Name, Integer> nameIntegerHashMap = new HashMap<Name, Integer>();

        nameIntegerHashMap.put(new Name("A", "B"), new Integer(10));
        nameIntegerHashMap.put(new Name("A", "C"), new Integer(20));
        nameIntegerHashMap.put(new Name("A", "D"), new Integer(30));


        Integer nameIdx = nameIntegerHashMap.get(new Name("A", "C"));

        System.out.println("AC:" + nameIdx);


        HashSet<String> hashSet = new HashSet<String>();
        long time1 = System.currentTimeMillis();

        while (hashSet.size() < 100000) {
            hashSet.add(Math.random() + "");
        }

        //System.out.println(hashSet.size());

        System.out.println("===========");
        Iterator<String> iterator1 = hashSet.iterator();
        while (iterator1.hasNext()) {
            // System.out.println( iterator1.next());
            iterator1.next();
        }
        long time2 = System.currentTimeMillis();
        System.out.printf("time: %d ms %n", time2 - time1);

        long time3 = System.currentTimeMillis();
        for (String str : hashSet) {
            System.out.println(str);

        }
        long time4 = System.currentTimeMillis();
        System.out.printf("time: %d ms %n", time4 - time3);
    }
}
