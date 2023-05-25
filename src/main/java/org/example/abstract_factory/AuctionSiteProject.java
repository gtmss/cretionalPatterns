package org.example.abstract_factory;

import org.example.abstract_factory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating Auction Site Project...");
        developer.writeCode();
        tester.TestCode();
        projectManager.manageProject();
    }

}
