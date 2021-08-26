package com.github.germanslok.testdependent

import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.StartupActivity

class CommonDumbPostStartupActivity : StartupActivity, DumbAware {
    override fun runActivity(project: Project) {
        println("I am common!")
    }
}
