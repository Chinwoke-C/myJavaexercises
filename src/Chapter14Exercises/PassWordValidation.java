package Chapter14Exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassWordValidation {
private Pattern pattern;
private String password;
private Matcher matcher;

private String passwordPattern = "(Jane)";
  public  PassWordValidation(String password) {
    pattern = Pattern.compile(passwordPattern);
    this.password = password;
  }

  public boolean validate(String password) {
    matcher = pattern.matcher(this.password);

    return matcher.matches();
  }
}

