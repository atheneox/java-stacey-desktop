package com.atheneox.utils;

import com.atheneox.utils.JCBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class JCDesktopPane extends JDesktopPane {
    
    private JCBorder jcborder = new JCBorder();
    private Icon icon;

    public JCDesktopPane()  {
        this.setBorder( jcborder );
    }

    public void setImagenDeFondo(Icon imagen)   {
        this.icon=imagen;
        jcborder.imagen(((ImageIcon)icon).getImage());
    }

    public Icon getImagenDeFondo()  {
        return this.icon;
    }

}