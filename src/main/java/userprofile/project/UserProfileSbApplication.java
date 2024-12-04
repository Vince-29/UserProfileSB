package userprofile.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "userprofile.project")
public class UserProfileSbApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserProfileSbApplication.class, args);
    }

}
