package spaceStationRecruitment;

import java.util.ArrayList;
import java.util.List;

public class SpaceStation {
    private List<Astronaut> data;
    private String name;
    private int capacity;

    public SpaceStation(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        data = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCount(){
        return data.size();
    }

    public void add(Astronaut astronaut){

        if(this.getCount() <= this.getCapacity()){
            this.data.add(astronaut);
        }
    }

    public boolean remove(String name){
        return this.data.removeIf(g -> g.getName().equals(name));
    }

    public Astronaut getOldestAstronaut(){
        Astronaut astronaut = null;
        int maxStatPower = -1;
        for (Astronaut g : data) {
            if(g.getAge()>maxStatPower){

                maxStatPower = g.getAge();
                astronaut=g;
            }

        }
        return astronaut;
    }


    public Astronaut getAstronaut(String name){

        Astronaut astronaut = null;

        for (Astronaut g : data) {
            if(g.getName().equals(name)){
                astronaut=g;
            }

        }
        return astronaut;
    }


    public String report(){
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Astronauts working at Space Station %s:%n",this.getName()));
        for (Astronaut astronaut : data) {
            sb.append(astronaut + System.lineSeparator());
        }

        return sb.toString().trim();
    }

}
