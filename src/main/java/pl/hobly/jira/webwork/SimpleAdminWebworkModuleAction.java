package pl.hobly.jira.webwork;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.web.action.JiraWebActionSupport;

public class SimpleAdminWebworkModuleAction extends JiraWebActionSupport
{
    private static final Logger log = LoggerFactory.getLogger(SimpleAdminWebworkModuleAction.class);

    @Override
    public String execute() throws Exception {

        return "admin-success";
    }
}
