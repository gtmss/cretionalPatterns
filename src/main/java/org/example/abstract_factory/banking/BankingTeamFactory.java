package org.example.abstract_factory.banking;

import org.example.abstract_factory.Developer;
import org.example.abstract_factory.ProjectManager;
import org.example.abstract_factory.ProjectTeamFactory;
import org.example.abstract_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
