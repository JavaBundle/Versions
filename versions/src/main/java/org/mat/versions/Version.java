package org.mat.versions;

import org.mat.service.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.osgi.framework.BundleContext;
import org.osgi.framework.Filter;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.util.tracker.ServiceTracker;

public class Version {

	 String Filename = "org.mat.service.Service.xml";
	 String line = null;
	 String tag = null;
	 String bundleVersion= null;
		
	/**public void readIn() throws IOException{
		FileReader fr = new FileReader(Filename);
		
		BufferedReader bufferedReader = 
	            new BufferedReader(fr);
		while((line = bufferedReader.readLine()) != null) {
			
	        System.out.println(line);
	    }  
		bufferedReader.close();		
	}*/
	public String fraga() throws IOException{
		
		System.out.println("please give me a tag!");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		tag=br.readLine();
		br.close();
		return tag;
	}
	/** public String testVersion( String tag) throws IOException{
		FileReader fr = new FileReader(Filename);
		
		BufferedReader bufferedReader = 
	            new BufferedReader(fr);
		while((line = bufferedReader.readLine()) != null) {
			
			if(line.contains(tag)){
				//get bundle versionsnummer
				JarFile jarFile = new JarFile("service.jar");
				Manifest manifest = jarFile.getManifest();
				Attributes mainAttributes = manifest.getMainAttributes();
			    bundleVersion = (String) mainAttributes.get(Constants.BUNDLE_VERSION);
				
				
				jarFile.close();
			}
	    }  
		bufferedReader.close();	
		return bundleVersion;
	} */
	public void getIt(BundleContext context, String tag) throws InvalidSyntaxException{
		
	final String version = tag;

	Filter filter = context.createFilter(version);
	
	  ServiceTracker serviceTracker=new ServiceTracker(context,filter,null);
	  serviceTracker.open();
	  serviceTracker.getService();
	  serviceTracker.close();
	
	}
	
}
