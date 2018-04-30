package ua.com.Epam.patternChainOfResponsibility.ver3;

public class UserExistsMiddleware extends Middleware {
  public boolean check(String email, String password) {
    if (!Server.hasEmail(email)) {
      return false;
    }
    return checkNext(email, password);
  }
}