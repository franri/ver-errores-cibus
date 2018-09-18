import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.List;
import java.util.ResourceBundle;

public class searchPageController implements Initializable {

    private final int AMOUNT_OF_SEATS = 10;

    @FXML
    Label errorLabel;

    @FXML
    private TextField buscaNombre;

    @Autowired
    BackendService bs;

    @FXML
    private MenuButton listaBarrios = new MenuButton();

    @FXML
    private ComboBox lugares = new ComboBox();

    @FXML
    private MenuButton listaComidas;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //  Cargo lista de barrios, comidas a drop-down
        List<String> barrios = null;
        List<String> comidas = null;

//        try {
//            barrios = bs.getListaBarrios();
//            comidas = bs.getListaComidas();
//        } catch (RemoteException e) {
//            errorLabel.setText("Error en conexión al servidor");
//            errorLabel.setVisible(true);
//        }

        barrios.add("Pocitos");
        barrios.add("Centro");
        barrios.add("PuntaCarretas");
        ObservableList<CustomMenuItem> barriosToAdd = FXCollections.observableArrayList();
        barrios.forEach(item -> barriosToAdd.add(new CustomMenuItem(new CheckBox(item), false)));
        listaBarrios.getItems().addAll(barriosToAdd);

        comidas.add("Asado");
        comidas.add("Pasta");
        comidas.add("Ensalada");
        ObservableList<CustomMenuItem> comidasToAdd = FXCollections.observableArrayList();
        comidas.forEach(item -> comidasToAdd.add(new CustomMenuItem(new CheckBox(item), false)));
        listaComidas.getItems().addAll(comidasToAdd);

//        Meto lista para elegir lugares
        ObservableList<Integer> lugaresList = FXCollections.observableArrayList();
        for(int i=1; i<AMOUNT_OF_SEATS+1; i++){
            lugaresList.add(i);
        }
        lugares.setItems(lugaresList);
    }

    public void cargarRestaurantes(){

    }

//        ObservableList<CustomMenuItem> barrios = FXCollections.observableArrayList();
//        barrios.add(new CustomMenuItem(new CheckBox("Pocitos"), false));
//        barrios.add(new CustomMenuItem(new CheckBox("Centro"), false));
//        barrios.add(new CustomMenuItem(new CheckBox("Punta Carretas"), false));
//
//        for (CustomMenuItem item : barrios) {
//            listaBarrios.getItems().add(item);
//        }
//        CheckBox hola = (CheckBox) ((CustomMenuItem) listaBarrios.getItems().get(1)).getContent();
//        String hallo = hola.getText();
//        hola.setSelected(true);
//        boolean checked = hola.isSelected();
//        System.out.println(checked+hallo);
//
//
//        ObservableList<Integer> lugaresList = FXCollections.observableArrayList();
//        for(int i=1; i<AMOUNT_OF_SEATS+1; i++){
//            lugaresList.add(i);
//        }
//
//            lugares.setItems(lugaresList);
//
//            Integer halla = (Integer)lugares.getSelectionModel().getSelectedItem();
//            System.out.println(halla);
//
////        boolean halla = lugares.get
////        System.out.println(halla);
//        }
//
//        public void printalgo(){
//            System.out.println(lugares.getSelectionModel().getSelectedItem());
//            System.out.println(lugares.getSelectionModel().isEmpty());

}

