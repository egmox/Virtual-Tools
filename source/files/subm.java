import java.awt.datatransfer.*;
import sun.audio.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

class subm extends JFrame
{

public static void main(String asdf[])
  {
    pgbar();
  }
  static void pgbar(){
    final Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
    try{
UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
    }
    catch(Exception e){}
    JWindow load=new JWindow();
    JPanel loadp=new JPanel();
    JProgressBar pbar=new JProgressBar(0,100);
    pbar.setLayout(null);
    JLabel wait=new JLabel("Please wait...");
    JLabel lfiles=new JLabel();
    int a=dim.width/5/2;
    int w=load.getSize().width;
    int h=load.getSize().height;
    int x=((dim.width)/2)-a;
    int y=(dim.height)/2;
    load.setLocation(x,y);
    loadp.add(wait);
    loadp.add(pbar);
    loadp.add(lfiles);
    load.setContentPane(loadp);
    load.pack();
    load.setVisible(true);
    for(int i=0; i<100; i++)
    {
      pbar.setValue(i);
      try{
      Thread.sleep(10);
      }catch(InterruptedException e){}
    }
    load.setVisible(false);
    frameset f1=new frameset();
    Sound b=new Sound();
  }
}

class encrypter
{
  public encrypter(int aloc, int bloc, int asize, int bsize)
  {
    final JFrame encr=new JFrame("Encrypter");
    final int locx=aloc, locy=bloc, sizex=asize, sizey=bsize;
    encr.setBounds(locx,locy,sizex, sizey);
    JPanel panela=new JPanel();
    encr.add(panela);
    final TextArea text1=new TextArea(19,43);
    panela.add(text1);
    JButton start=new JButton("Start Encryption");
    JButton cancel=new JButton("Cancel");
    cancel.addActionListener(new ActionListener()
                               {
      public void actionPerformed(ActionEvent e)
      {
        encr.dispose();
      }
    });
    panela.add(start);
    panela.add(cancel);
    start.addActionListener(new ActionListener()
                              {
      public void actionPerformed(ActionEvent e)
      {
        String source=text1.getText();
        String input=text1.getText();
        final JFrame encrypted=new JFrame("Encrypted Text");
        encrypted.setUndecorated(true);
        encrypted.setBounds(locx,locy,sizex, sizey);
        JPanel encrp=new JPanel();
        encrypted.add(encrp);
        JTextArea encr2=new JTextArea();
        TextArea encr3=new TextArea(5,39);
        encrp.add(encr3);
        int loop, slen=input.length();
        for(loop=0; loop<slen; loop++)
        {
          char a=input.charAt(loop), b;
           if(a=='!'){encr2.setText(encr2.getText() + "\\u0021");}
      else if(a=='"'){encr2.setText(encr2.getText() + "\\u0022");}
      else if(a=='#'){encr2.setText(encr2.getText() + "\\u0023");}
      else if(a=='$'){encr2.setText(encr2.getText() + "\\u0024");}
      else if(a=='%'){encr2.setText(encr2.getText() + "\\u0025");}
      else if(a=='&'){encr2.setText(encr2.getText() + "\\u0026");}
     else if(a=='\''){encr2.setText(encr2.getText() + "\\u0027");}
      else if(a=='('){encr2.setText(encr2.getText() + "\\u0028");}
      else if(a==')'){encr2.setText(encr2.getText() + "\\u0029");}
      else if(a=='*'){encr2.setText(encr2.getText() + "\\u002A");}
      else if(a=='+'){encr2.setText(encr2.getText() + "\\u002B");}
      else if(a==','){encr2.setText(encr2.getText() + "\\u002C");}
      else if(a=='-'){encr2.setText(encr2.getText() + "\\u002D");}
      else if(a=='.'){encr2.setText(encr2.getText() + "\\u002E");}
      else if(a=='/'){encr2.setText(encr2.getText() + "\\u002F");}
      else if(a=='0'){encr2.setText(encr2.getText() + "\\u0030");}
      else if(a=='1'){encr2.setText(encr2.getText() + "\\u0031");}
      else if(a=='2'){encr2.setText(encr2.getText() + "\\u0032");}
      else if(a=='3'){encr2.setText(encr2.getText() + "\\u0033");}
      else if(a=='4'){encr2.setText(encr2.getText() + "\\u0034");}
      else if(a=='5'){encr2.setText(encr2.getText() + "\\u0035");}
      else if(a=='6'){encr2.setText(encr2.getText() + "\\u0036");}
      else if(a=='7'){encr2.setText(encr2.getText() + "\\u0037");}
      else if(a=='8'){encr2.setText(encr2.getText() + "\\u0038");}
      else if(a=='9'){encr2.setText(encr2.getText() + "\\u0039");}
      else if(a==':'){encr2.setText(encr2.getText() + "\\u003A");}
      else if(a==';'){encr2.setText(encr2.getText() + "\\u003B");}
      else if(a=='<'){encr2.setText(encr2.getText() + "\\u003C");}
      else if(a=='='){encr2.setText(encr2.getText() + "\\u003D");}
      else if(a=='>'){encr2.setText(encr2.getText() + "\\u003E");}
      else if(a=='?'){encr2.setText(encr2.getText() + "\\u003F");}
      else if(a=='@'){encr2.setText(encr2.getText() + "\\u0040");}
      else if(a=='A'){encr2.setText(encr2.getText() + "\\u0041");}
      else if(a=='B'){encr2.setText(encr2.getText() + "\\u0042");}
      else if(a=='C'){encr2.setText(encr2.getText() + "\\u0043");}
      else if(a=='D'){encr2.setText(encr2.getText() + "\\u0044");}
      else if(a=='E'){encr2.setText(encr2.getText() + "\\u0045");}
      else if(a=='F'){encr2.setText(encr2.getText() + "\\u0046");}
      else if(a=='G'){encr2.setText(encr2.getText() + "\\u0047");}
      else if(a=='H'){encr2.setText(encr2.getText() + "\\u0048");}
      else if(a=='I'){encr2.setText(encr2.getText() + "\\u0049");}
      else if(a=='J'){encr2.setText(encr2.getText() + "\\u004A");}
      else if(a=='K'){encr2.setText(encr2.getText() + "\\u004b");}
      else if(a=='L'){encr2.setText(encr2.getText() + "\\u004c");}
      else if(a=='M'){encr2.setText(encr2.getText() + "\\u004d");}
      else if(a=='N'){encr2.setText(encr2.getText() + "\\u004e");}
      else if(a=='O'){encr2.setText(encr2.getText() + "\\u004f");}
      else if(a=='P'){encr2.setText(encr2.getText() + "\\u0050");}
      else if(a=='Q'){encr2.setText(encr2.getText() + "\\u0051");}
      else if(a=='R'){encr2.setText(encr2.getText() + "\\u0052");}
      else if(a=='S'){encr2.setText(encr2.getText() + "\\u0053");}
      else if(a=='T'){encr2.setText(encr2.getText() + "\\u0054");}
      else if(a=='U'){encr2.setText(encr2.getText() + "\\u0055");}
      else if(a=='V'){encr2.setText(encr2.getText() + "\\u0056");}
      else if(a=='W'){encr2.setText(encr2.getText() + "\\u0057");}
      else if(a=='X'){encr2.setText(encr2.getText() + "\\u0058");}
      else if(a=='Y'){encr2.setText(encr2.getText() + "\\u0059");}
      else if(a=='Z'){encr2.setText(encr2.getText() + "\\u005A");}
      else if(a=='['){encr2.setText(encr2.getText() + "\\u005B");}
     else if(a=='\\'){encr2.setText(encr2.getText() + "\\u005C");}
      else if(a==']'){encr2.setText(encr2.getText() + "\\u005D");}
      else if(a=='^'){encr2.setText(encr2.getText() + "\\u005e");}
      else if(a=='_'){encr2.setText(encr2.getText() + "\\u005f");}
      else if(a=='`'){encr2.setText(encr2.getText() + "\\u0060");}
      else if(a=='a'){encr2.setText(encr2.getText() + "\\u0061");}
      else if(a=='b'){encr2.setText(encr2.getText() + "\\u0062");}
      else if(a=='c'){encr2.setText(encr2.getText() + "\\u0063");}
      else if(a=='d'){encr2.setText(encr2.getText() + "\\u0064");}
      else if(a=='e'){encr2.setText(encr2.getText() + "\\u0065");}
      else if(a=='f'){encr2.setText(encr2.getText() + "\\u0066");}
      else if(a=='g'){encr2.setText(encr2.getText() + "\\u0067");}
      else if(a=='h'){encr2.setText(encr2.getText() + "\\u0068");}
      else if(a=='i'){encr2.setText(encr2.getText() + "\\u0069");}
      else if(a=='j'){encr2.setText(encr2.getText() + "\\u006a");}
      else if(a=='k'){encr2.setText(encr2.getText() + "\\u006b");}
      else if(a=='l'){encr2.setText(encr2.getText() + "\\u006c");}
      else if(a=='m'){encr2.setText(encr2.getText() + "\\u006d");}
      else if(a=='n'){encr2.setText(encr2.getText() + "\\u006e");}
      else if(a=='o'){encr2.setText(encr2.getText() + "\\u006f");}
      else if(a=='p'){encr2.setText(encr2.getText() + "\\u0070");}
      else if(a=='q'){encr2.setText(encr2.getText() + "\\u0071");}
      else if(a=='r'){encr2.setText(encr2.getText() + "\\u0072");}
      else if(a=='s'){encr2.setText(encr2.getText() + "\\u0073");}
      else if(a=='t'){encr2.setText(encr2.getText() + "\\u0074");}
      else if(a=='u'){encr2.setText(encr2.getText() + "\\u0075");}
      else if(a=='v'){encr2.setText(encr2.getText() + "\\u0076");}
      else if(a=='w'){encr2.setText(encr2.getText() + "\\u0077");}
      else if(a=='x'){encr2.setText(encr2.getText() + "\\u0078");}
      else if(a=='y'){encr2.setText(encr2.getText() + "\\u0079");}
      else if(a=='z'){encr2.setText(encr2.getText() + "\\u007a");}
      else if(a=='{'){encr2.setText(encr2.getText() + "\\u007b");}
      else if(a=='|'){encr2.setText(encr2.getText() + "\\u007c");}
      else if(a=='}'){encr2.setText(encr2.getText() + "\\u007d");}
      else if(a=='~'){encr2.setText(encr2.getText() + "\\u007e");}
      else if(a==' '){encr2.setText(encr2.getText() + "\\u0020");}
      else if(a=='\n'){encr2.setText(encr2.getText() + "");}
      else{encr2.setText(encr2.getText() + a);}}
        encr3.setText("<script>document.write('" + encr2.getText() + "');</script>");
        final String finaldata=encr3.getText();
        final JTextArea finaltextfield=new JTextArea(finaldata);
        JButton copy=new JButton("Copy to clipBoard");
        final Clipboard clipboard=encrypted.getToolkit().getSystemClipboard();
        copy.addActionListener(new ActionListener()
                                 {
          public void actionPerformed(ActionEvent e)
          {
            String selection=finaltextfield.getText();
            StringSelection data = new StringSelection(selection);
            clipboard.setContents(data, data);
          }
        });
        encrp.add(copy);
        JButton close=new JButton("Close");
        
        close.addActionListener(new ActionListener()
                                  {
          public void actionPerformed(ActionEvent e)
          {
            encrypted.dispose();
          }
        });
        encrp.add(close);
        encrypted.setVisible(true);
      }
    });
    encr.setUndecorated(true);
    encr.setVisible(true);
  }
}
class makefolder
{
  JFrame folderlocker=new JFrame();
  JPanel panel4=new JPanel(new GridLayout(5,2));
  JPanel panel4d=new JPanel(new GridLayout(0,2));
  JLabel label1=new JLabel("Write Folder path");
  JLabel label2=new JLabel("Write Folder name");
  JLabel label3=new JLabel("Set password");
  JButton createlocker=new JButton("Create Locker");
  JTextField lcname=new JTextField(20);
  JTextField lcpath=new JTextField(20);
  JTextField setpass= new JPasswordField(20);
  JButton lockit=new JButton("Lock it");
  JButton unlockit=new JButton("Unlock it");
  JButton minimize=new JButton("Minimize");
  JButton close=new JButton("close");
  public makefolder(int locx, int locy, int  sizex, int sizey)
  {
    folderlocker.setBounds(locx, locy, sizex, sizey);
    panel4.add(label1);
    panel4.add(lcpath);
    panel4.add(label2);
    panel4.add(lcname);
    panel4.add(label3);
    panel4.add(setpass);
    lcpath.setText("c:");
    folderlocker.setUndecorated(true);
    folderlocker.add(panel4);
    label1.setHorizontalAlignment(JLabel.LEFT);
    label2.setHorizontalAlignment(JLabel.LEFT);
    label3.setHorizontalAlignment(JLabel.LEFT);
    createlocker.addActionListener(new ActionListener()
                                     {
      public void actionPerformed(ActionEvent e)
      {
        File locker=new File(lcpath.getText() + "/" + lcname.getText());
        File dirchek=new File(lcpath.getText());
        if(dirchek.isDirectory()){
        locker.mkdir();
        locker.setReadOnly();
        String fpath=lcpath.getText() + "/" + lcname.getText();
        JOptionPane.showMessageDialog(null,"Here is your Locker  \"" + fpath + "\"");
        String password=setpass.getText();
        alocker(fpath, password);
        }
        else
        {
          JOptionPane.showMessageDialog(null,"Invalid Directory");
        }
      }
    });
    panel4.add(createlocker);
    panel4.add(panel4d);
    panel4d.add(lockit);
    lockit.addActionListener(new ActionListener()
                               {
      public void actionPerformed(ActionEvent e)
      {
        try
        {
          String output=new Scanner(new File("c:/Windows/record.txt")).useDelimiter("\\Z").next();
          File locker=new File(output);
          File uhrec=new File("c:/Windows/record.txt");
          File hrec=new File("c:/Windows/record.lnk");
          File locked=new File(output + ".{20D04FE0-3AEA-1069-A2D8-08002B30309D}");
          locker.renameTo(locked);
          BufferedWriter writer=new BufferedWriter(new FileWriter("bat.txt"));
          writer.write("attrib +s +r +h " + output);
          uhrec.renameTo(hrec);
        }
        catch(Exception f){}
      }
    });
    panel4d.add(unlockit);
    folderlocker.setVisible(true);
    minimize.addActionListener(new ActionListener()
                                 {
      public void actionPerformed(ActionEvent e)
      {
        folderlocker.setExtendedState(Frame.ICONIFIED);
      }
    });
    panel4.add(minimize);
    panel4.add(close);
    close.addActionListener(new ActionListener()
                              {
      public void actionPerformed(ActionEvent e)
      {
        folderlocker.dispose();
      }
    });
  }
  public void alocker(String address, String ps)
  {
    String addr=address;
    String dth=ps;
    File locker=new File(addr);
    locker.mkdir();
    try
    {
      FileWriter fstream = new FileWriter("c:/windows/record.txt");
      BufferedWriter rec = new BufferedWriter(fstream);
      rec.write(addr);
      rec.close();
      FileWriter fstream2=new FileWriter("c:/windows/dth.txt");
      BufferedWriter dth2=new BufferedWriter(fstream2);
      dth2.write(dth);
      dth2.close();
    }
    catch (Exception e){}
  }
}
class frameset extends JFrame
{
  Point startDrag=null, curLocation=null;
  JLabel label1=new JLabel("Gulshan");
      static ContinuousAudioDataStream loop=null;
  public frameset()
  {
    final AudioPlayer musicPlayer = AudioPlayer.player;
    final JFrame frame1= new JFrame();
    final JPanel panel1=new JPanel(new GridLayout(2,2));
    panel1.setBounds(0,0,392,300);
    final JPanel mainpanel=new JPanel();
    mainpanel.setLayout(null);
    panel1.setBackground(new Color(45,45,45));
    mainpanel.add(panel1);
    final JButton button1=new JButton();
    button1.setIcon(new ImageIcon(getClass().getResource("encr.png")));
    JButton button4=new JButton();
    button4.setIcon(new ImageIcon(getClass().getResource("locker.png")));
    JButton button5=new JButton();
    button5.setIcon(new ImageIcon("flip.png"));
    Point loc=frame1.getLocation();
    final int locx=loc.x, locy=loc.y;
    final int sizex=frame1.getWidth(), sizey=frame1.getHeight();
    button5.addActionListener(new ActionListener()
                                {
      public void actionPerformed(ActionEvent e)
      {
    final JFrame flipper=new JFrame();
    JPanel panel=new JPanel();
    flipper.add(panel);
    final TextArea text1=new TextArea(20,30);
    panel.add(text1);
    JButton flip=new JButton("Flip");
    JButton cancel=new JButton("Cancel");
    cancel.addActionListener(new ActionListener()
                                {
      public void actionPerformed(ActionEvent e)
      {
        flipper.dispose();
      }
    });
    panel.add(flip);
    panel.add(cancel);
    flip.addActionListener(new ActionListener()
                              {
      public void actionPerformed(ActionEvent e)
      {
        String source=text1.getText();
        String input=text1.getText();
        final JFrame flipped=new JFrame("flipped Text");
        JPanel flippedp=new JPanel();
        flipped.add(flippedp);
        JTextArea flip2=new JTextArea();
        TextArea flip3=new TextArea();
        flippedp.add(flip3);
        int loop, slen=input.length();
        for(loop=0; loop<slen; loop++)
        {
           char a=input.charAt(loop), b;
           if(a=='!'){flip2.setText(flip2.getText() + "\u00A1");}
      else if(a=='"'){flip2.setText(flip2.getText() + "\\u0022");}
      else if(a=='#'){flip2.setText(flip2.getText() + "\u0023");}
      else if(a=='$'){flip2.setText(flip2.getText() + "\u0024");}
      else if(a=='%'){flip2.setText(flip2.getText() + "\u0025");}
      else if(a=='&'){flip2.setText(flip2.getText() + "\u214B");}
     else if(a=='\''){flip2.setText(flip2.getText() + "");}
      else if(a=='('){flip2.setText(flip2.getText() + "\u0029");}
      else if(a==')'){flip2.setText(flip2.getText() + "\u0028");}
      else if(a=='*'){flip2.setText(flip2.getText() + "\u002A");}
      else if(a=='+'){flip2.setText(flip2.getText() + "\u002B");}
      else if(a==','){flip2.setText(flip2.getText() + "\u0027");}
      else if(a=='-'){flip2.setText(flip2.getText() + "\u002D");}
      else if(a=='.'){flip2.setText(flip2.getText() + "\u02D9");}
      else if(a=='/'){flip2.setText(flip2.getText() + "\\");}
      else if(a=='0'){flip2.setText(flip2.getText() + "\u0030");}
      else if(a=='1'){flip2.setText(flip2.getText() + "\u0031");}
      else if(a=='2'){flip2.setText(flip2.getText() + "\u0032");}
      else if(a=='3'){flip2.setText(flip2.getText() + "\u0033");}
      else if(a=='4'){flip2.setText(flip2.getText() + "\u0034");}
      else if(a=='5'){flip2.setText(flip2.getText() + "\u0035");}
      else if(a=='6'){flip2.setText(flip2.getText() + "\u0036");}
      else if(a=='7'){flip2.setText(flip2.getText() + "\u0037");}
      else if(a=='8'){flip2.setText(flip2.getText() + "\u0038");}
      else if(a=='9'){flip2.setText(flip2.getText() + "\u0039");}
      else if(a==':'){flip2.setText(flip2.getText() + "\u003A");}
      else if(a==';'){flip2.setText(flip2.getText() + "\u003B");}
      else if(a=='<'){flip2.setText(flip2.getText() + "\u003C");}
      else if(a=='='){flip2.setText(flip2.getText() + "\u003D");}
      else if(a=='>'){flip2.setText(flip2.getText() + "\u003E");}
      else if(a=='?'){flip2.setText(flip2.getText() + "\u003F");}
      else if(a=='@'){flip2.setText(flip2.getText() + "\u0040");}
      else if(a=='A'){flip2.setText(flip2.getText() + "\u2200");}
      else if(a=='B'){flip2.setText(flip2.getText() + "\u0042");}
      else if(a=='C'){flip2.setText(flip2.getText() + "\u0186");}
      else if(a=='D'){flip2.setText(flip2.getText() + "\u15E1");}
      else if(a=='E'){flip2.setText(flip2.getText() + "\u018E");}
      else if(a=='F'){flip2.setText(flip2.getText() + "\u2132");}
      else if(a=='G'){flip2.setText(flip2.getText() + "\u2141");}
      else if(a=='H'){flip2.setText(flip2.getText() + "\u0048");}
      else if(a=='I'){flip2.setText(flip2.getText() + "\u0049");}
      else if(a=='J'){flip2.setText(flip2.getText() + "\u017F");}
      else if(a=='K'){flip2.setText(flip2.getText() + "\u004b");}
      else if(a=='L'){flip2.setText(flip2.getText() + "\u02E5");}
      else if(a=='M'){flip2.setText(flip2.getText() + "\u0057");}
      else if(a=='N'){flip2.setText(flip2.getText() + "\u004E");}
      else if(a=='O'){flip2.setText(flip2.getText() + "\u004F");}
      else if(a=='P'){flip2.setText(flip2.getText() + "\u0500");}
      else if(a=='Q'){flip2.setText(flip2.getText() + "\u038C");}
      else if(a=='R'){flip2.setText(flip2.getText() + "\u1D1A");}
      else if(a=='S'){flip2.setText(flip2.getText() + "\u0053");}
      else if(a=='T'){flip2.setText(flip2.getText() + "\u22A5");}
      else if(a=='U'){flip2.setText(flip2.getText() + "\u2229");}
      else if(a=='V'){flip2.setText(flip2.getText() + "\u039B");}
      else if(a=='W'){flip2.setText(flip2.getText() + "\u004D");}
      else if(a=='X'){flip2.setText(flip2.getText() + "\u0058");}
      else if(a=='Y'){flip2.setText(flip2.getText() + "\u2144");}
      else if(a=='Z'){flip2.setText(flip2.getText() + "\u005A");}
      else if(a=='['){flip2.setText(flip2.getText() + "\u005D");}
      else if(a==']'){flip2.setText(flip2.getText() + "\u005B");}
      else if(a=='^'){flip2.setText(flip2.getText() + "\u005e");}
      else if(a=='_'){flip2.setText(flip2.getText() + "\u203E");}
      else if(a=='`'){flip2.setText(flip2.getText() + "\u002C");}
      else if(a=='a'){flip2.setText(flip2.getText() + "\u0250");}
      else if(a=='b'){flip2.setText(flip2.getText() + "\u0071");}
      else if(a=='c'){flip2.setText(flip2.getText() + "\u0254");}
      else if(a=='d'){flip2.setText(flip2.getText() + "\u0070");}
      else if(a=='e'){flip2.setText(flip2.getText() + "\u01dd");}
      else if(a=='f'){flip2.setText(flip2.getText() + "\u025f");}
      else if(a=='g'){flip2.setText(flip2.getText() + "\u0183");}
      else if(a=='h'){flip2.setText(flip2.getText() + "\u0265");}
      else if(a=='i'){flip2.setText(flip2.getText() + "\u0131");}
      else if(a=='j'){flip2.setText(flip2.getText() + "\u027e");}
      else if(a=='k'){flip2.setText(flip2.getText() + "\u029e");}
      else if(a=='l'){flip2.setText(flip2.getText() + "\u2142");}
      else if(a=='m'){flip2.setText(flip2.getText() + "\u026f");}
      else if(a=='n'){flip2.setText(flip2.getText() + "\u0075");}
      else if(a=='o'){flip2.setText(flip2.getText() + "\u006f");}
      else if(a=='p'){flip2.setText(flip2.getText() + "\u0064");}
      else if(a=='q'){flip2.setText(flip2.getText() + "\u0062");}
      else if(a=='r'){flip2.setText(flip2.getText() + "\u0279");}
      else if(a=='s'){flip2.setText(flip2.getText() + "\u0073");}
      else if(a=='t'){flip2.setText(flip2.getText() + "\u0287");}
      else if(a=='u'){flip2.setText(flip2.getText() + "\u0075");}
      else if(a=='v'){flip2.setText(flip2.getText() + "\u0076");}
      else if(a=='w'){flip2.setText(flip2.getText() + "\u0077");}
      else if(a=='x'){flip2.setText(flip2.getText() + "\u0078");}
      else if(a=='y'){flip2.setText(flip2.getText() + "\u0079");}
      else if(a=='z'){flip2.setText(flip2.getText() + "\u007a");}
      else if(a=='{'){flip2.setText(flip2.getText() + "\u007b");}
      else if(a=='|'){flip2.setText(flip2.getText() + "\u007c");}
      else if(a=='}'){flip2.setText(flip2.getText() + "\u007d");}
      else if(a=='~'){flip2.setText(flip2.getText() + "\u007e");}
      else if(a==' '){flip2.setText(flip2.getText() + "\u0020");}
      else if(a=='\n'){flip2.setText(flip2.getText() + "");}
      else{flip2.setText(a + flip2.getText());}}
        flip3.setText(flip2.getText());
        flipped.setSize(800,400);
        flipped.setVisible(true);
      }
    });
    JButton copybut=new JButton("Copy to clipBoard");
    flipper.setSize(400, 400);
    flipper.setUndecorated(true);
    flipper.setVisible(true);
      }
    });
    JButton button6=new JButton();
    button6.setIcon(new ImageIcon("speak.png"));
    JButton button7=new JButton();
    button7.setIcon(new ImageIcon("about.png"));
    button7.addActionListener(new ActionListener()
                                {
      public void actionPerformed(ActionEvent e)
      {
        final JFrame about=new JFrame();
        JPanel list=new JPanel(new GridLayout(11,1));
        JLabel ab1=new JLabel("<HTML><center><font size='7'>Virtual Tools</font></center></HTML>");
        JLabel ab2=new JLabel();
        JLabel ab3=new JLabel("<html><font size='4'><b>Developed By:</b></font></html>");
        JLabel ab4=new JLabel("<HTML><font color='blue'><u>Gulshan Mishra</u>, <u>Divyank Gupta</u> and <u>Ankit Kumar</u>.</font></HTML>");
        JLabel ab5=new JLabel("from");
        JLabel ab6=new JLabel("ITESM");
        JLabel ab7=new JLabel("IIT Dwarka");
        JLabel ab8=new JLabel();
        JLabel ab9=new JLabel();
        JLabel ab10=new JLabel();
        JLabel ab11=new JLabel();
        JButton ok=new JButton("Ok");
        ok.addActionListener(new ActionListener()
                               {
          public void actionPerformed(ActionEvent e)
          {
            about.dispose();
          }
        });
        list.add(ab1);
        list.add(ab2);
        list.add(ab3);
        list.add(ab4);
        list.add(ab5);
        list.add(ab6);
        list.add(ab7);
        list.add(ok);
        about.add(list);
        Point loc=frame1.getLocation();
        int locx=loc.x, locy=loc.y;
        int sizex=frame1.getWidth(), sizey=frame1.getHeight();
        about.setBounds(locx,locy,sizex,sizey);
        about.setUndecorated(true);
        about.setVisible(true);
      }
    });
    JButton button8=new JButton();
    button8.setIcon(new ImageIcon("help.png"));
    JButton button9=new JButton("close");
    final JTextArea text2=new JTextArea("Write code here");
    JTextArea getoutput=new JTextArea();
    JFileChooser fc1=new JFileChooser();
    frame1.setBounds(0,0,392,340);
    frame1.setLocation(300,300);
    frame1.add(mainpanel);
    mainpanel.setLocation(500,230);
    panel1.add(button1);
    button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
              Point location=frame1.getLocation();
              int aloc=location.x, bloc=location.y;
              int asize=frame1.getWidth(), bsize=frame1.getHeight();
              encrypter obj=new encrypter(aloc, bloc, asize, bsize);
            }
        });
    panel1.add(button4);
    button4.addActionListener(new ActionListener()
                                {
      public void actionPerformed(ActionEvent e)
      {
        Point loc=frame1.getLocation();
        int locx=loc.x, locy=loc.y;
        int sizex=frame1.getWidth(), sizey=frame1.getHeight();
        makefolder md=new makefolder(locx, locy, sizex, sizey);
      }
    });
    panel1.add(button5);
    panel1.add(button6);
    button6.addActionListener(new ActionListener()
                                {
      public void actionPerformed(ActionEvent e)
      {
        final JFrame speakf=new JFrame();
        speakf.setUndecorated(true);
        final JPanel inpane=new JPanel();
        final JTextArea input=new JTextArea(18,30);
        inpane.add(input);
        speakf.add(inpane);
        int locx=frame1.getLocation().x, locy=frame1.getLocation().y;
        int width=frame1.getWidth(), height=frame1.getHeight();
        speakf.setBounds(locx,locy,width,height);
        JButton speak=new JButton("Speak");
        inpane.add(speak);
        speak.addActionListener(new ActionListener ()
                                  {
          public void actionPerformed(ActionEvent e)
          {
            try{
            BufferedWriter speaker=new BufferedWriter(new FileWriter("c:/windows/speaker.vbs"));
            speaker.write("Set sapi=CreateObject(\"sapi.spvoice\")\nsapi.Speak(\""
                            + "" + input.getText() + "\")");
            speaker.close();
            BufferedWriter sprun=new BufferedWriter(new FileWriter("c:/windows/sprun.bat"));
            sprun.write("speaker.vbs");
            sprun.close();
            Runtime.getRuntime().exec("c:\\windows\\sprun.bat");
            }
            catch(Exception f){f.printStackTrace();}
          }
        });
        JButton cancle=new JButton("Cancle");
        cancle.addActionListener(new ActionListener()
                                  {
          public void actionPerformed(ActionEvent e)
          {
            speakf.dispose();
          }
        });
        inpane.add(cancle);
        speakf.setVisible(true);
      }
    });
    panel1.add(button7);
    panel1.add(button8);
    final JPanel panel2=new JPanel();
    final JPanel panel2a=new JPanel();
    final JPanel panel2b=new JPanel();
    JLabel title=new JLabel("Virtual Tools");
    Image bg = new ImageIcon("clo.jpg").getImage();
    ImageIcon bgi = new ImageIcon(bg);
    JLabel image=new JLabel(bgi);
    Image bg2 =new ImageIcon("min.jpg").getImage();
    ImageIcon bgi2= new ImageIcon(bg2);
    JLabel image2=new JLabel(bgi2);
    JLabel label2b =new JLabel();
    label2b.setIcon(new ImageIcon("icon.jpg"));
    panel2.setLayout(null);
    panel2.setBackground(new Color(25,25,25));
    panel2b.setBackground(new Color(150,150,150));
    panel2.setBounds(0,0,400,45);
    panel2.setLocation(0,300);
    panel2.add(image2);
    panel2.add(panel2b);
    panel2.add(image);
    image2.setBounds(1,1,40,38);
    image2.addMouseListener(new MouseAdapter()
                               {
      public void mouseClicked(MouseEvent e)
      {
        frame1.setExtendedState(Frame.ICONIFIED);
      }
    });
    panel2b.setBounds(43,1,304,38);
    panel2b.add(title);
    panel2b.addMouseListener(new MouseAdapter(){
      public void mousePressed(MouseEvent e)
      {
        final Point floc=frame1.getLocation();
        final Point mstart=getLocation();
        panel2b.addMouseMotionListener(new MouseAdapter()
                                  {
          public void mouseEntered(MouseEvent e)
          {
            panel2b.setBackground(Color.RED);
          }
          public void mouseDragged(MouseEvent e)
          {
            int flocx=floc.x, flocy=floc.y;
            Point mcur=e.getPoint();
            int curx=mcur.x, cury=mcur.y;
            int firstx=mstart.x, firsty=mstart.y;
            int lastx=mcur.x, lasty=mcur.y;
            int oldframex=floc.x, oldframey=floc.y;
            frame1.setLocation(((lastx-firstx)+oldframex),((lasty-firsty)+oldframey));
          }
        });
      }
      public void mouseReleased(MouseEvent e)
      {
        
      }
    });
    image.setBounds(345,1,50,38);
    try {
      AudioStream backgroundMusic = new AudioStream(new FileInputStream("2chimes.wav"));
      AudioData musicData = backgroundMusic.getData();
      loop = new ContinuousAudioDataStream(musicData);
    } catch (IOException error){}
    final JWindow soundw1=new JWindow();
    final JWindow soundw2=new JWindow();
    musicPlayer.start(loop);
    JButton stop=new JButton();
    stop.setIcon(new ImageIcon("speak0.png"));
    JButton start = new JButton();
    soundw1.add(stop);
    soundw2.add(start);
    start.setIcon(new ImageIcon("speak1.png"));
    stop.addActionListener(new ActionListener()
                              {
      public void actionPerformed(ActionEvent e)
      {
        musicPlayer.stop(loop);
      }
    });
    start.addActionListener(new ActionListener()
                              {
      public void actionPerformed(ActionEvent e)
      {
        musicPlayer.start(loop);
      }
    });
    Point location=frame1.getLocation();
    int aloc=location.x, bloc=location.y;
    int asize=frame1.getWidth(), bsize=frame1.getHeight();
    soundw1.setBackground(Color.RED);
    soundw1.pack();
    soundw1.setLocation(aloc+2+asize,bloc);
    soundw1.setVisible(true);
    soundw2.setBackground(Color.RED);
    soundw2.pack();
    soundw2.setLocation(aloc+asize+2,bloc+soundw1.getHeight());
    soundw2.setVisible(true);
    image.addMouseListener(new MouseAdapter()
                                {
      public void mouseClicked(MouseEvent e)
      {
        frame1.dispose();
        soundw1.dispose();
        soundw2.dispose();
        musicPlayer.stop(loop);
      }
    });
    mainpanel.add(panel2);
    frame1.setUndecorated(true);
    frame1.setResizable(false);
    frame1.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
    frame1.setResizable(false);
    frame1.setVisible(true);
  }
}