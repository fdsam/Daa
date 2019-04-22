package Pruebasxd;

import java.util.ArrayList;
import java.util.Set;

public class Main {
	 public static void main(String[] args) {
		 /*
	        ArrayList<float[]> dataSets = new ArrayList<float[]>();
	 
	        dataSets.add(new float[] { 1, 2, 3 });
	        dataSets.add(new float[] { 3, 3, 3 });
	        dataSets.add(new float[] { 3, 4, 4});
	        dataSets.add(new float[] { 5, 6, 5});
	        dataSets.add(new float[] { 8, 9, 6});
	        dataSets.add(new float[] { 4, 5, 4});
	        dataSets.add(new float[] { 6, 4, 2});
	        dataSets.add(new float[] { 3, 9, 7});
	        dataSets.add(new float[] { 5, 9, 8});
	        dataSets.add(new float[] { 4, 2, 10});
	        dataSets.add(new float[] { 1, 9, 12});
	        dataSets.add(new float[] { 7, 8, 112});
	        dataSets.add(new float[] { 7, 8, 4});
	 
	        KMeansRun kRun =new KMeansRun(3, dataSets);
	 
	        Set<Cluster> clusterSet = kRun.run();
	      
	        for (Cluster cluster : clusterSet) {
	            System.out.println(cluster);
	        }*/
		 String fileName = "C:\\Users\\sam\\Documents\\Nueva carpeta (3)\\a.txt";
		 String file2 = "C:\\Users\\sam\\Documents\\Nueva carpeta (3)\\prob2.txt";
		 ReadData read = new ReadData();
		read.read(file2);
		 KMeansRun kRun =new KMeansRun(4, read.getArr());
		  Set<Cluster> clusterSet = kRun.run();
	        for (Cluster cluster : clusterSet) {
	            System.out.println(cluster);
	        }
	    }

}
