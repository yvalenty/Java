import javax.swing.*;

public abstract class GraczView {
    JPanel gameWindow=new JPanel();
    JButton button1, button2, button3;
    JLabel selN1, selN2, lw;
    JButton[] buttons;
    JFrame frameXO;

    public abstract void gameCoin();

    public abstract void endGame(String wygrales);

    public abstract void gameXO();

    public void gameKNP(){}

    public void gameDeer(){}
    /*public void showResults(){
        JTextArea textArea = new JTextArea(6, 18);
        textArea.setText("-----------Wyniki-----------\n" + "Gracz1                Gracz2\n");
        textArea.setText(textArea.getText()+ "-------------------------------\n");
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        for (int i=0; i<repeats; i++){
            for (int k=0; k<2; k++){
                textArea.setText(textArea.getText()+ "    " + gcrecords[i][k] + "                        ");
                gcrecords[repeats][k]+= gcrecords[i][k];
            }
            textArea.setText(textArea.getText()+ "\n");
        }
        textArea.setText(textArea.getText()+ "-------------------------------\n");
        textArea.setText(textArea.getText()+ "    " + gcrecords[repeats][0] + "                            " + gcrecords[repeats][1] +"\n");

        JOptionPane.showMessageDialog(gameWindow, scrollPane);
    }
    */
}
