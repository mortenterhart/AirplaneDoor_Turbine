package turbine;

import blade.CarbonBlade;
import blade.ShovelBlade;
import blade.TitanBlade;

import java.util.ArrayList;
import java.util.List;

public class AirplaneTurbine {
    private List<ShovelBlade> blades;

    public AirplaneTurbine() {
        blades = new ArrayList<>();

        for (int index = 0; index < 96 / 2; index++) {
            blades.add(new TitanBlade());
            blades.add(new CarbonBlade());
        }
    }

    public List<ShovelBlade> getBlades() {
        return blades;
    }
}
