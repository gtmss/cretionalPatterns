package org.example.abstract_factory.website;

import org.example.abstract_factory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code..");
    }
}
