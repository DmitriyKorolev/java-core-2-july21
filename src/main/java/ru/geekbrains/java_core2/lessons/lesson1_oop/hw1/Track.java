package ru.geekbrains.java_core2.lessons.lesson1_oop.hw1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Track implements  Trap {
    private int length;

    public Track(int length) { this.length = length; }

    @Override
    public boolean overcome(Participant participant) {
        if(participant.run(this.length)) {
            System.out.printf("%s %s ran track of %dm.\n", participant.getClass().getSimpleName(), participant.getName(), length);
            return  true;
        }
        System.out.printf("%s %s haven't ran track of %dm.\n", participant.getClass().getSimpleName(), participant.getName(), length);
        return false;
    }
}
