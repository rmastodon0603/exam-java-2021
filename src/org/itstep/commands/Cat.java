package org.itstep.commands;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Cat {
    public void command(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
