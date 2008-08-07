/*
 * This file is part of the OpenNMS(R) Application.
 *
 * OpenNMS(R) is Copyright (C) 2008 The OpenNMS Group, Inc.  All rights reserved.
 * OpenNMS(R) is a derivative work, containing both original code, included code and modified
 * code that was published under the GNU General Public License. Copyrights for modified
 * and included code are below.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * Original code base Copyright (C) 1999-2001 Oculan Corp.  All rights reserved.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 *
 * For more information contact:
 * OpenNMS Licensing       <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 */
package org.opennms.netmgt.snmp;

/**
 * Represents a base class for SnmpConfiguration of agents, ranges and defaults
 *
 * @author brozow
 */
public class SnmpConfiguration {

    public static final int DEFAULT_TIMEOUT = 3000;
    public static final int DEFAULT_PORT = 161;
    public static final int VERSION1 = 1;
    public static final int VERSION2C = 2;
    public static final int VERSION3 = 3;
    public static final int DEFAULT_VERSION = VERSION1;
    public static final int DEFAULT_RETRIES = 1;
    public static final int DEFAULT_MAX_REQUEST_SIZE = 65535;
    public static final int NOAUTH_NOPRIV = 1;
    public static final int AUTH_NOPRIV = 2;
    public static final int AUTH_PRIV = 3;
    public static final String DEFAULT_READ_COMMUNITY = "public";
    public static final int DEFAULT_MAX_VARS_PER_PDU = 10;
    public static final int DEFAULT_MAX_REPETITIONS = 2;
    public static final String DEFAULT_WRITE_COMMUNITY = "private";
    public static final int DEFAULT_SECURITY_LEVEL = NOAUTH_NOPRIV;
    public static final String DEFAULT_SECURITY_NAME = "opennmsUser";
    public static final String DEFAULT_AUTH_PASS_PHRASE = "0p3nNMSv3";
    public static final String DEFAULT_AUTH_PROTOCOL = "MD5";
    public static final String DEFAULT_PRIV_PROTOCOL = "DES";
    public static final String DEFAULT_PRIV_PASS_PHRASE = DEFAULT_AUTH_PASS_PHRASE;
    protected int m_timeout;
    protected int m_retries;
    protected int m_port;
    protected int m_version;
    protected int m_maxRequestSize;
    protected int m_securityLevel;
    protected String m_securityName;
    protected String m_readCommunity;
    protected int m_maxVarsPerPdu;
    protected int m_maxRepetitions;
    private String m_writeCommunity;
    protected String m_authPassPhrase;
    protected String m_authProtocol;
    protected String m_PrivProtocol;
    protected String m_privPassPhrase;

    protected void setDefaults() {
        m_timeout = DEFAULT_TIMEOUT;
        m_retries = DEFAULT_RETRIES;
        m_port = DEFAULT_PORT;
        m_version = DEFAULT_VERSION;
        m_maxRequestSize = DEFAULT_MAX_REQUEST_SIZE;
        m_securityLevel = DEFAULT_SECURITY_LEVEL;
        m_securityName = DEFAULT_SECURITY_NAME;
        m_authPassPhrase = DEFAULT_AUTH_PASS_PHRASE;
        m_authProtocol = DEFAULT_AUTH_PROTOCOL;
        m_PrivProtocol = DEFAULT_PRIV_PROTOCOL;
        m_privPassPhrase = DEFAULT_PRIV_PASS_PHRASE;
        m_readCommunity = DEFAULT_READ_COMMUNITY;
        m_maxVarsPerPdu = DEFAULT_MAX_VARS_PER_PDU;
        m_maxRepetitions = DEFAULT_MAX_REPETITIONS;
        m_writeCommunity = DEFAULT_WRITE_COMMUNITY;
    }

    public int getPort() {
        return m_port;
    }

    public void setPort(int port) {
        m_port = port;
    }

    public int getTimeout() {
        return m_timeout;
    }

    public void setTimeout(int timeout) {
        m_timeout = timeout;
    }

    public int getVersion() {
        return m_version;
    }

    public void setVersion(int version) {
        m_version = version;
    }

    public int getRetries() {
        return m_retries;
    }

    public void setRetries(int retries) {
        m_retries = retries;
    }

    public int getSecurityLevel() {
        return m_securityLevel;
    }

    public void setSecurityLevel(int securityLevel) {
        m_securityLevel = securityLevel;
    }

    public String getSecurityName() {
        return m_securityName;
    }

    public void setSecurityName(String securityName) {
        m_securityName = securityName;
    }

    public void setReadCommunity(String community) {
        m_readCommunity = community;
    }

    public int getMaxRequestSize() {
        return m_maxRequestSize;
    }

    public void setMaxRequestSize(int maxRequestSize) {
        m_maxRequestSize = maxRequestSize;
    }

    public String getReadCommunity() {
        return m_readCommunity;
    }

    public int getMaxVarsPerPdu() {
        return m_maxVarsPerPdu;
    }

    public void setMaxVarsPerPdu(int maxVarsPerPdu) {
        m_maxVarsPerPdu = maxVarsPerPdu;
    }

    public int getMaxRepetitions() {
        return m_maxRepetitions;
    }

    public void setMaxRepetitions(int maxRepetitions) {
        m_maxRepetitions = maxRepetitions;
    }

    public String getWriteCommunity() {
        return m_writeCommunity;
    }

    public void setWriteCommunity(String community) {
        m_writeCommunity = community;
    }

    public static String versionToString(int version) {
        switch (version) {
        case VERSION1 :
            return "v1";
        case VERSION2C :
            return "v2c";
        case VERSION3 :
            return "v3";
        default :
            return "unknown";
        }
    }

    public String getAuthPassPhrase() {
        return m_authPassPhrase;
    }

    public void setAuthPassPhrase(String authPassPhrase) {
        m_authPassPhrase = authPassPhrase;
    }

    public String getPrivProtocol() {
        return m_PrivProtocol;
    }

    public void setPrivProtocol(String authPrivProtocol) {
        m_PrivProtocol = authPrivProtocol;
    }

    public String getAuthProtocol() {
        return m_authProtocol;
    }

    public void setAuthProtocol(String authProtocol) {
        m_authProtocol = authProtocol;
    }

    public String getPrivPassPhrase() {
        return m_privPassPhrase;
    }

    public void setPrivPassPhrase(String privPassPhrase) {
        m_privPassPhrase = privPassPhrase;
    }

}
