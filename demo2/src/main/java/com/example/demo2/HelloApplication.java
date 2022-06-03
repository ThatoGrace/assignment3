package com.example.demo2;

import javafx.animation.AnimationTimer;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HelloApplication extends Application {


    Label gameOver = new Label();
    ImageView view = new ImageView(new Image("moun.jpg"));
    ImageView view1 = new ImageView(new Image("cloud.png"));
    ImageView view2 = new ImageView(new Image("thato.png"));
    ImageView view3 = new ImageView(new Image("thato.png"));
    ImageView view4 = new ImageView(new Image("cloud.png"));
    ImageView view5 = new ImageView(new Image("cloud.png"));
    ImageView view6 = new ImageView(new Image("thato.png"));
    ImageView image = new ImageView(new Image("heli.png"));
    TranslateTransition tt1 = new TranslateTransition(Duration.millis(11000), view1);
    TranslateTransition tt2 = new TranslateTransition(Duration.millis(12000), view2);
    TranslateTransition tt3 = new TranslateTransition(Duration.millis(13000), view3);
    TranslateTransition tt4 = new TranslateTransition(Duration.millis(14000), view4);
    TranslateTransition tt5 = new TranslateTransition(Duration.millis(15000), view5);

    TranslateTransition tt6 = new TranslateTransition(Duration.millis(16000), view6);

    ImageView thato1 = new ImageView(new Image("zaka.png"));
    ImageView thato2 = new ImageView(new Image("zaka.png"));
    ImageView thato3 = new ImageView(new Image("zaka.png"));
    ImageView thato4 = new ImageView(new Image("zaka.png"));
    ImageView thato5 = new ImageView(new Image("zaka.png"));
    ImageView thato6 = new ImageView(new Image("zaka.png"));
    ImageView thato7 = new ImageView(new Image("zaka.png"));
    ImageView thato8 = new ImageView(new Image("zaka.png"));


    TranslateTransition transition = new TranslateTransition(Duration.millis(11000), thato1);
    TranslateTransition transition1 = new TranslateTransition(Duration.millis(11000), thato2);
    TranslateTransition transition2 = new TranslateTransition(Duration.millis(11000), thato3);
    TranslateTransition transition3 = new TranslateTransition(Duration.millis(11000), thato4);
    TranslateTransition transition4 = new TranslateTransition(Duration.millis(11000), thato5);
    TranslateTransition transition5 = new TranslateTransition(Duration.millis(11000), thato6);
    TranslateTransition transition6 = new TranslateTransition(Duration.millis(11000), thato7);
    TranslateTransition transition7 = new TranslateTransition(Duration.millis(11000), thato8);

    AnimationTimer gametimer = new AnimationTimer() {
        @Override
        public void handle(long l) {
            collision();
        }
    };
    int score;
    Label label = new Label();

    Pane root = new Pane();

    @Override
    public void start(Stage stage) {


        Pane root = new Pane();
        Scene scene = new Scene(root, 1400, 700);



        gametimer.start();

        //ImageView view = new ImageView(new Image("image2.jpg"));

        view.setFitWidth(1400);
        view.setFitHeight(800);

        root.getChildren().add(view);

        //ImageView view1 = new ImageView(new Image("cloud.png"));

        view1.setFitWidth(150);
        view1.setFitHeight(100);
        view1.setY(500);
        view1.setX(1200);
        view1.setY(scene.getHeight() - 700);

        //TranslateTransition tt1 = new TranslateTransition(Duration.millis(11000),view1);
        tt1.setCycleCount(Integer.MAX_VALUE);
        tt1.setByX(-2000);
        //tt1.setByY(450);
        tt1.play();
        root.getChildren().add(view1);

        //ImageView view2 = new ImageView(new Image("thato.png"));
        view2.setFitWidth(100);
        view2.setFitHeight(100);
        view2.setY(700);
        view2.setX(1500);
        view2.setY(scene.getHeight() - 550);

        //TranslateTransition tt2 = new TranslateTransition(Duration.millis(12000),view2);
        tt2.setCycleCount(Integer.MAX_VALUE);
        //tt.setAutoReverse(true);
        tt2.setByX(-2000);
        tt2.play();
        root.getChildren().add(view2);

        //ImageView view3 = new ImageView(new Image("thato.png"));
        view3.setFitWidth(170);
        view3.setFitHeight(110);
        view3.setY(900);
        view3.setX(1500);
        view3.setY(scene.getHeight() - 600);

        //TranslateTransition tt3 = new TranslateTransition(Duration.millis(13000),view3);
        tt3.setCycleCount(Integer.MAX_VALUE);
        //tt.setAutoReverse(true);
        tt3.setByX(-2000);
        tt3.play();
        root.getChildren().add(view3);


        //ImageView view4 = new ImageView(new Image("cloud.png"));
        view4.setFitWidth(110);
        view4.setFitHeight(100);
        view4.setY(200);
        view4.setX(1500);
        view4.setY(scene.getHeight() - 500);

        //TranslateTransition tt4 = new TranslateTransition(Duration.millis(14000),view4);
        tt3.setCycleCount(Integer.MAX_VALUE);
        //tt.setAutoReverse(true);
        tt4.setByX(-2000);
        tt4.play();
        root.getChildren().add(view4);


        //ImageView view5 = new ImageView(new Image("cloud.png"));
        view5.setFitWidth(100);
        view5.setFitHeight(100);
        view5.setY(400);
        view5.setX(1500);
        view5.setY(scene.getHeight() - 400);

        //TranslateTransition tt5 = new TranslateTransition(Duration.millis(10000),view5);
        tt5.setCycleCount(Integer.MAX_VALUE);
        //tt.setAutoReverse(true);
        tt5.setByX(-2000);
        tt5.play();
        root.getChildren().add(view5);


        //ImageView view6 = new ImageView(new Image("thato.png"));
        view6.setFitWidth(140);
        view6.setFitHeight(110);
        view6.setY(600);
        view6.setX(1500);
        view6.setY(scene.getHeight() - 700);

        //TranslateTransition tt6 = new TranslateTransition(Duration.millis(16000),view6);
        tt6.setCycleCount(Integer.MAX_VALUE);
        //tt.setAutoReverse(true);
        tt6.setByX(-2000);
        tt6.play();
        root.getChildren().add(view6);


        label.setTextFill(Color.BLACK);
        label.setFont(new Font("Arial", 100));
        label = new Label("SCORE : 00");
        label.setLayoutX(500);
        label.setLayoutY(20);
        root.getChildren().add(label);

        //ImageView thato1 = new ImageView(new Image("zaka.png"));

        thato1.setFitWidth(90);
        thato1.setFitHeight(50);
        thato1.setY(600);
        thato1.setX(1900);
        thato1.setY(scene.getHeight() - 600);

        //TranslateTransition transition = new TranslateTransition(Duration.millis(11000),thato1);
        transition.setCycleCount(Integer.MAX_VALUE);
        transition.setByX(-2000);
        //tt1.setByY(450);
        transition.play();
        root.getChildren().add(thato1);

        //ImageView thato2 = new ImageView(new Image("zaka.png"));

        thato2.setFitWidth(90);
        thato2.setFitHeight(50);
        thato2.setY(600);
        thato2.setX(1700);
        thato2.setY(scene.getHeight() - 500);

        //TranslateTransition transition1 = new TranslateTransition(Duration.millis(11000),thato2);
        transition1.setCycleCount(Integer.MAX_VALUE);
        transition1.setByX(-2000);
        //tt1.setByY(450);
        transition1.play();
        root.getChildren().add(thato2);

        //ImageView thato3 = new ImageView(new Image("zaka.png"));

        thato3.setFitWidth(90);
        thato3.setFitHeight(50);
        thato3.setY(600);
        thato3.setX(1500);
        thato3.setY(scene.getHeight() - 390);

        //TranslateTransition transition2 = new TranslateTransition(Duration.millis(11000),thato3);
        transition2.setCycleCount(Integer.MAX_VALUE);
        transition2.setByX(-2000);
        //tt1.setByY(450);
        transition2.play();
        root.getChildren().add(thato3);

        //ImageView thato4 = new ImageView(new Image("zaka.png"));

        thato4.setFitWidth(90);
        thato4.setFitHeight(50);
        thato4.setY(600);
        thato4.setX(1300);
        thato4.setY(scene.getHeight() - 700);

        //TranslateTransition transition3 = new TranslateTransition(Duration.millis(11000),thato4);
        transition3.setCycleCount(Integer.MAX_VALUE);
        transition3.setByX(-2000);
        //tt1.setByY(450);
        transition3.play();
        root.getChildren().add(thato4);

        //ImageView thato5 = new ImageView(new Image("zaka.png"));

        thato5.setFitWidth(90);
        thato5.setFitHeight(50);
        thato5.setY(400);
        thato5.setX(1100);
        thato5.setY(scene.getHeight() - 500);

        //TranslateTransition transition4 = new TranslateTransition(Duration.millis(11000),thato5);
        transition4.setCycleCount(Integer.MAX_VALUE);
        transition4.setByX(-2000);
        //tt1.setByY(450);
        transition4.play();
        root.getChildren().add(thato5);

        //ImageView thato6 = new ImageView(new Image("zaka.png"));

        thato6.setFitWidth(90);
        thato6.setFitHeight(50);
        thato6.setY(400);
        thato6.setX(900);
        thato6.setY(scene.getHeight() - 400);

        //TranslateTransition transition5 = new TranslateTransition(Duration.millis(11000),thato6);
        transition5.setCycleCount(Integer.MAX_VALUE);
        transition5.setByX(-2000);
        //tt1.setByY(450);
        transition5.play();
        root.getChildren().add(thato6);

        //ImageView thato7 = new ImageView(new Image("zaka.png"));

        thato7.setFitWidth(90);
        thato7.setFitHeight(50);
        thato7.setY(200);
        thato7.setX(700);
        thato7.setY(scene.getHeight() - 300);

        //TranslateTransition transition6 = new TranslateTransition(Duration.millis(11000),thato7);
        transition6.setCycleCount(Integer.MAX_VALUE);
        transition6.setByX(-2000);
        //tt1.setByY(450);
        transition6.play();
        root.getChildren().add(thato7);

        //ImageView thato8 = new ImageView(new Image("zaka.png"));

        thato8.setFitWidth(90);
        thato8.setFitHeight(50);
        thato8.setY(550);
        thato8.setX(1200);
        thato8.setY(scene.getHeight() - 600);

        //TranslateTransition transition7 = new TranslateTransition(Duration.millis(11000),thato8);
        transition7.setCycleCount(Integer.MAX_VALUE);
        transition7.setByX(-2000);
        //tt1.setByY(450);
        transition7.play();
        root.getChildren().add(thato8);

        //ImageView thato9 = new ImageView(new Image("zaka.png"));


        // Circle enemy = createEnemy(scene);
        ImageView ship = createShip(scene);
        root.getChildren().addAll(ship, gameOver);

        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            double x = ship.getX();
            double y = ship.getY();

            switch (event.getCode()) {
                case RIGHT -> ship.setX(x + 10);
                case LEFT -> ship.setX(x - 10);
                case UP -> ship.setY(y - 10);
                case DOWN -> ship.setY(y + 10);
            }

           /* if(event.getCode()== KeyCode.SPACE){
                Circle bullet = new Circle(3);
                bullet.setCenterX(x + (ship.getFitWidth() / 2));
                bullet.setCenterY(y);

                TranslateTransition moveEnemy = new TranslateTransition(Duration.millis(3000), bullet);
                moveEnemy.setByY(scene.getHeight() * -1);
                moveEnemy.play();

                root.getChildren().add(bullet);
            }*/
        });

        stage.setTitle("ASSIGNMENT3");
        stage.setScene(scene);
        stage.show();
    }


    public ImageView createShip(Scene scene) {
        //ImageView image = new ImageView(new Image("heli.png"));
        image.setFitWidth(250);
        image.setFitHeight(100);
        image.setY(scene.getHeight() - image.getFitHeight());

        return image;
    }

    public void collision() {
        if (image.getBoundsInParent().intersects(view1.getBoundsInParent()) ||
                image.getBoundsInParent().intersects(view2.getBoundsInParent()) || image.getBoundsInParent().intersects(view3.getBoundsInParent())
                || image.getBoundsInParent().intersects(view4.getBoundsInParent()) || image.getBoundsInParent().intersects(view5.getBoundsInParent())
                || image.getBoundsInParent().intersects(view6.getBoundsInParent())) {

            //gameOver.setText("Game Over");
            //gameOver.setFont(new Font("Arial", 60));
            //gameOver.setTextFill(Color.RED);
            image.setImage(new Image("gameover.jpg"));
            gameOver.setLayoutX(460);
            gameOver.setLayoutY(300);


            tt1.stop();
            tt2.stop();
            tt3.stop();
            tt4.stop();
            tt5.stop();
            tt6.stop();
            transition.stop();
            transition1.stop();
            transition2.stop();
            transition3.stop();
            transition4.stop();
            transition5.stop();
        } else {
            if (image.getBoundsInParent().intersects(thato1.getBoundsInParent())) {
                score = score + 1;
                label.setText("Score: " + (score));
                root.getChildren().remove(thato1);
            }
            if (image.getBoundsInParent().intersects(thato2.getBoundsInParent())) {
                score = score + 1;
                label.setText("Score: " + (score));
                root.getChildren().remove(thato2);
            }
            if (image.getBoundsInParent().intersects(thato3.getBoundsInParent())) {
                score = score + 1;
                label.setText("Score: " + (score ));
                root.getChildren().remove(thato3);
            }
            if (image.getBoundsInParent().intersects(thato4.getBoundsInParent())) {
                score = score + 1;
                label.setText("Score: " + (score));
                root.getChildren().remove(thato4);
            }
            if (image.getBoundsInParent().intersects(thato5.getBoundsInParent())) {
                score = score + 1;
                label.setText("Score: " + (score));
                root.getChildren().remove(thato5);
            }
            if (image.getBoundsInParent().intersects(thato6.getBoundsInParent())) {
                score = score + 1;
                label.setText("Score: " + (score));
                root.getChildren().remove(thato6);
            }
            if (image.getBoundsInParent().intersects(thato7.getBoundsInParent())) {
                score = score + 1;
                label.setText("Score: " + (score));
                root.getChildren().remove(thato7);
            }
            if (image.getBoundsInParent().intersects(thato8.getBoundsInParent())) {
                score = score + 1;
                label.setText("Score: " + (score));
                root.getChildren().remove(thato8);
            }
        }
    }





    public static void main(String[] args) {
        launch();
    }
}