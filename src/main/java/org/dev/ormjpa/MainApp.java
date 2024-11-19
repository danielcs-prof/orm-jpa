package org.dev.ormjpa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.dev.ormjpa.model.entities.Pessoa;
import org.dev.ormjpa.model.services.HibernateTransaction;
import org.dev.ormjpa.model.services.PessoaDAO;

import java.io.IOException;
import java.util.List;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        PessoaDAO personDAO = new PessoaDAO();

        // CREATE
        Pessoa person1 = new Pessoa();
        person1.setNome("John Doe");
        person1.setIdade(30);
        personDAO.save(person1);

        Pessoa person2 = new Pessoa();
        person2.setNome("Jane Smith");
        person2.setIdade(25);
        personDAO.save(person2);

        // READ
        List<Pessoa> people = personDAO.getAll();
        people.forEach(System.out::println);

        // UPDATE
        person1.setNome("John Updated");
        person1.setIdade(35);
        personDAO.update(person1);

        // DELETE
        personDAO.delete(person2.getId());

        // Fechar SessionFactory
        HibernateTransaction.closeSessionFactory();




        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}