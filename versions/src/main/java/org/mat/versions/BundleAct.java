package org.mat.versions;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.mat.versions.Version;

public class BundleAct implements BundleActivator{

	private BundleContext m_context = null;
	
	public void start(BundleContext context) throws Exception {
		String tag1;
		m_context=context;
		Version version=new Version();
		//version.readIn();
		tag1=version.fraga();
		version.getIt(m_context,tag1);
    }
    public void stop(BundleContext context) throws Exception {
        System.out.println("Bundle versions stopped now!");
    }
	
}
