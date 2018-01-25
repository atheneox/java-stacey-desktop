package com.atheneox.stacey.tables;

import com.atheneox.stacey.models.User;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModelUser extends AbstractTableModel {
    
    private static final long serialVersionUID = 1L;

    List<User> list ;
    
     public TableModelUser(List<User> list) {
        this.list = list;
    }
    
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 12;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getName();
            case 1 : return list.get(rowIndex).getLastname();
            case 2 : return list.get(rowIndex).getCellphone();
            case 3 : return list.get(rowIndex).getDocumenttype_name();
            case 4 : return list.get(rowIndex).getDocumentNumber();
            case 5 : return list.get(rowIndex).getActive_Name();
            case 6 : return list.get(rowIndex).getVisible_Name();
            case 7 : return list.get(rowIndex).getDestroyed_Name();
            case 8 : return list.get(rowIndex).getLocked_Name();
            case 9 : return list.get(rowIndex).getDescription();
            case 10: return list.get(rowIndex).getCreated_at();
            case 11: return list.get(rowIndex).getUpdated_at();
                default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0 : return "Nombre";
            case 1 : return "Apellido";
            case 2 : return "Celular";
            case 3 : return "Tipo Documento";
            case 4 : return "# Doc";
            case 5 : return "Activo";
            case 6 : return "Visible";
            case 7 : return "Destroyed";
            case 8 : return "Bloqueado";
            case 9 : return "Descripción";
            case 10 : return "Creación";
            case 11 : return "Actualización";
                default:return null;
        }
    }
    
}
