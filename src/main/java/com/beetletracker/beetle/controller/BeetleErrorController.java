package com.beetletracker.beetle.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class BeetleErrorController implements ErrorController {

    // For now it handles all errors with 404 page
    @Override
    public String getErrorPath() {
        return "/errors/404";
    }

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {

        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        if (status != null) {
            int statusCode = Integer.parseInt(status.toString());

            // display specific error page
            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                return "errors/404";
            } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
                return "errors/500";
            } else if (statusCode == HttpStatus.FORBIDDEN.value()) {
                return "errors/403";
            }
        }

        // If not above display generic error

        return "errors/error";
    }
}