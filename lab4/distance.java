import java.util.*;

public class distance {
	public static double distance(double[] c1, double[] c2)

    {

		return Math.sqrt(((c1[0]-c2[0])*(c1[0]-c2[0]))+((c1[1]-c2[1])*(c1[1]-c2[1])));

    }

    //calculates total distance from ith city to all cities

    public static double totalDistance(double[][] cities, int i)

    {

                   double d = 0; //set d to 0

                   for(int j=0; j<cities.length; j++)
                   {
                                 d += distance(cities[i], cities[j]);

                   }

                   return d; //return distance

    }

    public static void main(String[] args)

    {

                   Scanner sc = new Scanner(System.in); //scanner object

                   //get input

                   System.out.print("Enter the number of cities: ");

                   int n = sc.nextInt();

                   double[][] cities = new double[n][2];

                   System.out.print("Enter the coordinates of the cities: ");

                   for(int i=0; i<n; i++)

                   {

                                 cities[i][0] = sc.nextDouble();

                                 cities[i][1] = sc.nextDouble();

                   }

                   //distance array

                   double[] dist = new double[n];

                   //get all total distances

                   for(int i=0; i<n; i++)

                   {

                                 dist[i] = totalDistance(cities, i);

                   }

                   //find min distance

                   double min = dist[0];

                   int index = 0;

                   for(int i=1; i<n; i++)

                   {

                                 if(dist[i]<min)

                                 {

                                                min = dist[i];

                                                index = i;

                                 }

                   }

                   System.out.printf("The central city is at (%.2f, %.2f)\n", cities[index][0], cities[index][1]);

                   System.out.printf("The total distance to all other cities is %.2f\n", dist[index]);

    }

}
