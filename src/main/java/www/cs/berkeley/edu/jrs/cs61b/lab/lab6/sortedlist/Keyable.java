package www.cs.berkeley.edu.jrs.cs61b.lab.lab6.sortedlist;/* Keyable.java */


public interface Keyable {
    public int getKey();
    public boolean lessThan(Keyable x);
}
