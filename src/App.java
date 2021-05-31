import java.lang.ref.Cleaner.Cleanable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.zip.CRC32;

import TestClassFolder.*;

public class App {
    public static void main(String[] args) throws Exception {
        Drawable rectangle = new Rectangle();
        Drawable circle = new Circle();

        rectangle.draw();
        circle.draw();
    }
}




