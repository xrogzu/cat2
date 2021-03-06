package org.unidal.cat.core.config;

import org.unidal.initialization.AbstractModule;
import org.unidal.initialization.Module;
import org.unidal.initialization.ModuleContext;
import org.unidal.lookup.annotation.Named;

import com.dianping.cat.CatCoreModule;

@Named(type = Module.class, value = CatConfigModule.ID)
public class CatConfigModule extends AbstractModule {
	public static final String ID = "cat-core-config";

	@Override
	public Module[] getDependencies(ModuleContext ctx) {
		return ctx.getModules(CatCoreModule.ID);
	}

	@Override
	protected void execute(ModuleContext ctx) throws Exception {
	}
}
