package org.example.abstract_factory.website;

import org.example.abstract_factory.Tester;

public class ManualTester implements Tester {
    @Override
    public void TestCode() {
        System.out.println("Manual Tester tests website...");
    }
}
