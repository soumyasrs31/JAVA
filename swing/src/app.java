import javax.swing.*;
class MenuExample
{
    JMenu menu, development;
    JMenuItem i1, i2, i3, i4, i5;
    MenuExample(){
        JFrame f= new JFrame("Menu and MenuItem Example");
        JMenuBar mb=new JMenuBar();
        menu=new JMenu("Menu");
        development=new JMenu("Development");
        i1=new JMenuItem("Computer Science");
        i2=new JMenuItem("Computer Network");
        i3=new JMenuItem("IT World");
        i4=new JMenuItem("Web Development");
        i5=new JMenuItem("App Development");
        menu.add(i1); menu.add(i2); menu.add(i3);
        development.add(i4); development.add(i5);
        menu.add(development);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new MenuExample();
    }}