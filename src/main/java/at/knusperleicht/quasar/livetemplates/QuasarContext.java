package at.knusperleicht.quasar.livetemplates;

import com.intellij.codeInsight.template.TemplateActionContext;
import com.intellij.codeInsight.template.TemplateContextType;
import org.jetbrains.annotations.NotNull;

public class QuasarContext extends TemplateContextType {
    protected QuasarContext() {
        super("VUE_TEMPLATE", "QUASAR TEMPLATES");
    }

    @Override
    public boolean isInContext(@NotNull TemplateActionContext templateActionContext) {
        return templateActionContext.getFile().getName().endsWith(".vue");
    }
}
