module org.dev.ormjpa {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.sql;
    requires org.postgresql.jdbc;
    requires jakarta.persistence;
    requires static lombok;

    opens org.dev.ormjpa to javafx.fxml;
    opens org.dev.ormjpa.model.entities to org.hibernate.orm.core ;
    exports org.dev.ormjpa;

}
