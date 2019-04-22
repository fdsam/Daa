package Pruebasxd;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Analyzer.Point;
public class ReadData {
	
	private ArrayList<float[]> arr=new ArrayList<float[]>();
	private int nDimensions;
	private int p;
	@Override
	public String toString() {		
			return "ReadData [arr=" + arr + "]";		
	}

	public ArrayList<float[]> read(String fileName){
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line = null;
			int nPoints = Integer.parseInt(reader.readLine());
			nDimensions = Integer.parseInt(reader.readLine());
			/*int nPoints = Integer.parseInt(reader.readLine());
			nDimensions = Integer.parseInt(reader.readLine());
			for(int i = 0; i < nPoints ; i++) {
				points.add(new Point(reader.readLine(),nDimensions));
			}
			 * */
	        while((line=reader.readLine())!=null){	        	
	        	String str[] = line.replace(",", ".").split("\\s+");	        	
	        	float[][] point1 = new float[1][this.nDimensions];
	        	//System.out.println( str[0] + " "+ str[1]);
	        	for(int i=0;i<this.nDimensions ;i++) {
	        		point1[0][i]=Float.parseFloat(str[i].trim());        		 		
	        	} 

	        	//System.out.println(point1[0][0] + " " + point1[0][1] + " " + point1[0][2] + " " + point1[0][3]);
	        	
	        	arr.add(point1[0]);        	        	
	        	/*point1[0][0]=Float.parseFloat(str[0].trim());
	        	point1[0][1]=Float.parseFloat(str[1].trim());
	        	point1[0][2]=Float.parseFloat(str[2].trim());
	        	point1[0][3]=Float.parseFloat(str[3].trim());	        	
	        	*/
	        }
	        
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	    	
		return arr;
	    	
	    }

	public ArrayList<float[]> getArr() {
		return arr;
	}

	public void setArr(ArrayList<float[]> arr) {
		this.arr = arr;
	}

	public static void main(String[] args) {
		String file = "C:\\Users\\sam\\Documents\\Nueva carpeta (3)\\a.txt";
		String file2 = "C:\\Users\\sam\\Documents\\Nueva carpeta (3)\\prob2.txt";
		ReadData read = new ReadData();
		read.read(file2);
	}

	public int getnDimensions() {
		return nDimensions;
	}

	public void setnDimensions(int nDimensions) {
		this.nDimensions = nDimensions;
	}
	
	
}
