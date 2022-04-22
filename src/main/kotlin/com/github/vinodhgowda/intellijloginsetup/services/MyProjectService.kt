package com.github.vinodhgowda.intellijloginsetup.services

import com.intellij.openapi.project.Project
import com.github.vinodhgowda.intellijloginsetup.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
