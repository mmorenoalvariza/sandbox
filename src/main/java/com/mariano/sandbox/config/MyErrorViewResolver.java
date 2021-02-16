package com.mariano.sandbox.config;

import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Component
public class MyErrorViewResolver implements ErrorViewResolver {

    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        if (HttpStatus.NOT_FOUND == status) {
            LoggerFactory.getLogger(this.getClass()).error("error 404 for url " + model.get("path"));
            return new ModelAndView("error404", model);
        }
        else {
            return new ModelAndView("error", model);
        }
    }
}