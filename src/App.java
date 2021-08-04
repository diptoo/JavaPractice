import java.lang.ref.Cleaner.Cleanable;
import java.util.*;

import TestClassFolder.*;

public class App {
    static int a = 10;
    static int b = 20;

    public static void swapNumber() {
        a = 20;
        b = 10;
    }

    public static void arrayPractise(int[] arr) {
        arr[2] = 10;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int val : arr) {
            System.out.println(val);
        }
    }

    public static void main(String[] args) throws Exception {
        // FROM PEPCODING WEBSITE

        // abc.java ->(java compier) -> abc.class(Intermediate Language) -> machine code
        // by JVM on runtime based on machine os(mac/linux/windows)
        // abc.class (not abc.java because don't want to show the source code) can be
        // run for all os
        // JDK compiles the java program/code
        // dev machine jdk, client machine jvm
        // for c++ abc.cpp-> abc.exe (not in run time) only for windows

        // INPUT
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // System.out.println(n);

        // Variable
        // Number data type - byte-1 short-2 int-4 long-8
        // char --2
        // float
        // double
        // bool
        // no pointer or reference in java, static can be used
        // swapNumber();
        // System.out.println(a+" "+b);

        // 1D ARRAY
        // pass function using reference, function a array te change korle all change
        // hoy

        // int[] arr = new int[5];//array declare
        // arr[0] = 10;
        // arr[1] = 20;

        // arrayPractise(arr);

        // 2D array
        // int[][] arr = new int[2][3];

        // arr[0][1] = 1;

        // for (int i = 0; i < arr.length; i++)// row
        // {
        // for (int j = 0; j < arr[i].length; j++)// column
        // {
        // System.out.println(arr[i][j]);
        // }
        // }

        // ARRAY LIST
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1); // insert new element in the end
        // list.add(2);
        // list.add(3);
        // list.add(1,5);//index insert in between not update
        // System.out.println(list + " -> " + list.size());

        // //get value by index
        // int val = list.get(1); // not list[1]

        // //set value by index
        // list.set(1, 6); // not list[1] = 6
        // System.out.println(list + " -> " + list.size());

        // // remove by index
        // list.remove(1);
        // System.out.println(list + " -> " + list.size());

        // for(int item:list)
        // {
        // System.out.println(item);
        // }

        // STACK
        // Stack<Integer> stack = new Stack<>();
        // push
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println(stack);
        // peek - returns top value but doesn't remove
        // System.out.println(stack.peek());
        // System.out.println(stack);
        // pop - returns top value and removes as well. in c++ pop() only removes top
        // element does not return top value
        // System.out.println(stack.pop());
        // System.out.println(stack);

        // QUEUE
        // ArrayDeque<Integer> queue = new ArrayDeque<>();
        // queue.addLast(100);
        // queue.addLast(200);
        // queue.addLast(300);
        // System.out.println(queue.getFirst());
        // System.out.println(queue.removeFirst());

        // System.out.println(queue + " size is " + queue.size());

        // String
        // length
        // char at, read char and print for loop
        // setchar no
        // substring-(1,1), (2,1) 1 param (2) abcd->cd
        // all substring print using two for loops
        // string concat with char & integer
        // int+string
        // string+int
        // split

        // String str = "Hello world hi";
        // System.out.println(str.length());

        // for (int i = 0; i < str.length(); i++) {
        // System.out.println(str.charAt(i));
        // }

        // System.out.println(str.substring(0, 2));
        // System.out.println(str.substring(2));

        // System.out.println(str + 10 + 20);
        // System.out.println(10 + 20 + str);

        // String[] splitString = str.split(" ");
        // for(String s:splitString)
        // {
        // System.out.println(s);
        // }

        // INTERNING
        // diff - s1,s2 = "hello", s3 = new("hello") interpool, space save
        // compare - diff equals (use this) vs == => s1, s2 returns true but s1,s3
        // returns false
        // equals first check address. if not same then check char by char (s1,s3).
        // if address same returns true no need to check char by char (s1,s2)
        // reference is mutable instance is not
        // performance slow because of immutability. hello+e new instance in heap works
        // for 6 char.
        // first copy hello to new address of the heap and then add e
        // for i to n. time com - O(n^2)
        // String s1 = "Hello";
        // String s2 = "Hello";
        // String s3 = new String("Hello");

        // System.out.println(s1 == s2);
        // System.out.println(s1 == s3);
        // System.out.println(s1.equals(s3));

        // StringBuilder
        // mutable instance
        // declare using new
        // charat
        // setcharat available
        // insert at index
        // deleteCharAt
        // append
        // length()
        // performace improved O(n)

        // StringBuilder strBuilder = new StringBuilder("Hello world");
        // System.out.println(strBuilder.charAt(0));
        // strBuilder.setCharAt(5, '-');
        // strBuilder.insert(0, 'S');
        // System.out.println(strBuilder);
        // strBuilder.deleteCharAt(6);
        // strBuilder.append("tr");
        // System.out.println(strBuilder);

        // HASHMAP
        // put insert/update
        // get value/null
        // contains key t/f
        // keyset to get all key and get value for loop. using set
        // order not control
        // O(1)

        // HashMap<String, Integer> map = new HashMap<>();
        // map.put("BD", 10);
        // map.put("SD", 20);
        // System.out.println(map.get("In"));
        // map.get("BD");
        // map.containsKey("In");

        // Set<String> keys = map.keySet();

        // for(String key:keys)
        // {
        //     System.out.println(map.get(key));
        // }

        // HEAP-PQ
        // by default min is HP
        // add o(logn)
        // peek o(1)
        // remove o(logn)
        // asc/desc sort using PQ

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(20);
        pq.add(10);
        pq.add(30);
        
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek());
    }
}