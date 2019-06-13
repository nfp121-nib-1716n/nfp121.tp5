package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

    protected java.util.Vector<T> table = new java.util.Vector<T>();

    public int size() {
        return table.size();
    }

    public Iterator<T> iterator() {
        return table.iterator();
    }
    
    public Vector<T> getVector(){
        return this.table;
    }
   
    public boolean add(T t) {
        if(!this.contains(t)){
            table.add(t);
            return true;
        }
        return false;
    }
    

    public Ensemble<T> union(Ensemble<? extends T> e) {
        Ensemble res = new Ensemble();
        res.addAll(e.getVector());
        res.removeAll(this.inter(e));
        res.addAll(this.getVector());
        return res;
    }

    public Ensemble<T> inter(Ensemble<? extends T> e) {
        Ensemble res = new Ensemble();
        res.addAll(e.getVector());
        res.retainAll(this.getVector());
        return res;
    }

    public Ensemble<T> diff(Ensemble<? extends T> e) {
        Ensemble res = new Ensemble();
        res.addAll(this.getVector());
        res.removeAll(e.getVector());
        return res;
    }

    Ensemble<T> diffSym(Ensemble<? extends T> e) {
        Ensemble res = this.union(e).diff(this.inter(e));
        return res;
    }
    
}
