public class Home2 {
    public class Converter {
        private double baseValue;

        public Converter(double baseValue) {
            this.baseValue = baseValue;
        }

        public double runKelvinconverter() {
            return baseValue + 273.15;
        }
    }
}


