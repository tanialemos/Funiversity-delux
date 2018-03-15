package be.dihertalem.funiversity.jar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "be.dihertalem.funiversity")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }
}
