package org.detoeuf

import io.swagger.codegen.config.CodegenConfigurator
import org.gradle.api.Plugin
import org.gradle.api.Project

class SwaggerCodeGenPlugin implements Plugin<Project> {
    void apply(Project project) {
        project.extensions.create('swagger', CodegenConfigurator)
        project.task('swagger', type: SwaggerCodeGenTask)
    }
}
