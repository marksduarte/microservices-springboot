package dev.marksduarte.cnbsservice.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class EnvironmentService {

    private static final String LOCAL_SERVER_PORT = "local.server.port";

    private final Environment environment;

    public EnvironmentService(Environment environment) {
        this.environment = environment;
    }

    public String getLocalServerPort() {
        return this.environment.getProperty(LOCAL_SERVER_PORT);
    }
}
