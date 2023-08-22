package basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
//import org.springframework.beans.factory.annotation.Required;

/**
 * Created by syerr3 on 12/12/18.
 */

@Entity
public class Circle  implements Shape{



    @Id
    private int id;

    private Point centre;

    public void draw() {
    System.out.println("circle point is" +centre.getX() + centre.getY());


    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {

    }


    public Point getCentre() {
        return centre;
    }

//    @Required
//    public void setCentre(Point centre) {
//        this.centre = centre;
//    }
//

    @Autowired
    @Qualifier("circleRelated")
    public void setCentre(Point centre) {
        this.centre = centre;
    }



}
