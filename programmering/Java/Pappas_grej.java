package stuff;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Pappas_grej {
	
	int i1;
	String s1;
	int pos = 0;
	String[] sr1 = new String[10000001];
	
	public String get(int g1){
		return sr1[g1];
	}
	
	public void sort() {
		boolean swap = true;
		while(swap){
			swap = false;
			for (int i = 0; i < sr1.length; i++) {
			
				String t1 = sr1[i];
				String t2 = sr1[i+1];

				if(t2 == null)
				break;

				int rc = t1.compareTo(t2);
				
				if(rc > 0){
					sr1[i] = t2;
					sr1[i+1] = t1;
					swap = true;
				}
				
			}
		}
	}
	
	public int size(){
		for (int i = 0; i < sr1.length; i++) {
			if (sr1[i] == null) {
				return i;
			}
		}
		return sr1.length;
	} 
	
	public void add(String s1){
		
		sr1[pos] = s1;
		pos++;
		
		
		/*
		for(int i = 0; i < sr1.length; i++){
			if(sr1[i] == null){
				sr1[i] = s1;
			
				break;
			}
		
		}
		*/
	}
	
	public static void main(String[] args) {
		

		Pappas_grej l = new Pappas_grej();
		
		List<String> l2 = new ArrayList<String>();
		
		//Random r = new Random();
		
		
		for (int i = 0; i < 1000000; i++) {
			
			l.add(UUID.randomUUID().toString());
			l2.add(UUID.randomUUID().toString());
		}
		
		/*
		l.add("Viktor");
		l.add("Berra");
		l.add("Ciddy");
		l.add("Allan");
		l.add("Dannyboi");
		l.add("Konnty");
		l.add("Xavor");
		l.add("Eric");
		l.add("Opel");
		*/
		
		long ts1 = System.currentTimeMillis();
		//l.sort();
		Collections.sort(l2);
		long ts2 = System.currentTimeMillis();

		System.out.println("" + (ts2-ts1));
		
		//for (int i = 0; i < l.size(); i++) {
		//	System.out.println(l.get(i));
		//}
	}

}
