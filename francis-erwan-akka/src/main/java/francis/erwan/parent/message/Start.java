package francis.erwan.parent.message;

import akka.actor.ActorRef;

public class Start {

	private ActorRef dispatcher;

	public Start(ActorRef dispatcher) {
		this.dispatcher = dispatcher;
	}

	public ActorRef getDispatcher() {
		return dispatcher;
	}

	public void setDispatcher(ActorRef dispatcher) {
		this.dispatcher = dispatcher;
	}
	
}
