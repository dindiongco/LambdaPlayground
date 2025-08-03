package handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import model.GreetingRequest;
import service.GreetingService;

public class GreetingHandler implements RequestHandler<GreetingRequest, String> {

    private final GreetingService greetingService = new GreetingService();

    @Override
    public String handleRequest(GreetingRequest greetingRequest, Context context) {
        context.getLogger().log(greetingRequest.toString());
        return greetingService.greeting(greetingRequest.getName());
    }
}
