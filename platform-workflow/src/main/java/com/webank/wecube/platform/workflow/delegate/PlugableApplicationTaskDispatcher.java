package com.webank.wecube.platform.workflow.delegate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * taskDispatcher
 * @author gavin
 *
 */
@Component("taskDispatcher")
public class PlugableApplicationTaskDispatcher extends AbstractServiceTaskHandleDelegate {
    private static final Logger log = LoggerFactory.getLogger(PlugableApplicationTaskDispatcher.class);

    @Override
    protected Logger getLogger() {
        return log;
    }

}
