package ua.com.Epam.task6.task6ShipWithDroids.model;

import com.Utils;
import com.sun.jmx.remote.internal.ArrayQueue;
import java.util.List;
import ua.com.Epam.task6.task6ShipWithDroids.model.droids.Droid;
import ua.com.Epam.task6.task6ShipWithDroids.model.droids.DroidHP1;

public class Ship<T extends Droid> {

  private String type;
  private List<Droid> droidList;

  public Ship(String type) {
    this.type = type;
    this.droidList = new ArrayQueue<>(1);
    droidList.add(new DroidHP1("123"));
  }

  public void addDroid(T droid) {
//    List<Droid> droidList = this.droidList;
//    try {
//      this.droidList.add(droid);
//    }catch (Exception o){
//      this.droidList = new ArrayQueue<>(droidList.size() + 1);
//      this.droidList.addAll(droidList);
//      this.droidList.add(droid);
//    }
    this.droidList.add(droid);

  }

  private String showDroidList() {
    String droids = "";
    for (Droid droid : this.droidList) {
      droids =
          droids
              + Utils.BLUE + "Type: " + Utils.RESET + droid.getType()
              + Utils.BLUE + "; Model: " + Utils.RESET + droid.getModel()
              + ";" + "\n";
    }
    return droids;
  }

  @Override
  public String toString() {
    return "Ship{" +
        "\ntype='" + type + '\'' +
        "\n, droidList= \n" + showDroidList() +
        '}';
  }
}
