package ArrayList.DifferencebetweenArrayListandCopyOnWriteArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Java program to illustrate CopyOnWriteArrayList
public class CopyDemo1 extends Thread {


    static CopyOnWriteArrayList l = new CopyOnWriteArrayList();

    public static void main(String[] args)
            throws InterruptedException {
        l.add("A");
        l.add("B");
        l.add("C");
        Iterator itr = l.iterator();

        while (itr.hasNext()) {
            String s = (String) itr.next();
            System.out.println(s);

            if (s.equals("B")) {
                // Throws RuntimeException
                itr.remove();
            }
            Thread.sleep(1000);
        }
        System.out.println(l);

        //output:
        //A
        //B
        //Exception in thread "main" java.lang.UnsupportedOperationException
        //	at java.base/java.util.concurrent.CopyOnWriteArrayList$COWIterator.remove(CopyOnWriteArrayList.java:1124)
        //	at ArrayList.DifferencebetweenArrayListandCopyOnWriteArrayList.CopyDemo1.main(CopyDemo1.java:25)
    }
}

