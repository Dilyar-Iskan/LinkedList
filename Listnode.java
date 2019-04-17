



public class Listnode<K,D>  {
	K key;
	D data;
	Listnode<K,D> pred;
	 Listnode<K,D>succ;
	 Listnode(K k , D d ){
		 key = k ; data = d; pred = null; succ =null;
	 }
	 void delete() {
		 pred.succ =succ;
		 succ.pred = pred;
	 }
	 //copy n to a Listnode
	 void copy(Listnode<K,D> n) {
		 key = n.key;
		 data = n.data;
		 pred = n.pred;
		 succ = n.succ;
	 }
	 
	 void append(Listnode<K,D> newnode) {
		 newnode.succ=succ;
		 newnode.pred=this;
		 succ.pred=newnode;
		 succ = newnode;
	 }
	 
	 
	 public static void main(String[]  arg) {
		 ADList<Integer, Integer> a = new ADList<Integer, Integer>();
		
		 
		 a.append(1,11);
		 a.append(2,22);
		 a.append(3,33);
		 a.reverse();
		 for(Listnode<Integer,Integer> n = a.head.succ; n != a.head ;n = n.succ ) {
			 System.out.print(n.key);
		 }
		 
	 }
	
}
