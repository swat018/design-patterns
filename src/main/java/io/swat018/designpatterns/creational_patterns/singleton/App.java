package io.swat018.designpatterns.creational_patterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Settings settings = Settings.INSTANCE;

        Settings settings1 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }

        try (ObjectInput input = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings) input.readObject();
        }

        System.out.println(settings == settings1);
    }
}
