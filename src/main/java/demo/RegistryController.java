package demo;

import com.jfinal.core.Controller;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class RegistryController extends Controller {
    public void save(User user){
        User bean = getBean(User.class);
        renderText(bean.getName()+"注册成功");
    }
}
