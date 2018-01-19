import javax.swing.*;
import java.awt.event.ActionListener;

//the view takes info entered by user and passes it to whomever needs to use the info or data

public class CalculatorView extends JFrame {
    private JTextField firstNum = new JTextField(10);
    private JLabel plusOperator = new JLabel("+");
    private JTextField secondNum = new JTextField(10);
    private JButton equalSignButton = new JButton("=");
    private JTextField calcValue = new JTextField(10);

    CalculatorView(){
        // set up the view and add the components
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200, 600);

        calcPanel.add(firstNum);
        calcPanel.add(plusOperator);
        calcPanel.add(secondNum);
        calcPanel.add(equalSignButton);
        calcPanel.add(calcValue);

        this.add(calcPanel);

        //end of setting up components
    }

    public int getFirstNum(){
        return Integer.parseInt(firstNum.getText());
    }

    public int getSecondNum(){
        return Integer.parseInt(secondNum.getText());
    }

    public int getCalcSolution(){
        return Integer.parseInt(calcValue.getText());
    }

    public void setCalcValue(int solution){
        calcValue.setText(Integer.toString(solution));
    }

    //if equal sign is clicked execute a method in the controller named ActionPerformed

    void addCalcListener(ActionListener ListenforEqualButton){
        equalSignButton.addActionListener(ListenforEqualButton);
    }

    //open a popup that contains the error message passed
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
