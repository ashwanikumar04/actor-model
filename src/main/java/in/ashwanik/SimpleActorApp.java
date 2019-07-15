package in.ashwanik;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class SimpleActorApp {
    public static void main(String[] args) {
        ActorSystem actorSystem = ActorSystem.create();
        ActorRef actorRef = actorSystem.actorOf(Props.create(SimpleActorLive.class), "test-actor");
        actorRef.tell("Hello", null);
    }
}
