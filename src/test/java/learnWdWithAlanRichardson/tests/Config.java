package learnWdWithAlanRichardson.tests;

public interface Config {

    final String baseUrl = System.getProperty("baseUrl","http://www.compendiumdev.co.uk");

    final String browser = System.getProperty("browser", "firefox");
}
