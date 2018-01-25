package com.atheneox.stacey.tables;

import com.atheneox.stacey.models.Rol;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelRol extends AbstractTableModel {
    
    private static final long serialVersionUID = 1L;

    List<Rol> list ;

    public TableModelRol(List<Rol> list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getId();
            case 1 : return list.get(rowIndex).getName();
            case 2 : return list.get(rowIndex).getDescription();
            case 3 : return list.get(rowIndex).getDisplayName();
            case 4 : return list.get(rowIndex).getActive_Name();
            case 5 : return list.get(rowIndex).getVisible_Name();
            case 6 : return list.get(rowIndex).getDestroyed_Name();
            case 7 : return list.get(rowIndex).getCreated_at();
            case 8 : return list.get(rowIndex).getUpdated_at();
            
                default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0 : return "ID";
            case 1 : return "Nombre";
            case 2 : return "Descripción";
            case 3 : return "Alias";
            case 4 : return "Activo";
            case 5 : return "Visible";
            case 6 : return "Eliminado";
            case 7 : return "Fecha Creación";
            case 8 : return "Fecha Actualización";
            
                default:return null;
        }
    }
    
    
    
}
