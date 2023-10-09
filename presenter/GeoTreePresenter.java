
package OOP1.JavaOOP1.presenter;

public class GeoTreePresenter {
    
    private GeoTree<Person> model;
    private GeoTreeView view;
    
    public GeoTreePresenter(GeoTree<Person> model, GeoTreeView view) {
        this.model = model;
        this.view = view;
    }
    
    public void addParentChildRelationship(Person parent, Person child) {
        model.appendParentChild(parent, child);
        view.displayMessage("Added parent-child relationship successfully.");
    }
    
    public void addWifeHusbandRelationship(Person wife, Person husband) {
        model.appendWifeHusband(wife, husband);
        view.displayMessage("Added wife-husband relationship successfully.");
    }
    
    // Add other presenter related methods if needed
}
