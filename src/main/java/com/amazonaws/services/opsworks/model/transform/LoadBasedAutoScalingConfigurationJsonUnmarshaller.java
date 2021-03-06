/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.opsworks.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Load Based Auto Scaling Configuration JSON Unmarshaller
 */
public class LoadBasedAutoScalingConfigurationJsonUnmarshaller implements Unmarshaller<LoadBasedAutoScalingConfiguration, JsonUnmarshallerContext> {

    

    public LoadBasedAutoScalingConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        LoadBasedAutoScalingConfiguration loadBasedAutoScalingConfiguration = new LoadBasedAutoScalingConfiguration();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("LayerId", targetDepth)) {
                    context.nextToken();
                    loadBasedAutoScalingConfiguration.setLayerId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Enable", targetDepth)) {
                    context.nextToken();
                    loadBasedAutoScalingConfiguration.setEnable(BooleanJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UpScaling", targetDepth)) {
                    context.nextToken();
                    loadBasedAutoScalingConfiguration.setUpScaling(AutoScalingThresholdsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DownScaling", targetDepth)) {
                    context.nextToken();
                    loadBasedAutoScalingConfiguration.setDownScaling(AutoScalingThresholdsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return loadBasedAutoScalingConfiguration;
    }

    private static LoadBasedAutoScalingConfigurationJsonUnmarshaller instance;
    public static LoadBasedAutoScalingConfigurationJsonUnmarshaller getInstance() {
        if (instance == null) instance = new LoadBasedAutoScalingConfigurationJsonUnmarshaller();
        return instance;
    }
}
    