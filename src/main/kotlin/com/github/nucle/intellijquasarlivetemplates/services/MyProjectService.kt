package com.github.nucle.intellijquasarlivetemplates.services

import com.intellij.openapi.project.Project
import com.github.nucle.intellijquasarlivetemplates.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
