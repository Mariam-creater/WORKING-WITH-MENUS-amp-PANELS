import java.awt.*;
import javax.swing.*;


public class MenuClass {
    public static void main(String args[]) {

        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 1000, 500);
        frame.setTitle("WORKING WITH MENUS &amp; PANELS");
        Container maryan = frame.getContentPane();
        maryan.setBackground(Color.pink);
        JMenuBar menubar = new JMenuBar();

        JMenu maryam = new JMenu("User Profile");
        JMenuItem MaryamItem11 = new JMenuItem("View Profile");
        MaryamItem11.addActionListener(e -> {
            JFrame secondframe = new JFrame();
            secondframe.setBounds(100, 100, 1000, 500);
            secondframe.setTitle("WORKING WITH MENUS & PANELS");
            Container maryan1 = secondframe.getContentPane();
            maryan1.setBackground(Color.pink);

            JPanel panel = new JPanel();
            panel.setBackground(Color.LIGHT_GRAY);
            JLabel label = new JLabel("Welcome to the Page View Profile!");
            JButton closeButton = new JButton("Close");
            closeButton.addActionListener(ev ->
                    secondframe.dispose()

            );

            panel.add(label);
            panel.add(closeButton);
            secondframe.add(panel);
            secondframe.setVisible(true);
        });



        JMenuItem MaryamItem22=new JMenuItem("Edit Profile");
        JMenuItem MaryamItem33=new JMenuItem("Change Password");
        JMenuItem MaryamItem44 =new JMenuItem("Logout");

                  maryam.add(MaryamItem11);
                  maryam.add(MaryamItem22);
                  maryam.add(MaryamItem33);
                  maryam.add(MaryamItem44);
                  menubar.add(maryam);

            JMenu yasin= new JMenu("Dashboard");
               JMenuItem MaryamItem1=new JMenuItem("Overview");
               JMenuItem MaryamItem2=new JMenuItem("Recent Activity");
               JMenuItem MaryamItem3=new JMenuItem("Quick Access");
               JMenuItem MaryamItem4 =new JMenuItem("Notifications");
                        yasin.add(MaryamItem1);
                        yasin.add(MaryamItem2);
                        yasin.add(MaryamItem3);
                        yasin.add(MaryamItem4);
                        menubar.add(yasin);

        JMenu settings= new JMenu("settings");
        JMenuItem settingsItem1=new JMenuItem("Change Theme");
        JMenuItem settingsItem2=new JMenuItem("Set Preferences");
        JMenuItem settingsItem3=new JMenuItem("Manage Users");
        JMenuItem settingsItem4 =new JMenuItem("Notifications");
        settings.add(settingsItem1);
        settings.add(settingsItem2);
        settings.add(settingsItem3);
        settings.add(settingsItem4);
        menubar.add(settings);







        frame.setJMenuBar(menubar);
        frame.setVisible(true);
    }
}
