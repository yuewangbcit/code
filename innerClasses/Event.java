package code.innerClasses;

/**
 * An event has a time and a delay time. The event "begins" after the delay.
 *
 * @author BCIT
 * @version 2020
 */
public abstract class Event {
    private long eventTime;
    private final long delayTime;

    /**
     * An event starts at a specific time after the specified delay.
     * @param delayTime
     */
    public Event(final long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    /**
     * Starts the event. This permits us to restart the event after the
     * delay stored in the Event.
     */
    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }

    /**
     * Returns true if the Event has taken place.
     * @return true if the event took place in the past or now, else false
     */
    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }

    /**
     * Performs an action.
     */
    public abstract void action();
}
