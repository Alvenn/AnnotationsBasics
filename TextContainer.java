package com.gmail.alvenn89;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

@SaveTo(path = "c:\\file.txt")
public class TextContainer {
    public static final String s = "Reflection and Annotaion instead of girls!";

    @Saver
    public void save( String path){
        File file = new File(path);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println(s);
            pw.close();
        }
        catch (FileNotFoundException e){
            e.getMessage();
        }

    }
}
