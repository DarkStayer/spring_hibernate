package hiber.model;

import javax.persistence.*;

@Entity
public class Car {
    @JoinColumn
    private String model;
    @JoinColumn
    private int series;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    @PrimaryKeyJoinColumn
    private User user;

    public Car(String model, int series){
        this.model = model;
        this.series = series;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
