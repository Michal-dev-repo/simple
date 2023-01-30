package pl.hobly.simple.impl;

import com.atlassian.sal.api.ApplicationProperties;
import pl.hobly.simple.api.MyPluginComponent;
import com.atlassian.jira.bc.user.search.UserSearchService;
import com.atlassian.plugin.spring.scanner.annotation.imports.ComponentImport;
import javax.inject.Named;

@Named ("myPluginComponent")
public class MyPluginComponentImpl implements MyPluginComponent
{


    @ComponentImport
    private UserSearchService userSearchService;
    private final ApplicationProperties applicationProperties;

    public MyPluginComponentImpl(final ApplicationProperties applicationProperties)
    {
        this.applicationProperties = applicationProperties;
    }

    public String getName()
    {
        if(null != applicationProperties)
        {
            return "myComponent:" + applicationProperties.getDisplayName();
        }
        
        return "myComponent";
    }
}
