package se.arbetsformedlingen.aisf.clientlogger.service.rest;

import io.swagger.annotations.Api;
import se.arbetsformedlingen.aisf.clientlogger.business.ClientLoggerHandler;
import se.arbetsformedlingen.aisf.clientlogger.exception.ClientLoggerException;
import se.arbetsformedlingen.aisf.clientlogger.vo.ClientLoggerCreateVO;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

/**
 * JAX-RS Example
 * <p/>
 * This class produces a RESTful service to read/write the contents of the clientLogger table.
 */
@Path("/clientlogger")
@RequestScoped
@Api(value = "AIS-F Client Logger REST Service")
public class ClientLoggerRESTService {
    @Inject
    ClientLoggerHandler clientLoggerHandler;

    /**
     * Creates a new clientlogger record from the values provided. Performs validation, and will return a JAX-RS response with either 200 ok,
     * or with a map of fields, and related errors.
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createLogRecord(ClientLoggerCreateVO clientLoggerCreateVO) {
        Response.ResponseBuilder builder;

        try {
            clientLoggerHandler.createLogRecord(clientLoggerCreateVO);
            // Create an "ok" response
            builder = Response.ok();
        } catch (ClientLoggerException e) {
            Map<String, String> responseObj = new HashMap<>();
            responseObj.put("error", e.getMessage());
            builder = Response.status(Response.Status.BAD_REQUEST).entity(responseObj);
        }

        return builder.build();
    }
}
