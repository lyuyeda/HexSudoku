package edu.hawaii.ics211;

import java.util.Comparator;

public class IntComp implements Comparator<Integer> {

  @Override
  public int compare(Integer arg0, Integer arg1) {
    return (arg0 - arg1);
  }

}
