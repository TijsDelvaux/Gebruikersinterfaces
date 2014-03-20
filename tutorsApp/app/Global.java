import play.*;
import play.libs.*;
import com.avaje.ebean.Ebean;
import models.*;
import java.util.*;

public class Global extends GlobalSettings {
	
	/**
	 * Methode om start-up data in te voegen
	 * de file "initial-data.yml" zit in de map conf
	 */
    @Override
    public void onStart(Application app) {
        // Check if the database is empty
//        if (User.find.findRowCount() == 0) {
//            Ebean.save((List) Yaml.load("initial-data.yml"));
//        }
    }
}