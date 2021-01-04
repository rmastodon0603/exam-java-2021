package org.itstep;
import org.itstep.commands.*;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String tmpCommand;
        int time = 1;


        // File Init
        File file = new File(".");
        String currentPath=file.getAbsolutePath();

        // Working progress of console
        do{

            // Start of cycle
            System.out.print("> ");
            tmpCommand = scanner.nextLine();

            // Check for command "dir" ( WORKED )
            if (tmpCommand.substring(0,3).equals("dir")){
                Dir dir = new Dir();
                dir.command(currentPath);
                continue;
            }

            // Check for command "cd" ( NOT WORKED )
            if (tmpCommand.substring(0,2).equals("cd")){
                try {
                    Cd cd = new Cd();
                    currentPath = cd.command(tmpCommand.substring(3));
                } catch (Exception e) {
                    System.out.println(" Exception Message : " + e.getMessage());
                }
                continue;
            }

            // Check for command "pwd" ( WORKED )
            if (tmpCommand.substring(0,3).equals("pwd")){
                Pwd pwd = new Pwd();
                pwd.command(currentPath);
                continue;
            }

            // Check for command "cat" ( WORKED )
            if (tmpCommand.substring(0,3).equals("cat")){
                try {
                    Cat cat = new Cat();
                    String path = tmpCommand.substring(4);
                    cat.command(path);
                } catch (Exception e) {
                    System.out.println(" Exception Message : " + e.getMessage());
                }
                continue;
            }

            // Check for command "help" ( WORKED )
            if(tmpCommand.substring(0,4).equals("help")){
                Help help = new Help();
                help.command();
                continue;
            }

            // Check for command "help" ( WORKED )
            if(tmpCommand.substring(0,4).equals("exit")){
                Exit exit = new Exit();
                exit.command();
            }

        } while(time == 1);
    }
}
