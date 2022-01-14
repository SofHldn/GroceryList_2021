package se.iths.grocerylist.view;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/application").setViewName("application");
        registry.addViewController("/admin").setViewName("admin");
        registry.addViewController("/employee").setViewName("employee");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/product").setViewName("product");
        registry.addViewController("/signup").setViewName("signup");
        registry.addViewController("/signupmessage").setViewName("signupmessage");
        registry.addViewController("/test").setViewName("allgrocerylists");
        registry.addViewController("/currentlist").setViewName("currentlist");
    }

}
