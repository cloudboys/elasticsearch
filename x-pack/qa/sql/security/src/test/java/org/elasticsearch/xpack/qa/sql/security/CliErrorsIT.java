/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.qa.sql.security;

import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.xpack.qa.sql.cli.ErrorsTestCase;
import org.elasticsearch.xpack.qa.sql.cli.EmbeddedCli.SecurityConfig;

public class CliErrorsIT extends ErrorsTestCase {
    @Override
    protected Settings restClientSettings() {
        return RestSqlIT.securitySettings();
    }

    @Override
    protected String getProtocol() {
        return RestSqlIT.SSL_ENABLED ? "https" : "http";
    }

    @Override
    protected SecurityConfig securityConfig() {
        return CliSecurityIT.adminSecurityConfig();
    }
}
