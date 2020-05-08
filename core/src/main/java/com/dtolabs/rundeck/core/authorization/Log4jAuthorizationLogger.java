package com.dtolabs.rundeck.core.authorization;

import com.dtolabs.rundeck.core.authorization.providers.Logger;

public class Log4jAuthorizationLogger
        implements Logger

{
    private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(Log4jAuthorizationLogger.class);


    @Override
    public void warn(final String log) {
        logger.warn(log);
    }

    @Override
    public void error(final String log) {
        logger.error(log);
    }

    @Override
    public void error(final String log, final Throwable e) {
        logger.error(log, e);
    }

    @Override
    public void debug(final String log) {
        logger.debug(log);
    }

    @Override
    public void debug(final String log, final Throwable e) {
        logger.debug(log, e);
    }
}
