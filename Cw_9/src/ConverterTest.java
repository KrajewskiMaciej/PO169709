public class ConverterTest {
    public static void main(String[] args){
        Converter CurrencyConverter = new CurrencyConverter();

        double usd = 100;
        System.out.println(usd+" USD do EUR: "+ CurrencyConverter.convertToEuro(usd));

        double eur = 80;
        System.out.println(eur+" EUR do USD: "+CurrencyConverter.convertToUSD(eur));

        String currency = "EUR";
        System.out.println("Wskaźnik konwersji dla "+ currency+": "+CurrencyConverter.getConversionRate(currency));

        Converter UnitConverter = new UnitConverter();
        double inch= 10;
        System.out.println(inch+" cale na centymetry: "+ inch* UnitConverter.getConversionRate("inchToCm"));

        double cm=25.4;
        System.out.println(cm+" centymetry na cale: "+ cm*UnitConverter.getConversionRate("cmToInch"));

    }
}
