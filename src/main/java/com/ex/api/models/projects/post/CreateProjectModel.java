package com.ex.api.models.projects.post;

import java.sql.Timestamp;


public class CreateProjectModel {

    public CreateProject createProjectWithoutSuiteMode(Timestamp name) {
        CreateProject createProject = new CreateProject();
        createProject.setName("some unique name for test " + name);
        createProject.setAnnouncement("this is some announcement");
        createProject.setShowAnnouncement(true);
        return createProject;
    }
}
