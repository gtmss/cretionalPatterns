package org.example.abstract_factory.website;

import org.example.abstract_factory.Developer;
import org.example.abstract_factory.ProjectManager;
import org.example.abstract_factory.ProjectTeamFactory;
import org.example.abstract_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
