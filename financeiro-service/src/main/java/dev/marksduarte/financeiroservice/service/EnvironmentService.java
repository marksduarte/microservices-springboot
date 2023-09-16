package dev.marksduarte.financeiroservice.service;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

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
