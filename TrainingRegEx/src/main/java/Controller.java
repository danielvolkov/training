import model.Model;
import model.entity.Note;
import util.NoteEnum;
import util.Validator;

import java.util.Scanner;

/**
 * Controller class
 * Created by daniel.volkov on 05/11/16.
 */
public class Controller {
    Model model;
    View view;

    /**
     * Constructor
     * @param model
     * @param view
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * processUser method
     * starts dialog with User
     */
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        updateModel(sc);
    }

    /**
     * this method use for reading values from user
     * @param sc keyboard Scanner
     * @param field enum type for determine entity field
     * @return valid String value with corresponding rules
     */
    public String readNext(Scanner sc, NoteEnum field) {
        view.printMessage(String.format("%s %s :",View.PREFIX,field.getName()));
        String line=sc.nextLine();
         while (!Validator.validate(line,field.getRegEx())){
             view.printMessage(field.getError());
             view.printMessage(String.format("%s %s :",View.PREFIX,field.getName()));
             line=sc.nextLine();
         }
        return line;
    }

    /**
     * This method use for read group line
     * @param sc keyboard Scanner
     * @param field enum type for determine entity field
     * @return valid String value with corresponding rules
     */
    public String readNextGroup(Scanner sc, NoteEnum field) {
        view.printMessage(String.format("%s %s :",View.PREFIX,field.getName()));
        String line=sc.nextLine();
        while (!Validator.validateGroup(line)){
            view.printMessage(field.getError());
            view.printMessage(String.format("%s %s :",View.PREFIX,field.getName()));
            line=sc.nextLine();
        }
        return line;
    }

    /**
     * this method create new Note in model
     * get all parametrs from User
     * and add new Note into the model
     * @param sc
     */
    public void updateModel( Scanner sc){
        Note note = new Note();
        note.setSurname(readNext(sc, NoteEnum.SURNAME));
        note.setFirstName(readNext(sc, NoteEnum.FIRST_NAME));
        note.setPatronimic(readNext(sc, NoteEnum.PARTONOMIC));
        note.setShrotName();
        note.setNickName(readNext(sc, NoteEnum.NICK_NAME));
        note.setComment(readNext(sc, NoteEnum.COMMENT));
        note.setGroup(readNextGroup(sc, NoteEnum.GROUP));
        note.setHomePhone(readNext(sc, NoteEnum.HOME_PHONE));
        note.setMobilePhone(readNext(sc, NoteEnum.MOBILE_PHONE));
        note.setMobilePhoneSecond(readNext(sc, NoteEnum.MOBILE_PHONE_SECOND));
        note.setEmail(readNext(sc, NoteEnum.EMAIL));
        note.setSkype(readNext(sc, NoteEnum.SKYPE));
        note.setIndex(readNext(sc, NoteEnum.INDEX));
        note.setCity(readNext(sc, NoteEnum.CITY));
        note.setStreet(readNext(sc, NoteEnum.STREET));
        note.setHouseNumber(readNext(sc, NoteEnum.HOUSE));
        note.setAppartment(readNext(sc, NoteEnum.APARTMENT));
        note.setAddress();
        note.setCreationDate();
        note.setChangingDate();
        model.addNote(note);
    }
}
