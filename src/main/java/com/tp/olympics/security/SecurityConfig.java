package main.java.com.tp.olympics.security;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationScoped
@ApplicationPath("/api")
public class SecurityConfig extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(com.tp.olympics.controller.UserController.class);
        classes.add(com.tp.olympics.controller.EventController.class);
        classes.add(com.tp.olympics.controller.TicketController.class);
        classes.add(com.tp.olympics.controller.StadiumController.class);
        classes.add(com.tp.olympics.security.AuthenticationFilter.class);
        classes.add(com.tp.olympics.security.AuthorizationFilter.class);
        classes.add(com.tp.olympics.exception.ExceptionHandler.class);
        return classes;
    }
}
