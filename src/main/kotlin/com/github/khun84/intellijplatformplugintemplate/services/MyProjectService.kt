package com.github.khun84.intellijplatformplugintemplate.services

import com.github.khun84.intellijplatformplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
