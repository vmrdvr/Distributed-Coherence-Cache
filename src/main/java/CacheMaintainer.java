	import com.tangosol.net.CacheFactory;
	import com.tangosol.net.NamedCache;

public class CacheMaintainer {
	
	

	

		public static void main(String[] args) {
			
		/*	String key = "k1";
		      String value = "Cache Config  World!";*/
		 
		      CacheFactory.ensureCluster();
		      NamedCache cache = CacheFactory.getCache("employee-map");
		 
		      
		      System.out.println(cache.get("person:3"));
		 
		      CacheFactory.shutdown();
			
			
		}

	}
	
	


