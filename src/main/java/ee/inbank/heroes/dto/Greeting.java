package ee.inbank.heroes.dto;

public class Greeting {

  private String response;

  public Greeting() {
  }

  public Greeting(String response) {
    this.response = response;
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }
}
