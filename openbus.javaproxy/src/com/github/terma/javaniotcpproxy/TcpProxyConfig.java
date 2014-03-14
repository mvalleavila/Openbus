/*
Copyright 2012 Artem Stasuk

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.github.terma.javaniotcpproxy;

/**
 * TCP proxy configuration.
 */
public class TcpProxyConfig {

    private final int localPort;
    private final String remoteHost;
    private final int remotePort;
    private final boolean onlyActiveChecks;
    private int workerCount;

    public TcpProxyConfig(int localPort, String remoteHost, int remotePort, boolean onlyActiveChecks) {
        this.localPort = localPort;
        this.remoteHost = remoteHost;
        this.remotePort = remotePort;
        this.onlyActiveChecks = onlyActiveChecks;
    }

    /**
     * @return - local port which TCP proxy will be listening, should be 0..64000
     */
    public int getLocalPort() {
        return localPort;
    }

    /**
     * @return - remote port on which TCP proxy will send all traffic from incoming connections
     */
    public int getRemotePort() {
        return remotePort;
    }

    /**
     * @return - remote host on which TCP proxy will send all traffic from incoming connections
     */
    public String getRemoteHost() {
        return remoteHost;
    }

    public boolean isOnlyActiveChecks() {
    	return onlyActiveChecks;
    }
    
    /**
     * @return - count of worker (thread) which TCP proxy will use for processing
     *         incoming client connection, should more 0
     */
    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }

}
