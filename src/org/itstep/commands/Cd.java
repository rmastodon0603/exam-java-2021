package org.itstep.commands;

import java.io.File;

public class Cd{
    public String command(String path){
        return new File(path).getAbsolutePath();
    }
}
