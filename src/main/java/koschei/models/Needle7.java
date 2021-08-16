package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    private Deth8 Deth;

    public Needle7(Deth8 deth) {
        Deth = deth;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + Deth.toString();
    }
}
