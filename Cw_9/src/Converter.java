public interface Converter {
    abstract double convertToEuro(double amount);
    abstract double convertToUSD(double amount);
    abstract double getConversionRate(String currency);
}

class CurrencyConverter implements Converter{
    private static final double EUR_TO_USD = 1.18;
    private static final double USD_TO_EUR = 1/EUR_TO_USD;
    @Override
    public double convertToEuro(double amount){
        return amount*USD_TO_EUR;
    }
    @Override
    public double convertToUSD(double amount){
        return amount*EUR_TO_USD;
    }
    @Override
    public double getConversionRate(String currency) {
        if("EUR".equalsIgnoreCase(currency)) {
            return USD_TO_EUR;
        } else if ("USD".equalsIgnoreCase(currency)) {
            return EUR_TO_USD;
        } else {
            throw new IllegalArgumentException("Niewspierana waluta!");
        }
    }

}

class UnitConverter implements Converter {
    private static final double INCH_TO_CM = 2.54;
    private static final double CM_TO_INCH = 1 / INCH_TO_CM;
    @Override
    public double convertToEuro(double amount){
        throw new UnsupportedOperationException("Niwespierana konwersja!");
    }
    @Override
    public double convertToUSD(double amount){
        throw new UnsupportedOperationException("Niwespierana konwersja!");
    }
    @Override
    public double getConversionRate(String unit){
        if("inchToCm".equalsIgnoreCase(unit)) {
            return INCH_TO_CM;
        } else if ("cmToInch".equalsIgnoreCase(unit)) {
            return CM_TO_INCH;
        } else {
            throw new UnsupportedOperationException("Niwespierana jednostka");
        }
    }
}

