import java.lang.ref.Cleaner.Cleanable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.zip.CRC32;

import TestClassFolder.*;

public class App {
    public static void main(String[] args) throws Exception {
        GeoObject obj = new GeoObject(){ // anonymous inner class
            @Override
            public double getArea() {
                // TODO Auto-generated method stub
                return 0;
            }
        };

        System.out.println(obj.getArea());
    }
}




