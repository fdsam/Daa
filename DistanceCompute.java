package Pruebasxd;


// TODO: Auto-generated Javadoc
/**
 * The Class DistanceCompute.
 */
public class DistanceCompute {
   
    /**
     * Gets the euclidean dis.
     *
     * @param p1 the p 1
     * @param p2 the p 2
     * @return the euclidean dis
     * Metodos para calacular la istanci euclidea 
     */
    public double getEuclideanDis(Point p1, Point p2) {
        double count_dis = 0;
        float[] p1_local_array = p1.getlocalArray();
        float[] p2_local_array = p2.getlocalArray();
 
        if (p1_local_array.length != p2_local_array.length) {
            throw new IllegalArgumentException("Los tamaños de los array tiene que ser iguales!");
        }
        
        for (int i = 0; i < p1_local_array.length; i++) {
            count_dis += Math.pow(p1_local_array[i] - p2_local_array[i], 2);
        }
        //raiz 
        return Math.sqrt(count_dis);
    }
}
