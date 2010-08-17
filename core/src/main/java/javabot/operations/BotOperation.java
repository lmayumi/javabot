package javabot.operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ServiceLoader;

import javabot.BotEvent;
import javabot.Javabot;
import javabot.Message;

public abstract class BotOperation implements Comparable<BotOperation> {
    private Javabot bot;

    public Javabot getBot() {
        return bot;
    }

    public void setBot(final Javabot bot) {
        this.bot = bot;
    }

    public boolean isStandardOperation() {
        return false;
    }

    public final int getPriority() {
        return isStandardOperation() ? Integer.MAX_VALUE : 0;
    }
    
    /**
     * Returns a list of BotOperation.Message, empty if the operation was not applicable to the message passed. It
     * should never return null.
     *
     * @param event
     *
     * @return
     */
    public List<Message> handleMessage(final BotEvent event) {
        return Collections.emptyList();
    }

    public List<Message> handleChannelMessage(final BotEvent event) {
        return Collections.emptyList();
    }

    public String getName() {
        return getClass().getSimpleName().replaceAll("Operation", "");
    }

    @Override
    public int compareTo(final BotOperation o) {
        if(o.getPriority() != getPriority()) {
            return Integer.valueOf(getPriority()).compareTo(o.getPriority());
        }
        if(isStandardOperation() != o.isStandardOperation()) {
            return Boolean.valueOf(isStandardOperation()).compareTo(o.isStandardOperation());
        }
        return getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return getName();
    }

    public static List<BotOperation> listKnownOperations() {
        final ServiceLoader<BotOperation> loader = ServiceLoader.load(BotOperation.class);
        final List<BotOperation> list = new ArrayList<BotOperation>();
        for (final BotOperation operation : loader) {
            list.add(operation);
        }
        return list;
    }
}