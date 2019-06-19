package demo;

import com.jfinal.core.Controller;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class IndexController extends Controller {
    public void index(){
        renderError(500,"hello.html");
    }
}
