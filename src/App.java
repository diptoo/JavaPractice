import java.lang.ref.Cleaner.Cleanable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.zip.CRC32;

import TestClassFolder.*;

public class App extends C1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        new App();
    }

    public App()
    {
        // super()
        System.out.println("App");
    }
}

class C1 extends C2 
{
    public C1()
    {
        this("C1 overloaded constructor");
        System.out.println("C1");
    }

    public C1(String s)
    {
        //super()
        System.out.println(s);
    }
}

class C2 
{
    public C2()
    {
        //super() calls object class, won't print anything
        System.out.println("C2");
    }
}
//O/P: C2 C1overloaded C1 App 
