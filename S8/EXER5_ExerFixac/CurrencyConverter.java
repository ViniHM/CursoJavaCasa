package S8.EXER5_ExerFixac;

public class CurrencyConverter {

public static double IOF = 0.06;

public static double AmountTotal(double precoDolar, double quantityDolar){
return quantityDolar * precoDolar + ( quantityDolar * precoDolar *  IOF);
}
  
}
