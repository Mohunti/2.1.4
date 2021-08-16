package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    private Needle7 Needle;

    public Egg6(Needle7 needle) {
        Needle = needle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + Needle.toString();
    }
}
