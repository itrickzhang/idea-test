package com.github.itrickzhang.ideatest.services

import com.intellij.openapi.project.Project
import com.github.itrickzhang.ideatest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
