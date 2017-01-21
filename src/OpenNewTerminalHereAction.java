import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.remoteServer.runtime.log.TerminalHandler;

import java.util.Arrays;
import java.util.List;

/**
 * Created by blacklc on 1/18/2017.
 */
public class OpenNewTerminalHereAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {

        Project project = event.getProject();

        ToolWindowManager twManager = ToolWindowManager.getInstance(project);

        List<String> twIds = Arrays.asList(twManager.getToolWindowIds());

    }
}
