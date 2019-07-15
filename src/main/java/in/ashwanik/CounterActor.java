package in.ashwanik;

import akka.actor.UntypedAbstractActor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CounterActor extends UntypedAbstractActor {

    private int count = 0;

    @Override
    public void onReceive(Object message) throws Throwable {

        count++;
        if ("Stop".equals(message)) {
            getContext().stop(getSelf());
        }
        log.info("Message: " + message);
    }

    public int getCount() {
        return count;
    }
}
