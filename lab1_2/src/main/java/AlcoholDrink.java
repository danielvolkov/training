/**
     * This class is designed to keep alcohol drink information and to test students
     * on JCC knowledge.
     * @author sds, NTUU KPI, TEF, APEPS
     */
    public class AlcoholDrink {
        /**
         * name of drink
         * density of drink
         * alcohol percent
         */
        private String name;
        private int drinkDensity;
        private int percent;
        /**
         * static final variables
         */
        public static final String DEFAULT_DRINK = "Vodka";
        public static final int DEFAULT_DENSITY = 1000;
        public static final int VODKA_PERCENT = 40;

        /**
         * Default constructor
         */
        public AlcoholDrink() {
            this.name = DEFAULT_DRINK;
            this.drinkDensity = DEFAULT_DENSITY;
            this.percent = VODKA_PERCENT;
        }

        /**
         * constructor
         * @param name
         * @param drinkDensity
         * @param percent
         */
        public AlcoholDrink(String name, int drinkDensity, int percent) {
            this.name = name;
            this.drinkDensity = drinkDensity;
            this.percent = percent;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPercent() {
            return this.percent;
        }

        public void setPercent(int percent) {
            if ( percent > 0 && percent <= 100 ) {
                this.percent = percent;
            } else {
                System.out.println("Alcohol Error!");
            }
        }

        public int getDrinkDensity() {
            return this.drinkDensity;
        }

        public void setDrinkDensity(int drinkDensity) {
            this.drinkDensity = drinkDensity;
        }
    }

