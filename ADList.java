
import java.util.*;

public class ADList<K,D> extends AbstractMap<K,D> {
	Listnode<K,D> head;
	public ADList() {
		head = new Listnode<K,D>(null,null);
		head.pred=head;
		head.succ=head;
	}
	public  void append(K k ,D d) {
		 head.pred.append(new Listnode<K,D>(k,d));
	 }
	public void prepend(K k , D d ) {
		head.append(new Listnode<K,D>(k,d));
	}
	public void delete(K k ) {
		Listnode<K,D> n = findnode(k);
		if(n != null ) n.delete();
	}
	protected Listnode<K,D> findnode(K k ){
		 Listnode<K,D> n ;
		 head.key = k ;
		 for(n = head.succ ; !n.key.equals(k);n=n.succ) {}
			 head.key = null ;
			 if(n == head) return null ;
			 return n ;
		 
		
	 }
	public void reverse() {
		Listnode<K,D> temp , curr = head;
		do {
			temp = curr.succ;
			curr.succ = curr.pred;
			curr.pred=temp ;
			curr = curr.pred;
		}while(curr!=head);
	}
	@Override
	public Set<Entry<K, D>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
}
