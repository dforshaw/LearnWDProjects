package restAssured;

/** Notes on using RestAssured for REST API Testing
 *
 * https://github.com/jayway/rest-assured
 * http://code.google.com/p/rest-assured/
 * http://code.google.com/p/rest-assured/wiki/GettingStarted
 * http://code.google.com/p/rest-assured/wiki/Usage
 * http://rest-assured.googlecode.com/svn/tags/2.3.0/apidocs/com/jayway/restassured/RestAssured.html
 */

import org.junit.Test;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class firstTest {

    // Initial tests to get familiar with REST ASSURED Test Framework using Google Books API

    @Test
    public void simpleExampleTopicAndAuthor() {

        String baseUrl = "https://www.googleapis.com/books/v1";
        String key = "AIzaSyBcnIPMzWkNd1Tm8eKuyJEntQEpxtNUDN0";
        String testLink = "/volumes?q=selenium+inauthor:Gundecha&key=";

        get(baseUrl + testLink + key).then().body("totalItems", is(4));
    }

    @Test
    public void simpleExampleAuthorOnly() {

        // Using Hamcrest - is

        String baseUrl = "https://www.googleapis.com/books/v1";
        String key = "AIzaSyBcnIPMzWkNd1Tm8eKuyJEntQEpxtNUDN0";
        String testLink = "/volumes?q=inauthor:Gundecha&key=";

        get(baseUrl + testLink + key).then().body("totalItems", is(6));
    }

    @Test
    public void simpleExampleAuthorOnly2() {

        // Using Hamcrest - assertThat & equalTo

        String baseUrl = "https://www.googleapis.com/books/v1";
        String key = "AIzaSyBcnIPMzWkNd1Tm8eKuyJEntQEpxtNUDN0";
        String testLink = "/volumes?q=inauthor:Gundecha&key=";

        get(baseUrl + testLink + key).then().assertThat().body("totalItems", equalTo(6));
    }

}
