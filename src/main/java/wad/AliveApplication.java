package wad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliveApplication {

    public static void main(String[] args) {
        SpringApplication.run(AliveApplication.class, args);
    }

    public static String githubUrl() {
        return "https://github.com/AlecSiikaluoma/Weba";
    }

    public static String travisUrl() {
        return "https://travis-ci.com/AlecSiikaluoma/Weba";
    }

    public static String herokuUrl() {
        return "https://obscure-anchorage-64518.herokuapp.com";
    }
}
