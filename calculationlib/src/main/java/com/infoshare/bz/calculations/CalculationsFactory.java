package com.infoshare.bz.calculations;

import com.infoshare.bz.calculations.impl.BusinessCalculations;
import com.infoshare.bz.calculations.impl.NormalCalculations;

public class CalculationsFactory {

  public Calculations getCalculationsType(CalculationsType type){
    switch (type){
      case BUSINESS: return new BusinessCalculations();
      case NORMAL: return new NormalCalculations();
      default: return new NormalCalculations();
    }
  }
}
