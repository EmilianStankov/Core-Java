package corejava.tddintro;

public class join {
    public String join(String glue, Object... objects){
        String result = "";
        for (int i = 0; i < objects.length; i++) {
            result += (String) objects[i].toString();
            result += glue;
        }
        return result.substring(0, result.length() - glue.length());
    }

}
