package org.itstep.commands;

import java.io.File;

public class Dir  {
    public String command(String s) {
        File dir = new File(s);
        if(dir.listFiles() == null) return "";
        for(File f: dir.listFiles()){
            System.out.println(f.getName());
        }
        return "";
    }
}
