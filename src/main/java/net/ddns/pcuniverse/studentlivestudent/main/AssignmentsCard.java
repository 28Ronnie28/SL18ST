package net.ddns.pcuniverse.studentlivestudent.main;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Window;
import models.all.AssignmentDetails;
import models.all.ContactDetails;

public class AssignmentsCard extends HBox {

    public AssignmentsCard(Window parent, AssignmentDetails assignmentDetails, String studentName, String studentEmail) {
        Circle contactImage = new Circle(30);
        contactImage.setStroke(Color.BLACK);
        contactImage.setStrokeWidth(2);
        Text assignmentName = new Text(assignmentDetails.getAssignmentName());
        assignmentName.setStyle("-fx-font-size: 22");
        Text handInDate = new Text(assignmentDetails.getHandInDate());
        VBox assignmentsMainPane = new VBox(assignmentName, handInDate);
        assignmentsMainPane.setAlignment(Pos.CENTER_LEFT);
        assignmentsMainPane.setMinWidth(500);
        assignmentsMainPane.setMaxWidth(500);
        /*Text contactNumber = new Text(contactDetails.getContactNumber());
        contactEmail.setFocusTraversable(false);
        contactEmail.setStyle("-fx-effect: null;" +
                "-fx-text-fill: #8B0000;");*/
        setStyle("-fx-background-color: white;" +
                "-fx-border-color: black;" +
                "-fx-border-width: 2;" +
                "-fx-min-width: 1000;" +
                "-fx-max-width: 1000;" +
                "-fx-border-radius: 15;" +
                "-fx-background-radius: 15;");
        setSpacing(25);
        setAlignment(Pos.CENTER_LEFT);
        setPadding(new Insets(5));
        getChildren().addAll(contactImage, assignmentsMainPane/*, contactNumber, contactEmail*/);
    }

}
