package Pruebasxd;

// TODO: Auto-generated Javadoc
/**
 * The Class Point.
 */
public class Point {
    
    /** The local array. */
    private float[] localArray;
    
    /** The id. */
    private int id;
    
    /** The cluster id. */
    private int clusterId;  // identificacion de cluster
    
    /** The dist. */
    private float dist;     // la distancia entre el centro
 
    /**
     * Instantiates a new point.
     *
     * @param id the id
     * @param localArray the local array
     */
    public Point(int id, float[] localArray) {
        this.id = id;
        this.localArray = localArray;
    }
 
    /**
     * Instantiates a new point.
     *
     * @param localArray the local array
     */
    public Point(float[] localArray) {
        this.id = -1; 
        this.localArray = localArray;
    }
 
    /**
     * Gets the local array.
     *
     * @return the local array
     */
    public float[] getlocalArray() {
        return localArray;
    }
 
    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }
 
    /**
     * Sets the cluster id.
     *
     * @param clusterId the new cluster id
     */
    public void setClusterId(int clusterId) {
        this.clusterId = clusterId;
    }
 
    /**
     * Gets the clusterid.
     *
     * @return the clusterid
     */
    public int getClusterid() {
        return clusterId;
    }
 
    /**
     * Gets the dist.
     *
     * @return the dist
     */
    public float getDist() {
        return dist;
    }
 
    /**
     * Sets the dist.
     *
     * @param dist the new dist
     */
    public void setDist(float dist) {
        this.dist = dist;
    }
 
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String result = "Point_id=" + id + "  [";
        for (int i = 0; i < localArray.length; i++) {
            result += localArray[i] + " ";
        }
        return result.trim()+"] clusterId: "+clusterId+" dist: "+dist;
    }
 
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     * Metodos para compobar si los objetos son iguales
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass())
            return false;
        
        Point point = (Point) obj;
        if (point.localArray.length != localArray.length)
            return false;
 
        for (int i = 0; i < localArray.length; i++) {
            if (Float.compare(point.localArray[i], localArray[i]) != 0) {
                return false;
            }
        }
        return true;
    }
 
   
}
