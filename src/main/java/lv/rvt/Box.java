package lv.rvt;

import java.util.ArrayList;

    public class Box implements Packable {
        private ArrayList<Packable> items;
        private double maxWeight;
        
        public Box(double maxWeight){
            this.items = new ArrayList<>();
            this.maxWeight = maxWeight;
        } 

        public void add(Packable item){
                if (this.weight() + item.weight() <= maxWeight){
                    this.items.add(item);
                }
        }

        @Override
        public double weight(){
            double totalweight = 0;
            for (Packable item : items){
                totalweight += item.weight();
            }
            return totalweight;
        }

        @Override
        public String toString(){
            return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
        }
        
}