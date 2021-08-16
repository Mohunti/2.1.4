package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    private Duck5 Duck;

    @Override
    public String toString() {
        return ", в зайце утка " + Duck.toString();
    }

    @Autowired
    public void setOcean(Duck5 Duck) {
        this.Duck = Duck;
    }
}
