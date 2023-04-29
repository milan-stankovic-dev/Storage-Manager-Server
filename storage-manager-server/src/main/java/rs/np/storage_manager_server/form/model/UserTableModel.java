//package form.model;
package rs.np.storage_manager_server.form.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

import rs.np.storage_manager_common.domain.User;

/**
 *
 * @author Milan
 */
public class UserTableModel extends AbstractTableModel{

    String[] columnNames = new String[]{"ID","name","last name","username", "password"};
    List<User> users;

    public UserTableModel(List<User> users) {
        this.users = users;
    }

    @Override
    public String getColumnName(int column) {
    if(column>columnNames.length) return "n/a";
    return columnNames[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    
    
    @Override
    public int getRowCount() {
        return users.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
   
        User u = users.get(rowIndex);
        switch (columnIndex) {
            case 0: return u.getID();
            case 1: return u.getName();
            case 2: return u.getLastName();
            case 3: return u.getUsername();
            case 4: return u.getPassword();
            default:return "n/a";
        }
    }

    public void addUser(User u){
        if(!users.contains(u)){
        users.add(u);
        fireTableDataChanged();
        }
    }
    
}
