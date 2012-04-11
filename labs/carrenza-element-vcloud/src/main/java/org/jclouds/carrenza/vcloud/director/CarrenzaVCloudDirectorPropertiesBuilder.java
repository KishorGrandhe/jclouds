/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.carrenza.vcloud.director;

import static org.jclouds.Constants.PROPERTY_BUILD_VERSION;
import static org.jclouds.Constants.PROPERTY_ENDPOINT;
import static org.jclouds.Constants.PROPERTY_ISO3166_CODES;

import java.util.Properties;

import org.jclouds.vcloud.director.v1_5.VCloudDirectorPropertiesBuilder;

/**
 * 
 * @author Adrian Cole
 */
public class CarrenzaVCloudDirectorPropertiesBuilder extends VCloudDirectorPropertiesBuilder {
   @Override
   public Properties defaultProperties() {
      Properties properties = super.defaultProperties();
      properties.setProperty(PROPERTY_ISO3166_CODES, "GB-LND");
      properties.setProperty(PROPERTY_ENDPOINT, "https://myvdc.carrenza.net/api");
      properties.setProperty(PROPERTY_BUILD_VERSION, "???"); //FIXME
//      properties.setProperty(PROPERTY_VCLOUD_DEFAULT_NETWORK, "orgNet-.*-External"); FIXME: needed?
      return properties;
   }

   public CarrenzaVCloudDirectorPropertiesBuilder(Properties properties) {
      super(properties);
   }
}