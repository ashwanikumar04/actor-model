package in.ashwanik;

import akka.actor.UntypedAbstractActor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleActorLive extends UntypedAbstractActor {

    @Override
    public void onReceive(Object message) throws Throwable {
        log.info("Message received: " + message);
    }
}
