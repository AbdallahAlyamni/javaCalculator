import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class MathString {
    String math_text;
    String operators = "+-*/";
    boolean lastIsOperator = false;
    public MathString() {
        this.math_text="";
    }
    public void add(final String num) {

        if (math_text.length() > 0) {
            char lastchar = math_text.charAt(math_text.length() - 1);
            if (!(operators.contains(""+lastchar) && operators.contains(num))) {
                math_text += num;
            }
        }
        else{
            math_text += num;
        }

    }

    public void clear() {
        this.math_text = "";
    }

    public void backspace() {
       //char lastchar = math_text.charAt(math_text.length());
      // math_text = math_text.replace(lastchar, ' ');
      if (math_text.length() > 0) {
        // char[] temp = math_text.toCharArray();
        // temp[math_text.length()-1] = ' ';
        char lastchar = math_text.charAt(math_text.length() - 1);
        math_text = math_text.replace(lastchar, ' ');

        //math_text = temp.toString();
        math_text = math_text.trim();
      }
        

    }
    public void equal() throws ScriptException {
        if (math_text.length() > 2) {
            char lastchar = math_text.charAt(math_text.length() - 1);
            if (!(operators.contains(""+lastchar)) && !(lastchar == '0')) {
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("JavaScript");
                math_text = engine.eval(math_text).toString();
            }
            
        }
        
    }
}