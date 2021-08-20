package com.ss.driverapi.api;

import com.ss.driverapi.model.Driver;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/drivers")
public class DriverApiController {
    /**
     * GET /drivers : Get Account Details
     * Retrieves driver data using JWT (id and password will be null)
     *
     * @return OK (status code 200)
     * or Access token is missing or invalid (status code 401)
     * or Not Found (status code 404)
     */
    @GetMapping(value = "/driver", produces = {"application/json", "application/xml"})
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK", response = Driver.class),
            @ApiResponse(code = 401, message = "Access token is missing or invalid", response = String.class),
            @ApiResponse(code = 404, message = "Not Found")})
    @ApiOperation(value = "Get Account Details", nickname = "getDiver", notes = "Retrieves driver data using JWT (id and password will be null)", response = Driver.class, authorizations = {

            @Authorization(value = "JWT")
    }, tags = {"drivers",})

    public ResponseEntity<Driver> getDriver(Authentication authentication) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * DELETE /drivers : Delete Account (uses JWT to find account)
     *
     * @return Account Deleted (status code 200)
     * or Access token is missing or invalid (status code 401)
     * or Forbidden (status code 403)
     * or Not Found (status code 404)
     */
    @DeleteMapping(value = "/drivers", produces = {"application/json"})
    @ApiResponses({
            @ApiResponse(code = 200, message = "Account Deleted"),
            @ApiResponse(code = 401, message = "Access token is missing or invalid", response = String.class),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found")})
    @ApiOperation(value = "Delete Account", nickname = "deleteDriver", notes = "delete account (uses JWT to find account)", authorizations = {

            @Authorization(value = "JWT")
    }, tags = {"drivers",})

    public ResponseEntity<Void> deleteDriver(Authentication authentication)  {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * PATCH /drivers : Update Account Details
     * update driver with JWT data
     *
     * @param driver New driver data, non null properties will be updated (optional)
     * @return Update Successful (status code 200)
     * or Access token is missing or invalid (status code 401)
     * or Forbidden (status code 403)
     * or Not Found, something weird happened. Recommended to reauthenticate (status code 404)
     */
    @ApiOperation(value = "Update Account Details", nickname = "patchDiver", notes = "update driver with JWT data", authorizations = {

            @Authorization(value = "JWT")
    }, tags = {"drivers",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Update Successful"),
            @ApiResponse(code = 401, message = "Access token is missing or invalid", response = String.class),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found, something weird happened. Recommended to reauthenticate")})
    @PatchMapping(
            value = "/drivers",
            produces = {"application/json"},
            consumes = {"application/json", "application/xml"}
    )

    public ResponseEntity<Void> patchDriver(@ApiParam(value = "New driver data, non null properties will be updated") @Valid @RequestBody(required = false) Driver driver) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
