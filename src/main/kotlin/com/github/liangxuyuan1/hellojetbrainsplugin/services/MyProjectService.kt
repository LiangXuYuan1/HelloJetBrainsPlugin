package com.github.liangxuyuan1.hellojetbrainsplugin.services

import com.intellij.openapi.project.Project
import com.github.liangxuyuan1.hellojetbrainsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
