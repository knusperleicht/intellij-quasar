package at.knusperleicht.quasar.livetemplates

import com.intellij.codeInsight.template.TemplateActionContext
import com.intellij.codeInsight.template.TemplateContextType

class QuasarContext : TemplateContextType("Vue", "QUASAR TEMPLATES") {
    override fun isInContext(templateActionContext: TemplateActionContext): Boolean {
        return templateActionContext.file.name.endsWith(".vue")
    }
}