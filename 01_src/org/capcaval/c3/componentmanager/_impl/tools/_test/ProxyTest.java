/*
Copyright (C) 2012 by CapCaval.org

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/
package org.capcaval.c3.componentmanager._impl.tools._test;

import java.lang.reflect.Proxy;

import org.capcaval.c3.application.Application;
import org.capcaval.c3.component.ComponentService;
import org.capcaval.c3.componentmanager._impl.tools.ComponentServiceProxy;
import org.capcaval.c3.componentmanager._impl.tools._test.asyncomp.impl.AsyncCompImpl;

public class ProxyTest {
	
	@org.junit.Test
	public void ServiceAsyncProxyTest(){
		
		Application app = new Application() {
			
			@Override
			public void notifyApplicationToBeRun(String applicationDescrition,
					String componentsDescription) {
				
			}
			
			@Override
			public void notifyApplicationToBeClosed() {
				
			}
		};
		
		app.launchApplication(null, AsyncCompImpl.class);
		
		ComponentServiceProxy proxy = new ComponentServiceProxy<ComponentService>(componentService, executor);
		
		ComponentServiceProxy<ComponentService> proxy = Proxy.newProxyInstance(
				loader, interfaces, h)
		
	}

}
