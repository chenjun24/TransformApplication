package com.cj.plugin
import org.gradle.api.Plugin
import org.gradle.api.Project

 class MyPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        println("----------intbird AsmPlugin start-----------")

        StringTransform transform = new StringTransform()
        // http://tools.android.com/tech-docs/new-build-system/transform-api
        project.extensions.getByType(AppExtension).registerTransform(transform)

        println("----------intbird AsmPlugin end-----------")
    }
}