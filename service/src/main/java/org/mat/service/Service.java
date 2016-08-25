package org.mat.service;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.osgi.service.component.ComponentContext;

@Component(name = "Service")
@Properties({
    @Property(name = "Tag", value = "GB"),
    @Property(name="version",value="3.0.0")})
	
public class Service 
{
    @Activate void activate(final ComponentContext ctx){
        System.out.println( "Hello I'm the version number 3.0.0 and you can choose me by the 'GB' tag" );
    }
}
