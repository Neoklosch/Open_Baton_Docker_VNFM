package com.neoklosch;

import org.openbaton.catalogue.mano.descriptor.VNFComponent;
import org.openbaton.catalogue.mano.record.VNFCInstance;
import org.openbaton.catalogue.mano.record.VNFRecordDependency;
import org.openbaton.catalogue.mano.record.VirtualNetworkFunctionRecord;
import org.openbaton.catalogue.nfvo.Action;
import org.openbaton.catalogue.nfvo.Script;
import org.openbaton.catalogue.nfvo.VimInstance;
import org.openbaton.common.vnfm_sdk.VnfmHelper;
import org.openbaton.common.vnfm_sdk.amqp.AbstractVnfmSpringAmqp;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.Map;

/*
 * Copyright (c) 2017 Neoklosch (Markus Paeschke)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * VNFM to support virtualization with Docker containers.
 * @see <a href="http://openbaton.github.io/documentation/vnfm-how-to-write/">http://openbaton.github.io/documentation/vnfm-how-to-write/</a>
 */
public class DockerVNFM extends AbstractVnfmSpringAmqp {
    @Autowired
    private VnfmHelper vnfmHelper;

    public VirtualNetworkFunctionRecord instantiate(VirtualNetworkFunctionRecord virtualNetworkFunctionRecord, Object scripts, Map<String, Collection<VimInstance>> vimInstances) throws Exception {
        return null;
    }

    public void query() {

    }

    public VirtualNetworkFunctionRecord scale(Action scaleInOrOut, VirtualNetworkFunctionRecord virtualNetworkFunctionRecord, VNFComponent component, Object scripts, VNFRecordDependency dependency) throws Exception {
        return null;
    }

    public void checkInstantiationFeasibility() {

    }

    public VirtualNetworkFunctionRecord heal(VirtualNetworkFunctionRecord virtualNetworkFunctionRecord, VNFCInstance component, String cause) throws Exception {
        return null;
    }

    public VirtualNetworkFunctionRecord updateSoftware(Script script, VirtualNetworkFunctionRecord virtualNetworkFunctionRecord) throws Exception {
        return null;
    }

    public VirtualNetworkFunctionRecord modify(VirtualNetworkFunctionRecord virtualNetworkFunctionRecord, VNFRecordDependency dependency) throws Exception {
        return null;
    }

    public void upgradeSoftware() {

    }

    public VirtualNetworkFunctionRecord terminate(VirtualNetworkFunctionRecord virtualNetworkFunctionRecord) throws Exception {
        return null;
    }

    public void handleError(VirtualNetworkFunctionRecord virtualNetworkFunctionRecord) {

    }

    public VirtualNetworkFunctionRecord start(VirtualNetworkFunctionRecord virtualNetworkFunctionRecord) throws Exception {
        return null;
    }

    public VirtualNetworkFunctionRecord stop(VirtualNetworkFunctionRecord virtualNetworkFunctionRecord) throws Exception {
        return null;
    }

    public VirtualNetworkFunctionRecord startVNFCInstance(VirtualNetworkFunctionRecord virtualNetworkFunctionRecord, VNFCInstance vnfcInstance) throws Exception {
        return null;
    }

    public VirtualNetworkFunctionRecord stopVNFCInstance(VirtualNetworkFunctionRecord virtualNetworkFunctionRecord, VNFCInstance vnfcInstance) throws Exception {
        return null;
    }

    public VirtualNetworkFunctionRecord configure(VirtualNetworkFunctionRecord virtualNetworkFunctionRecord) throws Exception {
        return null;
    }

    public VirtualNetworkFunctionRecord resume(VirtualNetworkFunctionRecord virtualNetworkFunctionRecord, VNFCInstance vnfcInstance, VNFRecordDependency dependency) throws Exception {
        return null;
    }

    public void NotifyChange() {

    }
}
