import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.remoteServer.runtime.log.TerminalHandler;

/**
 * Created by blacklc on 1/18/2017.
 */
public class OpenNewTerminalHereAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {
        Project project = event.getProject();


        //ServiceManager sm = ServiceManager.getService(project, )

        TerminalHandler th = ServiceManager.getService(project, TerminalHandler.class);

        ToolWindowFactory twf = new ToolWindowFactory();

    }
}
