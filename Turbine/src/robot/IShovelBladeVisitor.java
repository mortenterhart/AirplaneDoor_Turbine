package robot;

import blade.CarbonBlade;
import blade.TitanBlade;

public interface IShovelBladeVisitor {

    boolean visit(CarbonBlade blade);
    boolean visit(TitanBlade blade);
}
