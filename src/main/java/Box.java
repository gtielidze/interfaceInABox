
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gio
 */
public class Box implements Packable {

    private ArrayList<Packable> items;
    private double capacity;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (this.weight() + packable.weight() <= capacity) {
            items.add(packable);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (int i = 0; i < items.size(); i++) {
            weight += items.get(i).weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }

}
