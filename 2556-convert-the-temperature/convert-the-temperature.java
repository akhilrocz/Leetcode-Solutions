class Solution {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double farenheit = (9*celsius/5)+32;
        return new double[]{kelvin,farenheit};
    }
}