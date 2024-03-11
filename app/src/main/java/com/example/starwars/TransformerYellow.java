package com.example.starwars;

public class TransformerYellow extends Transformer{
    public int num_lasers;
    private String sound;

    public TransformerYellow(String name, int energy, int num_lasers, String sound) {
        super(name, energy);
        this.num_lasers = num_lasers;
        this.sound = sound;
    }

    public int getNum_lasers() {
        return num_lasers;
    }

    public void setNum_lasers(int num_lasers) {
        this.num_lasers = num_lasers;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public  String printSelf(){
        return sound = (getName()+ "WOW! i won!");
    }
    @Override
    public void shooting() {

    }



}
