package com.github.ericstiles.learnintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.ericstiles.learnintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
