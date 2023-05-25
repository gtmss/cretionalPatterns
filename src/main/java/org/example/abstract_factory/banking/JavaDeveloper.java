package org.example.abstract_factory.banking;

import org.example.abstract_factory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code");
    }
}
