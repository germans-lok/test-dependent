package com.github.germanslok.testdependent.services

import com.github.germanslok.testdependent.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
