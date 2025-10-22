public class ProductRating {
    public static void main(String[] args) {
        int [][] rating = {{4,5,4}, {3,5,3}, {4,5,3}, {1,2,1}};
        String [] criteria = {"Product", "Packaging", "Delivery"};

        System.out.print("Rating");
        for (String c : criteria) {
            System.out.print(" \t" + c);
        }
        

        int numCustomer = rating.length;
        int numCriteria = rating[0].length;
        System.out.print("\nAverage");

        double [] averages = new double[numCriteria];
        for (int i = 0; i < numCriteria; i++) {
            int sum = 0;
            for (int j = 0; j < numCustomer; j++) {
                sum += rating[j][i];
            }
            averages[i] = (double) sum / numCustomer;
            System.out.printf("\t%.2f", averages[i]);
        }
        System.out.println();

        for (int i = 0; i < numCustomer; i++) {
            int sum = 0;
            for (int j = 0; j < numCriteria; j++) {
                sum += rating[i][j];
            }
            double customerAverage = (double) sum / numCriteria;
            System.out.printf("Customer %d provide the average rating %.2f%n", i + 1, customerAverage);
        }

    }
}
