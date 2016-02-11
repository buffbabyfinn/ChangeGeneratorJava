import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class GenerateChange {
  public static void main(String[] args) {}
//
//     String layout = "templates/layout.vtl";
//
//     get("/", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       model.put("template", "templates/home.vtl");
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//     get("/detector", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       model.put("template", "templates/detector.vtl");
//
//       String year = request.queryParams("year");
//       Integer integerYear = Integer.parseInt(year);
//       Boolean isLeapYear = isLeapYear(integerYear);
//
//       model.put("isLeapYear", isLeapYear);
//       model.put("year", request.queryParams("year"));
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//   }

  public static String generateChange (Integer inputInteger) {

    Integer input = inputInteger;
    Integer quarterCount = 0;
    Integer dimeCount = 0;
    Integer nickelCount = 0;
    String result = "";

    while (input >= 25) {
      input -= 25;
      quarterCount++;
      result += quarterCount + " quarter.";
    }
    while (input >= 10) {
      input -= 10;
      dimeCount++;
      result += " " + dimeCount + " dime.";
    }
    while (input >= 5) {
      input -= 5;
      nickelCount++;
      result += " " + nickelCount + " nickel.";
    }

    if (input != 0) {
      result += " And " + input + " penny.";
    }

    return result;
  }
}
