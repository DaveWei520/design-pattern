package willem.weiyu.designPattern.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pear implements IFruit {
    private final Logger log = LoggerFactory.getLogger(getClass());
    @Override
    public void product() {
        log.debug("******{}","生产梨");
    }
}
