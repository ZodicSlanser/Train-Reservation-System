module com.railway.trs {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.trs to javafx.fxml;
    exports com.trs;
}