import java.lang.ref.Cleaner.Cleanable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.zip.CRC32;

import TestClassFolder.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Account[] accounts = new Account[2];

        accounts[0] = new SavingAccount(1, 10.0, new Client(1, "c1", "123"), 60000);
        accounts[1] = new CurrentAccount(2, 20, new Client(2, "C2", "345"), 45000);

        accounts[0].deposit(500);
        accounts[0].withdraw(200);

        accounts[1].deposit(300);
        accounts[1].withdraw(100);

        System.out.println(Arrays.toString(accounts));
    }
}




