package jenkins.tests;

public interface Config {

    final String baseUrl = System.getProperty("baseUrl","http://localhost:8080");

    final String browser = System.getProperty("browser", "firefox");
}
