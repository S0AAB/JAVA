package org.example;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.Selectors;
import org.zkoss.zk.ui.util.GenericForwardComposer;

public abstract class baseController  extends GenericForwardComposer {


    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        Selectors.wireComponents(comp, this, false); // Vincula los componentes
    }
}
