package co.za.code.eagleeye.configserver;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Application {

    public static void main(String[] args) {
        System.out.println("Application running...");
        SpringApplication.run(Application.class);
    }
}
