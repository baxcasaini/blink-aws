package com.aws.codestar.projecttemplates.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.aws.codestar.projecttemplates.GatewayResponse;
import com.aws.codestar.projecttemplates.config.RestTemplateConfiguration;
import com.aws.codestar.projecttemplates.repository.GenericObjectRepository;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Handler for requests to Lambda function.
 */
public class BlinkHandler implements RequestHandler<Object, Object> {

    public Object handleRequest(final Object input, final Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        if (context != null && context.getFunctionName().equals("orders")){
            //TODO : implement logic
        }

        return new GatewayResponse(new JSONObject().put("Output", "Service offered from Blink srl").toString(), headers, 200);
    }
}
