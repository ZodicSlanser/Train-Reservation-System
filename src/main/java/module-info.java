module com.railway.trs {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;
    opens com.trs to javafx.fxml;
    exports com.trs;
}