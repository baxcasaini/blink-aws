package com.aws.codestar.projecttemplates.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.aws.codestar.projecttemplates.DynamoInterface;
import com.aws.codestar.projecttemplates.GatewayResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/**
 * Handler for requests to Lambda function.
 */
public class HelloWorldHandler implements RequestHandler<Object, Object> {

    public Object handleRequest(final Object input, final Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Access-Control-Allow-Origin", "*");
        headers.put("Access-Control-Allow-Credentials", "true");
        headers.put("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
        headers.put("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");

//        DynamoInterface dynamoInterface = new DynamoInterface();
//        try {
//            dynamoInterface.startDynamo(null);
//        } catch (Exception e) {
//            Object ex = e;
//        }

        return new GatewayResponse(new JSONObject().put("Output", "Ciao !").toString(), headers, 200);
    }
}
