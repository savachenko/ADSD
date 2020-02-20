import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public  class ZorgAppGui  extends javax.swing.JFrame {

    private Profile profile1;
    String title;
    JFrame f, fShowOptions;
    JLabel InfoLabel;
    JLabel l1, l2, l3, l4, l5, l6;
    protected String StringShowInfo1;
    protected String StringShowInfo2;
    public int k;

    public ZorgAppGui (Profile profile)

    {

        JMenu mymenu=new JMenu("mijn menu");

        JMenuItem optie1=new JMenu ( "Ik ben een patient");
        JMenuItem optie2=new JMenu ( "Ik ben een zorgverlener");
        JMenuItem optie1_1 =new JMenuItem ("mijn gegvens inzien");
        JMenuItem optie1_2 =new JMenuItem ("mijn gegvens aanpassen");
        JMenuItem optie2_1 =new JMenuItem ("patient gegvens inzien");
        JMenuItem optie2_2 =new JMenuItem ("patient gegvens aanpassen");
        optie1.add(optie1_1);
        optie1.add(optie1_2);

        optie2.add(optie2_2);

        optie2.add(optie2_1);
        optie1_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "optie1");
                // System.out.println("optie1");
                showProfileInfo(profile);
            }
        });

        optie1_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "optie2");

                update(profile);
            }
        });


        optie2_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "optie1");
                // System.out.println("optie1");
                showProfileInfo(profile);
            }
        });

        optie2_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(null, "optie2");
                update(profile);
            }
        });

        Container c= getContentPane();
        c.setLayout(new BorderLayout());
        mymenu.add(optie1);
        mymenu.add(optie2);
        JMenuBar bar=new JMenuBar();
        setJMenuBar(bar);
        bar.add(mymenu);

        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }



    public void ShowMessageDialog (Profile profile)
    {

        fShowOptions = new JFrame(title);
        JButton showInfo1 = new JButton("<html><div style='color:blue;font-size:medium;'><p style='text-align:center; padding:4px;margin:12px;'>" + this.StringShowInfo1 + "</p></div></html>");
        JButton showInfo2 = new JButton("<html><div style='color:blue;font-size:medium;'><p style='text-align:center; padding:4px;margin:12px;'>" + this.StringShowInfo2 + "</p></div></html>");

        //fShowOptions.add(InfoLabel);
        fShowOptions.add(showInfo1);
        fShowOptions.add(showInfo2);

        fShowOptions.setLayout(new GridLayout(3, 1));
        fShowOptions.setSize(300, 300);
        fShowOptions.setVisible(true);

        showInfo1.addActionListener(e -> {

            showProfileInfo(profile);

        });


        showInfo2.addActionListener(e -> {

            update(profile);

        });

    }

    public void showProfileInfo (Profile profile )
    {
        String title="Inzien patiënt profielgegevens";

        JLabel l1,l2, l3, l4,l5, l6;

        fShowOptions = new JFrame(title);

        l1=new JLabel("<html> <p style='margin:8px;'> patiënt voornaam:  "+ "<span style='color:blue;font-style: italic;'>"+profile.getVoorNaam()+"</span></html>" +k) ;

        l2=new JLabel("<html> <p style='margin:8px;'>patiënt achternaam:  "+ "<span style='color:blue;font-style: italic;'>"+profile.getAchterNaam()+"</span></html>");
        //l2.setBounds(50,150, 300,30);
        l3=new JLabel("<html> <p style='margin:8px;'>patiënt leeftijd:  "+ "<span style='color:blue;font-style: italic;'>"+ profile.getLeeftijd() +"</span></html>");
        //l3.setBounds(50,200, 300,30);
        l4=new JLabel("<html><p style='margin:8px;'> patiënt gewicht:  "+ "<span style='color:blue;font-style: italic;'>"+ profile.getGewicht()+"</span></html>");
        // l4.setBounds(50,250, 300,30);
        l5=new JLabel("<html> <p style='margin:8px;'>patiënt lengte:  "+ "<span style='color:blue;font-style: italic;'>"+ profile.getLengte()+"</span></html>") ;
        // l5.setBounds(50,300, 300,30);
        l6=new JLabel("<html> <p style='margin:8px;'>patiënt BMI:  "+ "<span style='color:blue;font-style: italic;'>"+ profile.getBmi()+"</span> </p></html>") ;

        fShowOptions.add(l1); fShowOptions.add(l2);  fShowOptions.add(l3); fShowOptions.add(l4); fShowOptions.add(l5); fShowOptions.add(l6);

        fShowOptions.setLayout(new GridLayout(5, 2));

        fShowOptions.setVisible(true);

        fShowOptions.setSize(450, 500);

    }
    public void test()
    {

    }


    public void update (Profile profile)
    {
        String title="patiënt gegevens aanpassen";
        JFrame f= new JFrame(title);

        JLabel l1,l2, l3;   JTextField t1,t2,t3;

        l1=new JLabel("<html> <span> patiënt voornaam:  "+"</span></p></html>" ) ;
        l1.setBounds(50,100, 300,30);

        t1=new JTextField();
        t1.setBounds(50,150, 300,30);

        l2=new JLabel("<html> <span>patiënt achternaam:  "+"</span></html>");
        l2.setBounds(50,200, 300,30);

        t2=new JTextField();
        t2.setBounds(50,250, 300,30);

        l3=new JLabel("<html> <p>patiënt leeftijd:  "+"</span></html>");
        l3.setBounds(50,300, 300,30);

        t3=new JTextField();
        t3.setBounds(50,350, 50,30);

        JButton updateb=new JButton("OK");
        updateb.setBounds(50,400,95,30);


        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3); f.add(t3);
        f.add(updateb);

        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);
        //f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

        updateb.addActionListener(e -> {

            String myName=t1.getText();
            String mySurname = t2.getText();
            String myAge=t3.getText();



            if (myName.trim().length() != 0) {
                l1.setText("<html><p> patiënt voornaam:  " + "<span style='color:blue;font-style: italic;'>" + myName + "</span></p></html>");
                profile.changeName(myName);
                System.out.println( profile.getVoorNaam());
            }

            else
            {
                l1.setText("<html><p> patiënt voornaam:  " + "<span style='color:blue;font-style: italic;'>" + profile.getVoorNaam() + "</span></p></html>");

            }

            if (mySurname.trim().length() != 0) {

                l2.setText("<html><p> patiënt achternaam:  " + "<span style='color:blue;font-style: italic;'>" + mySurname + "</span></p></html>");
                profile.changeSurname(mySurname);
                System.out.println(profile.getAchterNaam());
            }

            else
            {
                l2.setText("<html><p> patiënt achternaam:  " + "<span style='color:blue;font-style: italic;'>" + profile.getAchterNaam() + "</span></p></html>");

            }

            if (myAge.trim().length() != 0) {

                l3.setText("<html><p> patiënt leeftijd:  " + "<span style='color:blue;font-style: italic;'>" + myAge + "</span></p></html>");

                int intAge = Integer.parseInt(myAge);
                profile.changeAge(intAge);
                System.out.println(profile.getLeeftijd());
            }

            else {
                l3.setText("<html><p> patiënt leeftijd:  " + "<span style='color:blue;font-style: italic;'>" + profile.getLeeftijd() + "</span></p></html>");


            }

            updateb.setVisible(false);

        });

    }









    public static void main(String[] args) {


    }
}
