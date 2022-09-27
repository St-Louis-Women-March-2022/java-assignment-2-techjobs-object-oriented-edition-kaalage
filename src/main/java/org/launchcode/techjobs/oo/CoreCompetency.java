package org.launchcode.techjobs.oo;

public class CoreCompetency extends JobField {

    public CoreCompetency() {
        id = nextId;
        nextId++;
    }

    public CoreCompetency(String value) {
        this();
        this.value = value;
    }
}
