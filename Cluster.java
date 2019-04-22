package Pruebasxd;


import java.util.ArrayList;
import java.util.List;
 
// TODO: Auto-generated Javadoc
/**
 * The Class Cluster.
 */
public class Cluster {
    
    /** The id. */
    private int id;// id
    
    /** The center. */
    private Point center;// centro
    
    /** The members. */
    private List<Point> members = new ArrayList<Point>();// miembro del cluster
 
    /**
     * Instantiates a new cluster.
     *
     * @param id the id
     * @param center the center
     */
    public Cluster(int id, Point center) {
        this.id = id;
        this.center = center;
    }
 
    /**
     * Instantiates a new cluster.
     *
     * @param id the id
     * @param center the center
     * @param members the members
     */
    public Cluster(int id, Point center, List<Point> members) {
        this.id = id;
        this.center = center;
        this.members = members;
    }
 
    /**
     * Adds the point.
     *
     * @param newPoint the new point
     */
    public void addPoint(Point newPoint) {
        if (!members.contains(newPoint)){
            members.add(newPoint);
        }else{
          System.out.println("El valor almacenado ya esta " + newPoint.toString());
        }
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
     * Gets the center.
     *
     * @return the center
     */
    public Point getCenter() {
        return center;
    }
 
    /**
     * Sets the center.
     *
     * @param center the new center
     */
    public void setCenter(Point center) {
        this.center = center;
    }
 
    /**
     * Gets the members.
     *
     * @return the members
     */
    public List<Point> getMembers() {
        return members;
    }
 
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String toString = "Cluster \n" + "Cluster_id=" + this.id + ", center:{" + this.center.toString()+"}";
        for (Point point : members) {
            toString+="\n"+point.toString();
        }
        return toString+"\n";
    }
}
