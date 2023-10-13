
package OOP1.JavaOOP1;

import OOP1.JavaOOP1.model.GeoTree;
import OOP1.JavaOOP1.service.GeoTreeService;
import OOP1.JavaOOP1.presenter.GeoTreePresenter;
import OOP1.JavaOOP1.view.GeoTreeCLI;

public class Main {
    public static void main(String[] args) {
        // Инициализация презентера, сервиса и CLI
        GeoTree geoTree = new GeoTree();
        GeoTreeService service = new GeoTreeService(geoTree);
        GeoTreePresenter presenter = new GeoTreePresenter(service);
        GeoTreeCLI cli = new GeoTreeCLI(presenter);
        
        // Запуск CLI
        cli.start();
    }
}
