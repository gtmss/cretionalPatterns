package org.example.abstract_factory.website;

import org.example.abstract_factory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages website project...");
    }
}
