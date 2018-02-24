package turbine;

import blade.CarbonBlade;
import blade.ShovelBlade;
import blade.TitanBlade;
import logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class AirplaneTurbine {
    private List<ShovelBlade> blades;

    public AirplaneTurbine() {
        blades = new ArrayList<>();
        buildBlades();
    }

    private void buildBlades() {
        Logger.instance.log("--- Creating the diverse shovel blades alternating Titan and Carbon ones " +
                "starting at index 1");
        for (int index = 1; index <= 96; index += 2) {
            blades.add(new TitanBlade());
            blades.add(new CarbonBlade());
            Logger.instance.log("> Created TitanBlade with index " + index + " and " +
                    "CarbonBlade with index " + (index + 1));
        }
        Logger.instance.newLine();
    }

    public List<ShovelBlade> getBlades() {
        return blades;
    }
}
