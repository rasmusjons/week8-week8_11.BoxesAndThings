
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rasmus
 */
public class Box implements ToBeStored {

    private double maxWeight;
  
    private List<ToBeStored> boxList= new ArrayList<ToBeStored>();
  

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
      
    }

    public void add(ToBeStored toBeStored) {
          double boxWeight = toBeStored.weight();
        if (boxWeight + weight() <= this.maxWeight) {

            this.boxList.add(toBeStored);

        }
    }

    public double weight() {
         double weight = 0; 
        for (ToBeStored stuff : boxList) {
            weight += stuff.weight();
        }

        return weight;
    }

    public String toString() {
        return "Box: " + boxList.size() + " things, total weight " + weight() + " kg";

    }

}
