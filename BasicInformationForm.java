import java.awt.*;
import java.awt.event.*;

public class BasicInformationForm extends Frame implements ActionListener {
    Label firstNameLbl, lastNameLbl, mobileNumberLbl, genderLbl, hobbiesLbl;
    TextField firstNameTxt, lastNameTxt, mobileNumberTxt;
    CheckboxGroup genderGroup;
    Checkbox maleCheckbox, femaleCheckbox;
    Checkbox readingCheckbox, musicCheckbox, dancingCheckbox;
    Button submitBtn;

    BasicInformationForm() {
        setTitle("Basic Information Form");
        setSize(400, 300);
        setLayout(null);

        firstNameLbl = new Label("First Name:");
        firstNameLbl.setBounds(50, 50, 80, 20);
        add(firstNameLbl);

        firstNameTxt = new TextField();
        firstNameTxt.setBounds(150, 50, 150, 20);
        add(firstNameTxt);

        lastNameLbl = new Label("Last Name:");
        lastNameLbl.setBounds(50, 80, 80, 20);
        add(lastNameLbl);

        lastNameTxt = new TextField();
        lastNameTxt.setBounds(150, 80, 150, 20);
        add(lastNameTxt);

        mobileNumberLbl = new Label("Mobile Number:");
        mobileNumberLbl.setBounds(50, 110, 100, 20);
        add(mobileNumberLbl);

        mobileNumberTxt = new TextField();
        mobileNumberTxt.setBounds(150, 110, 150, 20);
        add(mobileNumberTxt);

        genderLbl = new Label("Gender:");
        genderLbl.setBounds(50, 140, 60, 20);
        add(genderLbl);

        genderGroup = new CheckboxGroup();
        maleCheckbox = new Checkbox("Male", genderGroup, false);
        maleCheckbox.setBounds(150, 140, 60, 20);
        add(maleCheckbox);

        femaleCheckbox = new Checkbox("Female", genderGroup, false);
        femaleCheckbox.setBounds(220, 140, 70, 20);
        add(femaleCheckbox);

        hobbiesLbl = new Label("Hobbies:");
        hobbiesLbl.setBounds(50, 170, 60, 20);
        add(hobbiesLbl);

        readingCheckbox = new Checkbox("Reading");
        readingCheckbox.setBounds(150, 170, 70, 20);
        add(readingCheckbox);

        musicCheckbox = new Checkbox("Music");
        musicCheckbox.setBounds(220, 170, 60, 20);
        add(musicCheckbox);

        dancingCheckbox = new Checkbox("Dancing");
        dancingCheckbox.setBounds(290, 170, 70, 20);
        add(dancingCheckbox);

        submitBtn = new Button("Submit");
        submitBtn.setBounds(150, 210, 80, 30);
        add(submitBtn);
        
        submitBtn.addActionListener(this);

        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String firstName = firstNameTxt.getText();
        String lastName = lastNameTxt.getText();
        String mobileNumber = mobileNumberTxt.getText();

        String gender = "";
        if (maleCheckbox.getState()) {
            gender = "Male";
        } else if (femaleCheckbox.getState()) {
            gender = "Female";
        }

        String hobbies = "";
        if (readingCheckbox.getState()) {
            hobbies += "Reading ";
        }
        if (musicCheckbox.getState()) {
            hobbies += "Music ";
        }
        if (dancingCheckbox.getState()) {
            hobbies += "Dancing";
        }

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Gender: " + gender);
        System.out.println("Hobbies: " + hobbies);
    }

    public static void main(String[] args) {
        new BasicInformationForm();
    }
}
