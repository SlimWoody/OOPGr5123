package Classes;

import java.util.List;
import java.util.ArrayList;

import Interfaces.*;


public class Market implements iMarketBehaviour, iQueueBehaviour {
    private int auctionCount = 1;
    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        if (auctionCount <= AuctionClient.getAuctionClientCount()){
            System.out.println(actor.getActor().getName() + " the customer came to the store " + "Gets into the action First Seven!");
        }
        else{
            System.out.println(actor.getActor().getName() + " the customer came to the store " + "Does not participate in promotion"); 
        }
        auctionCount++;
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " client added to queue ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " the customer left the store ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " the customer received his order ");
            }
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " customer left the queue ");
            }
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " the customer placed an order ");

            }
        }

    }

}