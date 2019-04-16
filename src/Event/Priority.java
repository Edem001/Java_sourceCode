package Event;

public class Priority {
    Event returnPrEvent(Event event1, Event event2)
    {
        if (event1.getPriority() > event2.getPriority())
        {
            return event1;
        } else return event2;
    }
   /* Event earlyInvoke(Event event, Date DELTAtime){
        Event newEvent = new Event(event.getPriority(), event.getValue(), (event.getTime - DELTAtime));
        ...
        return newEvent;
    }*/
}

class Event {
    private int priority;
    private String value;
    /*private Date time;*/  // В планах додати тип Дата або знайти аналог в java.utils
    public Event(int priority, String value /*, Date time*/){ // Standart event constructor
        this.value = value;
        this.priority = priority;
        // this.time = time;
    }

    public String getValue() {
        return value;
    }

    public int getPriority() {
        return priority;
    }
    /*public Date getTime(){
        return time;
    }*/
}