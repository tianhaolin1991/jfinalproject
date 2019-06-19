package demo;

import com.jfinal.core.Controller;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class HelloController extends Controller {

    public void index(String name,String age){
        name = getPara(0);
        age = getPara(1);
        renderText("dear "+name+" with " + age +" years old,welcome to JFinal World");
    }
}
